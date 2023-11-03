import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("temirlan.tostokov@gmail.com");
        emails.add("test@gmail.com");

        String reg = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(reg);

        for (String mail : emails) {
            Matcher matcher = pattern.matcher(mail);
            System.out.println(mail + " : " + matcher.matches());
        }
    }

}
