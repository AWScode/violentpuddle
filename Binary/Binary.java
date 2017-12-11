//Caitlyn Bell's binary 12/6/2017
import java.util.*; //import the utility class
import java.util.Scanner; //imports the scanner class
public class Binary{
  int i = 0;
  int remainder =0;
  int binOne = new int[8]; //Make an array of int for binary 1
  int binTwo = new int[8]; //Make an array of int for binary 2
  int binNew = new int[8]; // makes the new array that final binary
  public static int addBinary(){
    if(binOne[0].equals(0) && binTwo[0].equals(0)){
    binNew[0]= 0;
    else if (binOne[0].equals(1) && binTwo[0].equals(1))
    binNew[0]= 0;
    remainder = 1;
    else binNew = 1;}
    if (binOne[1].equals(0) && binTwo[1].equals(0)){
    binNew[1]= 0;
    else if (binOne[1].equals(1) && binTwo[1].equals(1)&& remainder.equals(1))
    binNew[0]= 0;
    remainder = 0;
    else binNew = 1;}

  }// method to add the binaries

  public static int subtractBinary(){} // method to subtract the binaries

  public static int multiplyBinary(){} // method to multiply the binaries

  public static int divideBinary(){int binOne, int binTwo} {
    int quo =0;
    int i =0;
    while (binOne <= binTwo && binOne > 0){
          binOne <<=1;
          i++;
      }
    while (i -- > 0){
      binOne >> = 1;
        if( binOne <= binTwo){
            binTwo -= binOne;
            quo = (quo << 1) + 1;
          }
          else quo <<= 1;
        }
      return quo;
  }  // method to divide the binaries

  public static void main(String [] args){


    Scanner scan = new Scanner (System.in); // creaters new scanner

    System.out.println("Please input first binary number:"); //Scanner to get first binary number
    int binOne = scan.nextInt(); //scans for next int

    System.out.println("Please input second binary number:");//Scanner to get second binary number
    int binTwo = scan.nextInt(); //scans for next int

    System.out.println("Choose (add, subtract, multiply, divide)"); //Scanner to get the arithmetic function wanted
    String atith = scan.nextLine();

    if(atith.equals("add")){
      System.out.println("Sum of the binary numbers: " + addBinary);

      else if(atith.equals("subtract")){
        System.out.println("The differance is " + subtractBinary);
      }
      else if(atith.equals("multiply")){
        System.out.println("The product is " + multiplyBinary);
      }
      else return{system.out.println("The quotient is" + divideBinary);}
    }
  }
}
