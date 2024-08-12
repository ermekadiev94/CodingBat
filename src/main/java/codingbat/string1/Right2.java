package codingbat.string1;

public class Right2 {

    public String right2(String str) {
        return str.length() <= 2 ? str : str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
