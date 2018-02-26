import java.util.*;
import java.lang.*;

public class cookbook{
// how do I put all of these arrays into one array of recipes?
  public ArrayList<String> recipeName = new ArrayList<String>(); //what it is called
  public ArrayList<Int> timePrep = new ArrayList<Int>(); //integer in minutes
  public ArrayList<String> ingredients = new ArrayList<String>(); //what you need
  public ArrayList<String> directions = new ArrayList<String>(); //what you need to do

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
public Int getTimePrep(int i){
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
    String recipeName = scan2.nextLine();

    System.out.println("Please enter the time prep.");
    Scanner scan3 = new Scanner(System.in);
    String timePrep = scan3.nextLine();

    System.out.println("Please enter the ingredient list." );
    Scanner scan4 = new Scanner(System.in);
    String ingredients = scan4.nextLine();

    System.out.println("Please enter the directions.");
    Scanner scan5 = new Scanner(System.in);
    String directions = scan5.nextLine();
  }
  if(cat.equals("Find a recipe")){
    System.out.println(" \n Would you like to: Enter \"search by recipe name\" or \"Search by time prep\" or \"Search by ingredients\" ? ");
    Scanner scanscan = new Scanner(System.in);
    S
  }
}
}
