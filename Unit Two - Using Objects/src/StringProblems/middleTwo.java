package StringProblems;

public class middleTwo {
    public static void main(String[] args) {
        String evenString = "monitors";
        int length = evenString.length();
        System.out.println(evenString.substring(length/2-1, length/2+1));
    }
}
