import java.util.*;
import java.lang.*;

public class cookbook{

  ArrayList<Recipe> cookbook;

public MainCookbook(){

    ArrayList<Recipe> cookbook = new ArrayList<cookbook>(); //integer in minutes

  //this.cookbook = new ArrayList
  //Is this how I can add a recipe/
  Recipe egg = new Recipe;
  Recipe.add("hard boiled egg");
  Recipe.add("10");
  Recipe.add("One egg, water" );
  Recipe.add("boil water, place in egg, leave for five minutes");
  cookbook(0)= egg;

  Recipe gCheese = new Recipe;
  Recipe.add("grilled cheese");
  Recipe.add("15");
  Recipe.add("two pieces of bread, one slice of cheese, 1oz butter" );
  Recipe.add("place butter in pan, place one slice of bread in pan, place cheese on bread and add next piece of bread on top, flip after golden brown, flip again after golden brown, remove after cheese has melted");
  cookbook(1)= gCheese;

  Recipe macC = new Recipe;
  Recipe.add("mac and cheese");
  Recipe.add("55");
  Recipe.add("4 cups dried macaroni, 1 whole egg, 1/2 stick (4 tablespoons) butter, 1/4 cup all-purpose flour, 2 1/2 cups whole milk, 2 heaping teaspoons dry mustard (more if desired), 1 pound sharp Cheddar, grated (not pre-grated cheese), plus more for baking, Salt" );
  Recipe.add("Preheat the oven to 350 degrees F., Cook the macaroni until still slightly firm. Drain and set aside., In a small bowl, beat the egg. In a large pot, melt the butter and sprinkle in the flour. Whisk together over medium-low heat. Cook for a couple of minutes, whisking constantly. Don't let it burn. Pour in the milk, add the mustard and whisk until smooth. Cook until very thick, about 5 minutes. Reduce the heat to low., Take 1/4 cup of the sauce and slowly pour it into the beaten egg, whisking constantly to avoid cooking the eggs. Whisk together until smooth. Pour the egg into the sauce, whisking constantly. Stir until smooth. Add in the cheese and stir to melt. Add 1/2 teaspoon salt, 1/2 teaspoon seasoned salt and the pepper. Add any additional spices if desired. Taste the sauce and add more salt and seasoned salt as needed! DO NOT UNDERSALT., Pour in the drained, cooked macaroni and stir to combine. Serve immediately (while it's still very creamy) or pour into a buttered baking dish, top with extra cheese and bake until bubbly and golden on top, 20 to 25 minutes.");
  cookbook(2)= macC;

  Recipe strog = new Recipe;
  Recipe.add("Mushroom Stroganoff");
  Recipe.add("30");
  Recipe.add("2 tablespoons olive oil, divided\n1 medium yellow onion, diced\n12 oz (340 g) cremini mushroom, sliced\n3 cloves garlic\n½ teaspoon dried thyme\n¼ teaspoon pepper\n½ teaspoon salt\n¼ cup (60 mL) dry white wine\n½ tablespoon vegan worcestershire\n¼ cup (30 g) flour\n2 cups (480 mL) vegetable broth\n1 ½ cups (360 mL) almond milk\n8 oz (225 g) fusilli pasta, uncooked fresh parsley, chopped, for serving, garnish" );
  Recipe.add("In a large pot, heat 1 tablespoon of olive oil over medium heat. Once the oil begins to shimmer, add the onion and cook for 3-4 minutes, until semi-translucent.\nAdd the mushrooms and cook until most of the juices have evaporated.\nWith your spoon, make a space in the center of the pot. Drizzle in the remaining tablespoon of olive oil and add the garlic, thyme, pepper, and salt.\nCook for 2-3 minutes, until fragrant. Then, add the white wine and vegan Worcestershire sauce and stir until incorporated.\nAdd flour and stir until fully combined. Then add the vegetable broth, almond milk, and pasta, and stir until well-combined.\nCover and increase the heat to medium-high. Let cook for 10-15 minutes, or until the liquid is creamy and pasta is cooked.\nServe immediately, garnished with parsley.");
  cookbook(3)= strog;

  Recipe ris = new Recipe;
  Recipe.add("One-Pot Bacon And Wild Mushroom Risotto");
  Recipe.add("50");
  Recipe.add("3 tablespoons olive oil\n1 medium onion, sliced\n5 strips bacon, diced\n8 oz (225 g) wild mushrooms, such as porcini or shiitake, sliced\n1 ½ cups (300 g) arborio rice\n½ cup (120 mL) dry white wine, such as Sauvignon Blanc\n5 cups (1.17 L) chicken broth\n½ cup (55 g) parmesan cheese, plus more for garnish" );
  Recipe.add("In a 5-quart Dutch oven, heat the olive oil over medium heat.\nAdd the onion and cook 3-4 minutes until soft and slightly transparent.\nAdd the bacon and stir constantly until it starts to crisp.\nAdd the mushrooms and cook for an additional 2 minutes.\nAdd the arborio rice and cook for one minute, stirring constantly so the oil coats the grains.\nStir in the white wine and simmer 2-3 minutes, stirring occasionally.\nAdd one cup (235ml) of the chicken stock and simmer over\nmedium heat for about 5 minutes, stirring occasionally.\nOnce the rice absorbs most of the liquid, continue to add 1-2 cups (235-470ml) of stock at a time until the liquid is absorbed and the rice is cooked through, about 25-30 minutes total.\nNOTE: The risotto should be al dente and fall back in on itself when you run the spoon along the bottom of the pot.\nStir in the Parmesan cheese and remove from the heat.\nServe and garnish with extra Parmesan cheese.");
  cookbook(4)= ris;

}
  public void addRecipeNameList(Recipe name){
    Recipe.add(name);
  }
  public void addTimePrep(Recipe timePrep){
    Recipe.add(timePrep);
  }
  public void addDirections(Recipe ingredients){
    Recipe.add(ingredients);
  }
  public void addIngredients(Recipe directions){
    Recipe.add(directions);
  }
  publice void addRecipe(Recipe name, Recipe timePrep, Recipe ingredients, Recipe directions){
    Recipe.add(name);
    Recipe.add(timePrep);
    Recipe.add(ingredients);
    Recipe.add(directions);
    Recipe.add(Recipe);

  }

  //public String removeRecipe

  public String searchTime(String time){
  for(int i= 0; i < cookbook.size(); i++){  // search master [2] for ingredient
  if(time.equals(cookbook.get(i).getTimePrep())){ // find what row position ingredient is in
    return cookbook(i);   // return the recipe
}
}
}
public String searchName(String name1){
  for(int i= 0; i < cookbook.size(); i++){  // search master [0] for name
  if(name1.contains(recipeName.get(i).getName())){ // find what row position name is in
    return cookbook(i);    // return the recipe
  }
}
}

public String searchIngredients(String userIngredients){
  for(int i= 0; i < ingredients.size(); i++){  // search master [0] for name
  if(userIngredients.contains(ingredients.get(i))){ // find what row position name is in
      return cookbook(i); //return recipe
}
}
  }
