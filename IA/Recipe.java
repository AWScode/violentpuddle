// program to interact with hashmap to create the recipes within the cookbook

public class Recipe{
  private String name; // creates name object
  private String timePrep; //creates the time it takes to cook
  private String ingredients; //creates ingredients object
  private String directions; //creates directions object

public Recipe(String name, String timePrep, String ingredients, String directions){ //contructor
  this.name = name;
  this.timePrep = timePrep;
  this.ingredients = ingredients;
  this.directions = directions;
}
public void setName(String name){
  this.name = name; //sets name
}
public void setTimePrep(String timePrep){
  this.timePrep = timePrep; //sets timePrep
}
public void setIngredients(String ingredients){
  this.ingredients = ingredients; //sets ingredients
}
public void setDirections(String directions){
  this.directions = directions; //sets directions
}
public String getName(){
  return name;
}
public String getTimePrep(){
  return timePrep;
}
public String getIngredients(){
  return ingredients;
}
public String getDirections(){
  return directions;
}
}
