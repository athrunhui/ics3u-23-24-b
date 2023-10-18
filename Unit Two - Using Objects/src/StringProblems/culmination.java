package StringProblems;

import java.util.Scanner;

public class culmination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem1 = "1) makeOutWord, ";
        String problem2 = "2) firstHalf, ";
        String problem3 = "3) withoutEnd, ";
        String problem4 = "4) comboString, ";
        String problem5 = "5) nonStart, ";
        String problem6 = "6) left2, ";
        String problem7 = "7) right2, ";
        String problem8 = "8) withoutEnd2, ";
        String problem9 = "9) middleTwo, ";
        String problem10 = "10) nTwice, ";
        String problem11 = "11) twoChar, ";
        String problem12 = "12) middleThree, ";
        String problem13 = "13) atFirst, ";
        String problem14 = "14) lastChars, ";
        String problem15 = "15) conCat.";

        System.out.println("The problems are: " + problem1 + problem2 + problem3 + problem4 +
        problem5 + problem6);
        System.out.println(problem7 + problem8 + problem9 + problem10 + problem11 + 
        problem12 + problem13); 
        System.out.println(problem14 + problem15);

        System.out.print("Please write the number a String Problem (e.g. 1): ");
        int problem = in.nextInt();
        System.out.println(problem);

        if(problem == 1) {
            System.out.print("Please enter a word: ");
            while(!in.hasNext());
            String newword = in.nextLine();
            System.out.println(newword);
            //if(in.hasNext()){
              
            //}     
            /*String brackets = "(())";
            System.out.println(word);
            //System.out.println(brackets.substring(0,2) + word + brackets.substring(2));
        } else {
            System.out.println("Please reenter a problem");
            System.out.println(problem + " ");*/
        }
    }
}
