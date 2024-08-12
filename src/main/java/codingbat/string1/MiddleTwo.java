package codingbat.string1;

public class MiddleTwo {

    public String middleTwo(String str) {
        return str.length() == 2 ? str : str.substring((str.length() -1) / 2, ((str.length()- 1) / 2) + 2);
    }
}
