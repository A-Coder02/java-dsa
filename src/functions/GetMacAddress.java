package functions;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.io.FileWriter;
import java.io.IOException;

public class GetMacAddress {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);

            byte[] macAddress = network.getHardwareAddress();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < macAddress.length; i++) {
                sb.append(String.format("%02X%s", macAddress[i], (i < macAddress.length - 1) ? "-" : ""));
            }

            FileWriter fileWriter = new FileWriter("macAddress.txt");
            fileWriter.write("MAC Address: " + sb.toString());
            fileWriter.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}