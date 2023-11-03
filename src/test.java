
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class test {
    public static void main(String[] args) throws IOException {
        while (true) {
            int byteIn = System.in.read();
            System.out.println(byteIn);

            System.out.println("----------------------------");
            InputStreamReader inputSymbols = new InputStreamReader(System.in);
            while (true) {
                int SymbolIn = inputSymbols.read();
                System.out.println(SymbolIn);

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    int buff = bufferedReader.read();
                    System.out.println(buff);
                }
            }
        }
    }

}