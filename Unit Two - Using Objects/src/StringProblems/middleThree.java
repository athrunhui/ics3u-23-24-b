package StringProblems;

public class middleThree {
    public static void main(String[] args) {
        String middleThree = "mathematics";
        int length = middleThree.length();
        System.out.println(middleThree.substring(length/2-1, length/2+2));
    }
}
