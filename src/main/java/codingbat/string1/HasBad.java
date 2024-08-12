package codingbat.string1;

public class HasBad {

    public boolean hasBad(String str) {
        if (str == "") {
            return false;
        } else return str.startsWith("bad") || str.substring(1).startsWith("bad");
    }
}
