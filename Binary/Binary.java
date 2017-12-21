//Caitlyn Bell's binary 12/6/2017
import java.util.Scanner; //imports the scanner class
public class Binary{
  long binOne, binTwo;
  int i = 0, rem = 0;
  public static long addBinary(long binOne, long binTwo, int i, int rem){
    while (binary1 != 0 || binary2 != 0)
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");
 }
  }// method to add the binaries

  public static long subtractBinary(long a, long b){// method to subtract the binaries
    System.out.println(a + "first val :" + b);
         int a1 = (int) a;
         int b1 = (int) b;
         String s1 = Integer.toString(a1);
         String s2 = Integer.toString(b1);
         int number0 = Integer.parseInt(s1, 2);
         int number1 = Integer.parseInt(s2, 2);

         int sum = number0 - number1;
         String s3 = Integer.toBinaryString(sum);

         return s3;
  }

  public static long multiplyBinary(long binOne, long binTwo, int i, int rem){
    while (binary2 != 0)
    {
     digit = (int)(binary2 % 10);
     if (digit == 1)
     {
      binary1 = binary1 * factor;
      multiply = binaryproduct((int) binary1, (int) multiply);
     }
     else
     {
      binary1 = binary1 * factor;
     }
     binary2 = binary2 / 10;
     factor = 10;
    }
    System.out.print("Product of two binary numbers: " + multiply+"\n");
   }
   static int binaryproduct(int binary1, int binary2)
   {
    int i = 0, remainder = 0;
    int[] sum = new int[20];
    int binary_prod_result = 0;

    while (binary1 != 0 || binary2 != 0)
    {
     sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
     remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
     binary1 = binary1 / 10;
     binary2 = binary2 / 10;
    }
    if (remainder != 0)
    {
     sum[i++] = remainder;
    }
    --i;
    while (i >= 0)
    {
     binary_prod_result = binary_prod_result * 10 + sum[i--];
    }
    return binary_prod_result;
 } // method to multiply the binaries


  public static long divideBinary(long a, long b) {
    System.out.println(a + "first val :" + b);
       int a1 = (int) a;
       int b1 = (int) b;
       String s1 = Integer.toString(a1);
       String s2 = Integer.toString(b1);
       int number0 = Integer.parseInt(s1, 2);
       int number1 = Integer.parseInt(s2, 2);

       int sum = number0 / number1;
       String quo = Integer.toBinaryString(sum);

       return quo;
  }  // method to divide the binaries
  public static void main(String [] args){

    Scanner scan = new Scanner(System.in); // creaters new scannerm
    System.out.print
    System.out.println("Please input first binary number:"); //Scanner to get first binary number
    long binOne = scan.nextLong(); //scans for next int
    System.out.println("Please input second binary number:");//Scanner to get second binary number
    long binTwo = scan.nextLong(); //scans for next int
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
