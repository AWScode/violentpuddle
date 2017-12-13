//Caitlyn Bell's binary 12/6/2017
import java.util.Scanner; //imports the scanner class
public class Binary{
  public static void main(String [] args){
    long binOne, binTwo;
    int i = 0, rem = 0;
    Scanner scan = new Scanner(System.in); // creaters new scannerm
    System.out.print
    System.out.println("Please input first binary number:"); //Scanner to get first binary number
    long binOne = scan.nextLong(); //scans for next int
    System.out.println("Please input second binary number:");//Scanner to get second binary number
    long binTwo = scan.nextLong(); //scans for next int
  public static long addBinary(long binOne, long binTwo, int i, int rem){
    int[] sum = new int[20];
    while (binOne !0 || binTwo != 0){
      sum[i++] = (int)((binOne % 10 + binTwo % 10 + rem)% 2); // goes from the last digit to check the sum
      rem = (int)((binOne % 10 + binTwo % 10 + rem)/ 2); // if it is 1 and 1 then sets it to 0 and carries the 1
      binOne = binOne / 10;
      binTwo = binTwo / 10;
    } //this bit is the algorithym for addition(the one we learned in class)
    if (rem != 0){
      sum[i++] = rem; }
      --i;
  }// method to add the binaries

  public static long subtractBinary(long binOne, long binTwo, int i, int rem){// method to subtract the binaries
  int[] diff = new int[20];
  while (binOne !0 || binTwo != 0){
    diff[i++] = (int)((binOne % 10 + (binTwo* -1) % 10 + rem)% 2); // goes from the last digit to check the sum
    rem = (int)((binOne % 10 + (binTwo*-1) % 10 + rem)/ 2); // if it is 1 and 1 then sets it to 0 and carries the 1
    binOne = binOne / 10;
    binTwo = binTwo / 10;
  } //this is the inverse of the addition method
  if (rem != 0){
    diff[i++] = rem; }
    --i;
  }

  public static long multiplyBinary(long binOne, long binTwo, int i, int rem){
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

  public static long divideBinary(long binOne, long binTwo, int i, int rem) {
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
