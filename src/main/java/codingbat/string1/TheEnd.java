package codingbat.string1;

public class TheEnd {

    public String theEnd(String str, boolean front) {
        if (str.length() > 1) {
            if (front) {
                return str.substring(0, 1);
            }else {
                return str.substring(str.length() - 1);
            }
        }
        return str;
    }
}
