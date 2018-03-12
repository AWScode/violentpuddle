import java.util.*;
import java.lang.*;

public class cookbook{
public static void main(String[] args){
  String[] master =  new String[4];

  public ArrayList<String> recipeName = new ArrayList<String>(); //what it is called
  public ArrayList<String> timePrep = new ArrayList<Int>(); //integer in minutes
  public ArrayList<String> ingredients = new ArrayList<String>(); //what you need
  public ArrayList<String> directions = new ArrayList<String>(); //what you need to do

  master [0] = recipeName; // stores the RN into position 0
  master [1] = timePrep;  //stores the TP into position 1
  master [2] = ingredients; //stores the I into position 2
  master [3] = directions; // stores the d into position 3

  public String addRecipe(){
    System.out.println("Please enter the recipe name.");
    Scanner scan2 = new Scanner(System.in);
    String newName = scan2.nextLine();
    recipeName.add(newName);

    System.out.println("Please enter the time prep.");
    Scanner scan3 = new Scanner(System.in);
    String newTime = scan3.nextLine();
    timePrep.add(newTime);

    System.out.println("Please enter the ingredient list." );
    Scanner scan4 = new Scanner(System.in);
    String newI = scan4.nextLine();
    ingredients.add(newI);

    System.out.println("Please enter the directions.");
    Scanner scan5 = new Scanner(System.in);
    String newD = scan5.nextLine();
    directions.add(newD);

    System.out.println("New recipe has been added.");
  }

  public String searchTime(){
  System.out.println("Please enter the timePrep");
  Scanner scanscan3 = new Scanner(System.in);
  String time = scan.nextLine();
  for(int i= 0; i < timePrep.size(); i++){  // search master [2] for ingredient
  if(time.equals(timePrep.get(i).getTimePrep()){ // find what row position ingredient is in
    return( recipeName[i], timePrep[i], getIngredients[i], getDirections[i]);   // return the all columns with the row position found
}
else
  System.out.println("No recipe has a time prep of " + time + ".")
}
}

public String searchName(){
  System.out.println("Please enter the recipe name.");
  Scanner scan1 = new Scanner(System.in);
  String name = scanscan1.nextLine();
  for(int i= 0; i < recipeName.size(); i++){  // search master [0] for name
  if(name.equals(recipeName.get(i).getRecipeName()){ // find what row position name is in
    return( recipeName[i], timePrep[i], getIngredients[i], getDirections[i]);   // return the all columns with the row position found
  }
  else
  System.out.println(name + " is not in the cookbook");
}
}

public String searchIngredients(){
  System.out.println("Please enter the ingredient");
  Scanner scanscan2 = new Scanner(System.in);
  String userIngredients = scan.nextLine();

  for(int i= 0; i < ingredients.size(); i++){  // search master [0] for name
  if(userIngredients.equals(ingredients.get(i).getRecipeName()){ // find what row position name is in
    return( recipeName[i], timePrep[i], getIngredients[i], getDirections[i]);   // return the all columns with the row position found
  }
  else
  System.out.println("No recipe has " + userIngredients + ".");
}
}

  System.out.println("Hungry? \n Would you like to: Enter \"Add new recipe\" or \"Find a recipe\" ." );
  Scanner scan = new Scanner(System.in);
  String cat = scan.nextLine(); //cat represents what the user enters

  if(cat.equals("Add new recipe")){
    System.out.println("Please enter the recipe name.");
    Scanner scan2 = new Scanner(System.in);
    String newName = scan2.nextLine();

    System.out.println("Please enter the time prep.");
    Scanner scan3 = new Scanner(System.in);
    String newTime = scan3.nextLine();

    System.out.println("Please enter the ingredient list." );
    Scanner scan4 = new Scanner(System.in);
    String newI = scan4.nextLine();

    System.out.println("Please enter the directions.");
    Scanner scan5 = new Scanner(System.in);
    String newD = scan5.nextLine();


    return (System.out.println("New recipe has been added.")); 
  }
  else if(cat.equals("Find a recipe")){
    System.out.println(" \n Would you like to: Enter \"search by recipe name\" or \"search by time prep\" or \"search by ingredients\" ? ");
    Scanner scanscan = new Scanner(System.in);
    String dog = scan.nextLine(); // dog represents what they are searching by

    if(dog.equals("search by recipe name")){
      System.out.println("Please enter the name of the recipe");
      Scanner scanscan1 = new Scanner(System.in);
      String name = scan.nextLine();

      return ("x"); // this is a filler to compile code FIX
    }
    if(dog.equals("search by time prep")){
      System.out.println("The recipe you are looking for is " + searchName "." );

    }
    if (dog.equals("search by ingredients")){
      System.out.println("Please enter the ingredient");
      Scanner scanscan3 = new Scanner(System.in);
      String userIngredients = scan.nextLine();

    }
    }

  }

}
