//Caitlyn Bell's palidrome 10/20/2017
import java.util.*;


public class Palindrome {
    public static boolean palindromeCheck(String test) {
      String word[] = "Racecar".split(" ");
      String pali= null;
      for(int i = word.length-1; i>= 0 ;i--){
          pali += word[i] +" ";
          if(word.equals(pali)){
              return true;}
}
          else {return false;}
}
}
    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }

    }

}
