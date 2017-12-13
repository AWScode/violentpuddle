//Caitlyn Bell's binary 12/6/2017
import java.util.*; //import the utility class
import java.util.Scanner; //imports the scanner class
public class Binary{
    long binOne, binTwo;
    int i = 0, rem = 0;
    Scanner scan = new Scanner (System.in); // creaters new scanner
    System.out.println("Please input first binary number:"); //Scanner to get first binary number
    long binOne = scan.nextLong(); //scans for next int
    System.out.println("Please input second binary number:");//Scanner to get second binary number
    long binTwo = scan.nextLong(); //scans for next int
  public static long addBinary(long binOne, long binTwo, int i, int rem){
    int[] sum = new int[20];
    while (binOne !0 || binTwo != 0){
      sum[i++] = (int)((binOne % 10 + binTwo % 10 + rem)% 2); // takes the binary and puts it into decimal
      rem = (int)((binOne % 10 + binTwo % 10 + rem)/ 2);
      binOne = binOne / 10;
      binTwo = binTwo / 10;
    }
    if (rem != 0){
      sum[i++] = rem; }
      --i;
  }// method to add the binaries

  public static long subtractBinary(){} // method to subtract the binaries


  public static long multiplyBinary(long binOne, long binTwo){
  long multiply = 0;
  int digit, factor = 1;
  while (binTwo != 0)
  {
   digit = (int)(binTwo % 10);
   if (digit == 1)
   {
    binOne = binOne * factor;
    multiply = addBinary((int) binOne, (int) multiply);
   } 
   else
   {
    binOne = binOne * factor;
   }
   binTwo = binTwo / 10;
   factor = 10;
  }
 } // method to multiply the binaries

  public static long divideBinary(){long binOne, long binTwo, int i} {
    int quo =0;
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
