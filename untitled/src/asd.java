import com.AvayaVPServices;
import com.AvayaVoicePortalServicesWS;
import com.CODAInternalFailure_Exception;
import com.CbossException_Exception;

public class asd {


    public static void main(String[] args) throws CbossException_Exception, CODAInternalFailure_Exception {
        AvayaVPServices ss = new AvayaVPServices();
        AvayaVoicePortalServicesWS port = ss.getAvayaVoicePortalServicesWSPort();

        System.out.println(port.getBalanceAVP("1234"));

    }
}
