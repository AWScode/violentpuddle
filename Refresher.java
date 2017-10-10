//Anna and Caitlyn September 27, 2017
import java.util.Scanner; //imports the scanner class
import java.io.*; // improts the txt file reader class, I used http://javaconceptoftheday.com/find-most-repeated-word-in-text-file-in-java/ as a resource
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Refresher{ // create the Refresher class
public static void main(String[]args){ //creates the main method

  //Creating wordCountMap which holds words as keys and their occurrences as values

HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
 BufferedReader reader = null;
try
       {
  //Creating BufferedReader object
reader = new BufferedReader(new FileReader("topics.txt"));
            //Reading the first line into currentLine
            String currentLine = reader.readLine();

           while (currentLine != null)
           {
               //splitting the currentLine into words

               String[] words = currentLine.toLowerCase().split(" ");

               //going through each word

               for (String word : words)
               {
                   //if word is already present in wordCountMap, updating its count

                   if(wordCountMap.containsKey(word))
                   {
                       wordCountMap.put(word, wordCountMap.get(word)+1);
                   }

                   //otherwise inserting the word as key and 1 as its value
                   else
                   {
                       wordCountMap.put(word, 1);
                   }
               }

               //Reading next line into currentLine

               currentLine = reader.readLine();
           }

           //Getting the low risk

           String lowRisk = null;

           int count = 0;

           Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();

           for (Entry<String, Integer> entry : entrySet)
           {
               if(entry.getValue() > count)
               {
                   lowRisk = entry.getKey();
                   count = entry.getValue();
               }
           }
           // Getting the high risk
           String highRisk = null;
 for (Entry<String, Integer> entry : entrySet)
           {
               if(entry.getValue() < count)
               {
                   highRisk = entry.getKey();
                   count = entry.getValue();
               }
           }


           System.out.println("Hey pal! What would you like to discuss today?(choose: low risk, high risk, not today, or new-topic)");
           Scanner scan = new Scanner (System.in); // creaters new scanner
           String riskLevel = scan.nextLine(); // creates object that is scanned
           
           if(riskLevel.equals("low risk")){
             System.out.println("Have you heard anything new about " + lowRisk + "?");
             System.out.println("Wow, very interesting. Can we talk more after work?");
           }
           else if (riskLevel.equals("high risk")){
            System.out.println("How are you feeling about " + highRisk + "?");
            System.out.println("Wow, very interesting. Can we talk more after work?");
           }
           else if (riskLevel.equals("new-topic")){
             System.out.println("Have you heard about the new alien civilization?");
             System.out.println("Wow, very interesting. Can we talk more after work?");
           }
           else if (riskLevel.equals("not today")){
             System.out.println("Hey where are you going?");
           }

       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       finally
       {
           try
           {
               reader.close();           //Closing the reader
           }
           catch (IOException e)
           {
               e.printStackTrace();
           }
       }

}
}
