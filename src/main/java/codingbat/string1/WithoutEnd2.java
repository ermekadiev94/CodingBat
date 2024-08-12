package codingbat.string1;

public class WithoutEnd2 {

    public String withouEnd2(String str) {
        return (str.length() == 0 || str.length() == 2 || str.length() == 1) ? "" : str.substring(1, str.length() - 1);
        }
    }

