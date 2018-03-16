import java.lang.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;

public class MainCookbook{

  ArrayList<Recipe> cookbook;

public MainCookbook(){

    ArrayList<Recipe> cookbook = new ArrayList<cookbook>(); //integer in minutes

  //this.cookbook = new ArrayList
  //Is this how I can add a recipe/
  Recipe egg = new Recipe("hard boiled egg","10", "One egg, water", "boil water, place in egg, leave for five minutes");
  cookbook.add(egg);

  Recipe gCheese = new Recipe("grilled cheese","15", "two pieces of bread, one slice of cheese, 1oz butter", "place butter in pan, place one slice of bread in pan, place cheese on bread and add next piece of bread on top, flip after golden brown, flip again after golden brown, remove after cheese has melted");
  cookbook.add(gCheese);

  Recipe macC = new Recipe("mac and cheese","55", "4 cups dried macaroni, 1 whole egg, 1/2 stick (4 tablespoons) butter, 1/4 cup all-purpose flour, 2 1/2 cups whole milk, 2 heaping teaspoons dry mustard (more if desired), 1 pound sharp Cheddar, grated (not pre-grated cheese), plus more for baking, Salt", "Preheat the oven to 350 degrees F., Cook the macaroni until still slightly firm. Drain and set aside., In a small bowl, beat the egg. In a large pot, melt the butter and sprinkle in the flour. Whisk together over medium-low heat. Cook for a couple of minutes, whisking constantly. Don't let it burn. Pour in the milk, add the mustard and whisk until smooth. Cook until very thick, about 5 minutes. Reduce the heat to low., Take 1/4 cup of the sauce and slowly pour it into the beaten egg, whisking constantly to avoid cooking the eggs. Whisk together until smooth. Pour the egg into the sauce, whisking constantly. Stir until smooth. Add in the cheese and stir to melt. Add 1/2 teaspoon salt, 1/2 teaspoon seasoned salt and the pepper. Add any additional spices if desired. Taste the sauce and add more salt and seasoned salt as needed! DO NOT UNDERSALT., Pour in the drained, cooked macaroni and stir to combine. Serve immediately (while it's still very creamy) or pour into a buttered baking dish, top with extra cheese and bake until bubbly and golden on top, 20 to 25 minutes.");
  cookbook.add(macC);

  Recipe strog = new Recipe("Mushroom Stroganoff","30", "2 tablespoons olive oil, divided\n1 medium yellow onion, diced\n12 oz (340 g) cremini mushroom, sliced\n3 cloves garlic\n½ teaspoon dried thyme\n¼ teaspoon pepper\n½ teaspoon salt\n¼ cup (60 mL) dry white wine\n½ tablespoon vegan worcestershire\n¼ cup (30 g) flour\n2 cups (480 mL) vegetable broth\n1 ½ cups (360 mL) almond milk\n8 oz (225 g) fusilli pasta, uncooked fresh parsley, chopped, for serving, garnish", "In a large pot, heat 1 tablespoon of olive oil over medium heat. Once the oil begins to shimmer, add the onion and cook for 3-4 minutes, until semi-translucent.\nAdd the mushrooms and cook until most of the juices have evaporated.\nWith your spoon, make a space in the center of the pot. Drizzle in the remaining tablespoon of olive oil and add the garlic, thyme, pepper, and salt.\nCook for 2-3 minutes, until fragrant. Then, add the white wine and vegan Worcestershire sauce and stir until incorporated.\nAdd flour and stir until fully combined. Then add the vegetable broth, almond milk, and pasta, and stir until well-combined.\nCover and increase the heat to medium-high. Let cook for 10-15 minutes, or until the liquid is creamy and pasta is cooked.\nServe immediately, garnished with parsley.");
  cookbook.add(strog);

  Recipe ris = new Recipe("One-Pot Bacon And Wild Mushroom Risotto","50", "3 tablespoons olive oil\n1 medium onion, sliced\n5 strips bacon, diced\n8 oz (225 g) wild mushrooms, such as porcini or shiitake, sliced\n1 ½ cups (300 g) arborio rice\n½ cup (120 mL) dry white wine, such as Sauvignon Blanc\n5 cups (1.17 L) chicken broth\n½ cup (55 g) parmesan cheese, plus more for garnish", "In a 5-quart Dutch oven, heat the olive oil over medium heat.\nAdd the onion and cook 3-4 minutes until soft and slightly transparent.\nAdd the bacon and stir constantly until it starts to crisp.\nAdd the mushrooms and cook for an additional 2 minutes.\nAdd the arborio rice and cook for one minute, stirring constantly so the oil coats the grains.\nStir in the white wine and simmer 2-3 minutes, stirring occasionally.\nAdd one cup (235ml) of the chicken stock and simmer over\nmedium heat for about 5 minutes, stirring occasionally.\nOnce the rice absorbs most of the liquid, continue to add 1-2 cups (235-470ml) of stock at a time until the liquid is absorbed and the rice is cooked through, about 25-30 minutes total.\nNOTE: The risotto should be al dente and fall back in on itself when you run the spoon along the bottom of the pot.\nStir in the Parmesan cheese and remove from the heat.\nServe and garnish with extra Parmesan cheese.");
  cookbook.add(ris);


  /*public void addRecipeNameList(Recipe name){
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
  public void addNewRecipe(Recipe name, Recipe timePrep, Recipe ingredients, Recipe directions){
    Recipe newRecipe= new Recipe;
    Recipe.add(name, timePrep, ingredients, directions);
    cookbook.add(newRecipe);
    */
    public static String addRecipe(String newName, String newTime, String newI, String newD){
      Recipe r = new Recipe(newName, newTime, newI, newD);
      cookbook.add(r);

    }

  }

  //public String removeRecipe

  public static String searchTime(String time){
  for(int i= 0; i < cookbook.size(); i++){
  if(time.equals(cookbook.get(i).getTimePrep())){
    return cookbook(i);   // return the recipe
}
    else return system.println("error, recipe not found");
}
}
public static String searchName(String name1){
  for(int i= 0; i < cookbook.size(); i++){  // search master [0] for name
  if(name1.contains(recipeName.get(i).getName())){ // find what row position name is in
    return cookbook(i);    // return the recipe
  }
}
  else return system.println("error, recipe not found");
}

public static String searchIngredients(String userIngredients){
  for(int i= 0; i < ingredients.size(); i++){  // search master [0] for name
  if(userIngredients.contains(ingredients.get(i))){ // find what row position name is in
      return cookbook(i); //return recipe
}
  else return system.println("error, recipe not found");
}
  }

public class cookbookFrame extends JFrame{
  /*cookbook book=new cookbook();
  String name1 = null;
  String userIngredients = null; //user ingredients
  Int time = 0;*/

  public static void main (String[] args){
  JFrame frame = new JFrame ("Welcome cookbook");
  frame.setVisible(true);
  frame.setSize(600,250);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JLabel LB = new JLabel("Welcome cooking pro! Would you like to:");
  LB.setBounds(300,100,100,30);
  add (LB);

  JPanel p = new JPanel();  //creates new panel
  frame.add(p);
  JButton find = new JButton("Find Recipe"); //button to find recipe
  p.add(find);
  find.addActionListener (new Action1());


  JButton ad = new JButton ("Add Recipe"); //button to add recipe
  p.add(ad);
  ad.addActionListener(new Action2());
}

public class Action1 implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e){
    if (e.getSource()= find){
    JFrame FR2 = new JFrame("Recipe finder");
    FR2.setVisible(true);
    FR2.setSize(600,250);
    JLabel lab = new JLab("Would you like to search by:");
    JPanel pan = new JPanel();
    FR2.add(pan);
    pan.add(lab);

    JButton name = new JButton("Name");
    pan.add(name);
    name.addActionListener (new Action11());

    JButton timeprep = new JButton ("Time Prep");
    pan.add(timeprep);
    timeprep.addActionListener(new Action22());

    JButton ingre = new JButton ("Ingredients"); //button to add recipe
    pan.add(ingre);
    ingre.addActionListener(new Action33());
  }
  }
}
public class Action11 implements ActionListener {
  @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()= name);
      JFrame FR3 = new JFrame("Search by recipe name");
      FR3.setVisible(true);
      FR3.setSize(600,250);
      JLabel lab = new JLabel("Please enter the Recipe's name");
      JPanel pan1 = new JPanel();
      FR3.add(pan);
      pan1.add(lab);

      JTextField nameInput = new JTextField();
      nameInput.setSize(300,50);
      pan1.add (nameInput);
      MainCookbook.searchName(nameInput);

      JButton ent = new JButton("Enter"); //button to enter
      pan1.add(ent);
      ent.addActionListener (new Action002());
    }
  }
public class Action22 implements ActionListener {
  @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()= timeprep);
        JFrame FR3 = new JFrame("Search by recipe time prep");
        FR3.setVisible(true);
        FR3.setSize(600,250);
        JLabel lab = new JLabel("Please enter the Recipe's time prep in minutes");
        JPanel pan1 = new JPanel();
        FR3.add(pan);
        pan1.add(lab);

        JTextField oInput = new JTextField();
        oInput.setSize(300,50);
        pan1.add (oInput);
        MainCookbook.searchTime(oInput);

        JButton ent = new JButton("Enter"); //button to enter
        pan1.add(ent);
        ent.addActionListener (new Action02());
      }
    }
public class Action33 implements ActionListener {
        @Override
    public void actionPerformed(ActionEvent e){
          if(e.getSource()= ingre);
          JFrame FR3 = new JFrame("Search by recipe ingredient");
          FR3.setVisible(true);
          FR3.setSize(600,250);
          JLabel lab = new JLabel("Please enter the Recipe's ingredient");
          JPanel pan1 = new JPanel();
          FR3.add(pan);
          pan1.add(lab);

          JTextField aInput = new JTextField();
          aInput.setSize(300,50);
          pan1.add (aInput);
          MainCookbook.searchIngredients(aInput);

          JButton ent = new JButton("Enter"); //button to enter
          pan1.add(ent);
          ent.addActionListener (new Action001());
        }
        //make the inputs equal the same things as in the methods
  }
public class Action2 implements ActionListener {
    @Override
  public void actionPerformed(ActionEvent e){
    if (e.getSource()= ad){

    JFrame FR2 = new JFrame("Add recipe");
    FR2.setVisible(true);
    FR2.setSize(600,250);
    JLabel lab = new JLabel("Please enter the recipe name/time prep/ingredients/directions");
    JPanel pan = new JPanel();
    FR2.add(pan);
    pan.add(lab);

    JTextfield aaInput = new JTextField();
    aaInput.setSize(300,50);
    pan.add(aaInput);
    add (aaInput);

    JTextField bInput = new JTextField();
    bInput.setSize(300,50);
    pan.add(bInput);
    add (bInput);

    JTextField cInput = new JTextField();
    cInput.setSize(300,50);
    pan.add(cInput);
    add (cInput);

    JTextField aInput = new JTextField();
    aInput.setSize(300,50);
    pan.add(aInput);
    add (aInput);

    MainCookbook.addRecipe(aaInput, bInput, cInput, aInput);

    JButton ent = new JButton("Enter"); //button to enter
    pan.add(ent);
    ent.addActionListener (new Action01());

    //Recipe recepie=new Recipe(aaInput, bInput, cInput, aInput);

  // make these inputs equal the same varibles as the add varibles
}
}
}
}
}}
