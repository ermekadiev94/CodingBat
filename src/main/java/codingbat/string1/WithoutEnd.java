package codingbat.string1;

public class WithoutEnd {

    public String withoutEnd(String str) {
        return str.length() == 2 ? "" : str.substring(1, str.length() - 1);
    }
}
