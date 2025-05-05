import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String regex = "^[CAP]\\d{4}[GHIK]$";

    public ValidateClass() {
    }

    public boolean validate(String className) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
