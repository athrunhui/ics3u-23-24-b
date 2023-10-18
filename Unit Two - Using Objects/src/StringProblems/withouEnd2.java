package StringProblems;

public class withouEnd2 {
    public static void main(String[] args) {
        String startend = "behaviour";
        int length = startend.length();
        System.out.println(startend.substring(0, 1) + startend.substring(length-1));
    }
}
