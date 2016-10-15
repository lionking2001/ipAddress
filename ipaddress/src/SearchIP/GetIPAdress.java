package SearchIP;
import java.net.*;
/**
 * Created by Administrator on 15/10/2559.
 */
public class GetIPAdress {
    public static void main(String[] args){
        InetAddress host;
        try{
            host = InetAddress.getLocalHost();
            System.out.println("IP address is"+host);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
