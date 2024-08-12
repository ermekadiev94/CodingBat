package codingbat.string1;

public class FirstHalf {

    public String firstHalf(String str) {
        return str.length() < 2 ? str : str.substring(0, str.length() / 2);
    }
}
