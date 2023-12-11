import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class Main {
    //вычисление своего айпи адреса пк
    public static void main(String[] args) throws Exception {

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("System IP Address: " + (localHost.getHostAddress()).trim());
        String systemIPAddress = "";
        try {
            URL url_name = new URL("http://bot.whatismyipaddress.com");
            BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));
            systemIPAddress = sc.readLine().trim();
        } catch (Exception e) {
            systemIPAddress = "Невозможно выполнить должным образом";
        }
        System.out.println("Public IP Address: " + systemIPAddress + "\n");
    }

}