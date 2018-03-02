import java.util.*;
import java.lang.*;

public class cookbook{
// how do I put all of these arrays into one array of recipes?
  String[] master =  new String[4];

  public ArrayList<String> recipeName = new ArrayList<String>(); //what it is called
  public ArrayList<String> timePrep = new ArrayList<Int>(); //integer in minutes
  public ArrayList<String> ingredients = new ArrayList<String>(); //what you need
  public ArrayList<String> directions = new ArrayList<String>(); //what you need to do

  master [0] = recipeName; // stores the RN into position 0
  master [1] = timePrep;  //stores the TP into position 1
  master [2] = ingredients; //stores the I into position 2
  master [3] = directions; // stores the d into position 3

public void setRecipeName(ArrayList<String> recipeName){
  this.recipeName = recipeName;
}
public void setTimePrep(ArrayList<Int> timePrep){
  this.timePrep = timePrep;
}
public void setIngredients(ArrayList<String> ingredients){
  this.ingredients = ingredients;
}
public void setDirections(ArrayList<String> directions){
  this.directions = directions;
}
public String getRecipeName(int i){
  return recipeName.get(i);
}
public String getTimePrep(int i){
  return timePrep.get(i);
}
public String getIngredients(int i){
  return ingredients.get(i);
}
public String getDirections(int i){
  return directions.get(i);
}
public static void main(String[] args){
  System.out.println("Hungry? \n Would you like to: Enter \"Add new recipe\" or \"Find a recipe\" ." );
  Scanner scan = new Scanner(System.in);
  String cat = scan.nextLine(); //cat represents what the user enters

  if(cat.equals("Add new recipe")){
    System.out.println("Please enter the recipe name.");
    Scanner scan2 = new Scanner(System.in);
    String recipeName[i] = scan2.nextLine(); // does saying [i] make it all the same position

    System.out.println("Please enter the time prep.");
    Scanner scan3 = new Scanner(System.in);
    String timePrep[i] = scan3.nextLine();

    System.out.println("Please enter the ingredient list." );
    Scanner scan4 = new Scanner(System.in);
    String ingredients[i] = scan4.nextLine();

    System.out.println("Please enter the directions.");
    Scanner scan5 = new Scanner(System.in);
    String directions[i] = scan5.nextLine();
  }
  if(cat.equals("Find a recipe")){
    System.out.println(" \n Would you like to: Enter \"search by recipe name\" or \"search by time prep\" or \"search by ingredients\" ? ");
    Scanner scanscan = new Scanner(System.in);
    String dog = scan.nextLine(); // dog represents what they are searching by

    if(dog.equals("search by recipe name")){
      System.out.println("Please enter the name of the recipe");
      Scanner scanscan1 = new Scanner(System.in);
      String name = scan.nextLine();
      // search master [0] for name
      // find what row position name is in
      // return the all columns with the row position found
      return ("x"); // this is a filler to compile code FIX
    }
    if(dog.equals("search by time prep")){
      System.out.println("Please enter the time prep");
      Scanner scanscan2 = new Scanner(System.in);
      String time = scan.nextLine();
      // search master [1] for time
      // find what row position time is in
      // return all the columns with the row position found
      return ("x"); // this is a filler to compile code FIX
    }
    if (dog.equals("search by ingredients")){
      System.out.println("Please enter the ingredient");
      Scanner scanscan3 = new Scanner(System.in);
      String userIngredients = scan.nextLine();
      //this would be cool if I could search for multiple ingredients but IDK how
      // search master [2] for userIngredients
      //find what row position userIngredients is in
      //return all the columns with the row position found
    return ("x"); // this is a filler to compile code FIX 
    }
    }
return ("grilled cheese, 10 minutes, 1 piece of cheese and 2 pieces of bread, heat stove and place bread on stove until golden brown flip twice");
  }

}
}
