import java.util.*;
import java.lang.*;

public class cookbook{
public static void main(String[] args){
  String[] master =  new String[4];

  /*
  public ArrayList<String> recipeName = new ArrayList<String>(); //what it is called
  public ArrayList<Int> timePrep = new ArrayList<Int>(); //integer in minutes
  public ArrayList<String> ingredients = new ArrayList<String>(); //what you need
  public ArrayList<String> directions = new ArrayList<String>(); //what you need to do
  */

  ArrayList<String> recipeName = new ArrayList<String>(); //what it is called
  ArrayList<Int> timePrep = new ArrayList<Int>(); //integer in minutes
  ArrayList<String> ingredients = new ArrayList<String>(); //what you need
  ArrayList<String> directions = new ArrayList<String>(); //what you need to do

  master [0] = recipeName; // stores the RN into position 0
  master [1] = timePrep;  //stores the TP into position 1
  master [2] = ingredients; //stores the I into position 2
  master [3] = directions; // stores the d into position 3

  recipeName.add("hard boiled egg");
  timePrep.add(10);
  ingredients.add("One egg, water" );
  directions.add("boil water, place in egg, leave for five minutes");

  recipeName.add("grilled cheese");
  timePrep.add(15);
  ingredients.add("two pieces of bread, one slice of cheese, 1oz butter" );
  directions.add("place butter in pan, place one slice of bread in pan, place cheese on bread and add next piece of bread on top, flip after golden brown, flip again after golden brown, remove after cheese has melted");

  recipeName.add("mac and cheese");
  timePrep.add(55);
  ingredients.add("4 cups dried macaroni, 1 whole egg, 1/2 stick (4 tablespoons) butter, 1/4 cup all-purpose flour, 2 1/2 cups whole milk, 2 heaping teaspoons dry mustard (more if desired), 1 pound sharp Cheddar, grated (not pre-grated cheese), plus more for baking, Salt" );
  directions.add("Preheat the oven to 350 degrees F., Cook the macaroni until still slightly firm. Drain and set aside., In a small bowl, beat the egg. In a large pot, melt the butter and sprinkle in the flour. Whisk together over medium-low heat. Cook for a couple of minutes, whisking constantly. Don't let it burn. Pour in the milk, add the mustard and whisk until smooth. Cook until very thick, about 5 minutes. Reduce the heat to low., Take 1/4 cup of the sauce and slowly pour it into the beaten egg, whisking constantly to avoid cooking the eggs. Whisk together until smooth. Pour the egg into the sauce, whisking constantly. Stir until smooth. Add in the cheese and stir to melt. Add 1/2 teaspoon salt, 1/2 teaspoon seasoned salt and the pepper. Add any additional spices if desired. Taste the sauce and add more salt and seasoned salt as needed! DO NOT UNDERSALT., Pour in the drained, cooked macaroni and stir to combine. Serve immediately (while it's still very creamy) or pour into a buttered baking dish, top with extra cheese and bake until bubbly and golden on top, 20 to 25 minutes.");

  recipeName.add("Mushroom Stroganoff");
  timePrep.add(30);
  ingredients.add("2 tablespoons olive oil, divided\n1 medium yellow onion, diced\n12 oz (340 g) cremini mushroom, sliced\n3 cloves garlic\n½ teaspoon dried thyme\n¼ teaspoon pepper\n½ teaspoon salt\n¼ cup (60 mL) dry white wine\n½ tablespoon vegan worcestershire\n¼ cup (30 g) flour\n2 cups (480 mL) vegetable broth\n1 ½ cups (360 mL) almond milk\n8 oz (225 g) fusilli pasta, uncooked fresh parsley, chopped, for serving, garnish" );
directions.add("In a large pot, heat 1 tablespoon of olive oil over medium heat. Once the oil begins to shimmer, add the onion and cook for 3-4 minutes, until semi-translucent.\nAdd the mushrooms and cook until most of the juices have evaporated.\nWith your spoon, make a space in the center of the pot. Drizzle in the remaining tablespoon of olive oil and add the garlic, thyme, pepper, and salt.\nCook for 2-3 minutes, until fragrant. Then, add the white wine and vegan Worcestershire sauce and stir until incorporated.\nAdd flour and stir until fully combined. Then add the vegetable broth, almond milk, and pasta, and stir until well-combined.\nCover and increase the heat to medium-high. Let cook for 10-15 minutes, or until the liquid is creamy and pasta is cooked.\nServe immediately, garnished with parsley.");

recipeName.add("One-Pot Bacon And Wild Mushroom Risotto");
timePrep.add(50);
ingredients.add("3 tablespoons olive oil\n1 medium onion, sliced\n5 strips bacon, diced\n8 oz (225 g) wild mushrooms, such as porcini or shiitake, sliced\n1 ½ cups (300 g) arborio rice\n½ cup (120 mL) dry white wine, such as Sauvignon Blanc\n5 cups (1.17 L) chicken broth\n½ cup (55 g) parmesan cheese, plus more for garnish" );
directions.add("In a 5-quart Dutch oven, heat the olive oil over medium heat.\nAdd the onion and cook 3-4 minutes until soft and slightly transparent.\nAdd the bacon and stir constantly until it starts to crisp.\nAdd the mushrooms and cook for an additional 2 minutes.\nAdd the arborio rice and cook for one minute, stirring constantly so the oil coats the grains.\nStir in the white wine and simmer 2-3 minutes, stirring occasionally.\nAdd one cup (235ml) of the chicken stock and simmer over\nmedium heat for about 5 minutes, stirring occasionally.\nOnce the rice absorbs most of the liquid, continue to add 1-2 cups (235-470ml) of stock at a time until the liquid is absorbed and the rice is cooked through, about 25-30 minutes total.\nNOTE: The risotto should be al dente and fall back in on itself when you run the spoon along the bottom of the pot.\nStir in the Parmesan cheese and remove from the heat.\nServe and garnish with extra Parmesan cheese.");


  public String addRecipe(){

    recipeName.add(newName);
    timePrep.add(newTime);
    ingredients.add(newI);
    directions.add(newD);

  }

  //public String removeRecipe

  public int searchTime(){
  System.out.println("Please enter the timePrep");
  Scanner scanscan3 = new Scanner(System.in);
  Int time = scan.nextLine();
  for(int i= 0; i < timePrep.size(); i++){  // search master [2] for ingredient
  if(time.equals(timePrep.get(i).getTimePrep() || time<timePrep){ // find what row position ingredient is in
    return( recipeName[i], timePrep[i], ingredients[i], directions[i]);   // return the all columns with the row position found
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
  if(name.contains(recipeName.get(i).getRecipeName()){ // find what row position name is in
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
  if(userIngredients.contains(ingredients.get(i).getRecipeName()){ // find what row position name is in
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
    Int newTime = scan3.nextLine();

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
