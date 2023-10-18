package StringProblems;

public class conCat {
    public static void main(String[] args) {
        String firstA = "alpha";
        String lastB = "beta";
        int length = lastB.length(); 
        System.out.println(firstA.substring(1) + lastB.substring(0, length-1));
    }
}
