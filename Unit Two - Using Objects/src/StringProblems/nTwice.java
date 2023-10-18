package StringProblems;

public class nTwice {
    public static void main(String[] args) {
        String nTwice = "scissors";
        int n = 3;
        int length = nTwice.length();
        System.out.println(nTwice.substring(0, n) + nTwice.substring(length-n, length));   
    }
}