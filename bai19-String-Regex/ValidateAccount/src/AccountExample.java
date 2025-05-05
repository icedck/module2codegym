import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String regex = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String account) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
