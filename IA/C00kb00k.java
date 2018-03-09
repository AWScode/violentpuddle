// my main class with hash map
import java.io.*;
import java.util.*;

public class C00kb00k{
  private HashMap<String, Recipe> cookList;  //hashmap of recipes

  public C00kb00k(){
    try{
      cookList= newHashMap<>();
      Scanner scan = new Scanner(new File ("recipe.txt"));
        while(scan.hasNext()){
          Recipe RE = new Recipe(input.nextInt(), input.next(), input.next(), input.next());
          cookList.put(RE.getName(), RE);
        }
        input.close();
    }
    catch(FileNotFoundException e){System.out.println("Recipe not found.");}
  }





}
