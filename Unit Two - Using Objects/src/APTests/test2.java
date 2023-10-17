package APTests;

public class test2 {
    public static void main(String[] args) {
        String a = "ABCDEF";
        String newa = a.substring(1,3) + a.substring(4);
        System.out.println(newa);

        String temp = "comp";
        System.out.println(temp.substring(0) + " " + temp.substring(1) + " " +
        temp.substring(2) + " " + temp.substring(3));
        
        String str = "CompSci";
        System.out.println(str.substring(0, 3));
        int num = str.length();
        System.out.println(num);
    }
}
