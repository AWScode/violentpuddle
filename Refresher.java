//Anna and Caitlyn September 27, 2017
import java.util.Scanner; //imports the scanner class
import java.io.*; // improts the txt file reader class, I used https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html as a resource
public class Refresher{ // create the Refresher class
public static void main(String[]args){ //creates the main method
String topicFile = "topics.txt"; //this is the name of the file as an object
try {
FileReader fileFun = new FileReader(topicFile); // reads the inputted file in encoding
BufferedReader bufferedFun = new BufferedReader(fileFun); //wraps the inputed file to be read
//while ((line = bufferedFun.readLine()) != null)
bufferedFun.close(); //closing the file
}
catch(FileNotFoundException ex)




System.out.println("Hey pal! What would you like to discuss today?(choose: low risk, high risk, or new-topic)");
