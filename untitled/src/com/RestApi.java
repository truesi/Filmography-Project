package com;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public abstract class RestApi {

    protected String doGetRequest(URL url) throws IOException {
        return doGetRequest(url, null);
    }

    protected String doGetRequest(URL url, Map<String, String> headers) throws IOException {
        HttpURLConnection httpURLConnection = this.getConnection(url);
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestMethod("GET");

        if (headers != null) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                httpURLConnection.setRequestProperty(header.getKey(), header.getValue());
            }
        }

        return readStream(httpURLConnection);
    }


    protected HttpURLConnection getConnection(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        byte[] message = ("avaya_voiceport_user:fdfz.pth").getBytes("UTF-8");
        httpURLConnection.setRequestProperty("Authorization", "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(message));
        return httpURLConnection;
    }

    protected String readStream(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        if (httpURLConnection.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST) {
            inputStream = httpURLConnection.getInputStream();
        } else {
            inputStream = httpURLConnection.getErrorStream();
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer stringBuffer = new StringBuffer();
        while (bufferedReader.ready()) {
            stringBuffer.append(bufferedReader.readLine());
        }
        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_INTERNAL_ERROR) {
            throw new IOException(stringBuffer.toString());
        }
        return stringBuffer.toString();
    }

    private int doPutRequest(URL url) throws IOException {
        HttpURLConnection httpURLConnection = this.getConnection(url);
        httpURLConnection.setRequestMethod("PUT");
        return httpURLConnection.getResponseCode();
    }

    private String doPostRequest(URL url, String data) throws IOException {
        HttpURLConnection httpURLConnection = this.getConnection(url);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);

        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.writeBytes(data);
        dataOutputStream.flush();
        dataOutputStream.close();

        return readStream(httpURLConnection);
    }

    private int doDeleteRequest(URL url) throws IOException {
        HttpURLConnection httpURLConnection = this.getConnection(url);
        httpURLConnection.setRequestMethod("DELETE");
        return httpURLConnection.getResponseCode();
    }

}
