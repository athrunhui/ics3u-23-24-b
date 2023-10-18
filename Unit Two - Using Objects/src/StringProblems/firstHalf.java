package StringProblems;

public class firstHalf {
    public static void main(String[] args) {
        String newWord = "teapot";
        int num = newWord.length();
        int newLength = num / 2;
        System.out.println(newWord.substring(0, newLength));

    }
}
