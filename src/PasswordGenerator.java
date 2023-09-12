import java.util.Random;

public class PasswordGenerator {
    public static String generatorPassword(int length,String characters){
        //генератор рандомных паролей
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
    public static void main(String[] args){
        String characters = "535353532343243254354354345376568798-8";
        int length = 4;
        System.out.println("Password: " + generatorPassword(length,characters));
    }
}
