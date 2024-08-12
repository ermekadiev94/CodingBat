package codingbat.string1;

public class NonStart {

    public String nonStart(String a, String b) {
        if (a.length() > 1 || b.length() > 1) {
            return a.substring(1).concat(b.substring(1));
        } else if (a.length() == 1) {
            a = "";
            if (b.length() > 1) {
               return a.concat(b.substring(1));
            }
        } else if (b.length() == 1) {
            b = "";
            if (a.length() > 1) {
                return a.substring(1).concat(b);
            }
        }
        return "";
    }
}
