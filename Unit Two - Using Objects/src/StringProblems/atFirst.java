package StringProblems;

public class atFirst {
    public static void main(String[] args) {
        String atFirst = "t";
        int length = atFirst.length();
        if(length<2){
            System.out.println(atFirst + "a");
        } else {
            System.out.println(atFirst.substring(0, 2));
        }
    }
}
