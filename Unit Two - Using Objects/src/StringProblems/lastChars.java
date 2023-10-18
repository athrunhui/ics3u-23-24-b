package StringProblems;

public class lastChars {
    public static void main(String[] args) {
        String firstChar = "oops";
        String lastChar = "daze";
        int length = lastChar.length();
        System.out.println(firstChar.substring(0, 1) + lastChar.substring(length-1, length));;
    }
}
