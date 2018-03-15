import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;
//I need to figure out how to add a text field
//I also need to make the textfields objects that I can use in my class
//for the add I need to be able to add the ingrdients into the next position in the array
public class cookbookFrame extends JFrame{
  cookbook book=new cookbook();
  String name1 = null;
  String userIngredients = null; //user ingredients
  Int time = 0;

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
  Button find = new JButton("Find Recipe"); //button to find recipe
  p.add(find);
  find.addActionListener (new Action1());

  Button ad = new Button ("Add Recipe"); //button to add recipe
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

    Button name = new JButton("Name");
    pan.add(name);
    name.addActionListener (new Action11());

    Button timeprep = new Button ("Time Prep");
    pan.add(timeprep);
    timeprep.addActionListener(new Action22());

    Button ingre = new Button ("Ingredients"); //button to add recipe
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
      JLabel lab = new JLab("Please enter the Recipe's name");
      JPanel pan1 = new JPanel();
      FR3.add(pan);
      pan1.add(lab);

      JTextField nameInput = new JTextField();
      nameInput.setSize(300,50);
      add (nameInput);
      cookbook.searchName(nameInput);

      Button ent = new JButton("Enter"); //button to enter
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
        JLabel lab = new JLab("Please enter the Recipe's time prep in minutes");
        JPanel pan1 = new JPanel();
        FR3.add(pan);
        pan1.add(lab);

        JTextField oInput = new JTextField();
        oInput.setSize(300,50);
        add (oInput);
        cookbook.searchTime(oInput);

        Button ent = new JButton("Enter"); //button to enter
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
          JLabel lab = new JLab("Please enter the Recipe's ingredient");
          JPanel pan1 = new JPanel();
          FR3.add(pan);
          pan1.add(lab);

          JTextField aInput = new JTextField();
          aInput.setSize(300,50);
          pan1.add (aInput);
          cookbook.searchIngredients(aInput);

          Button ent = new JButton("Enter"); //button to enter
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
    JLabel lab = new JLab("Please enter the recipe name/time prep/ingredients/directions");
    JPanel pan = new JPanel();
    FR2.add(pan);
    pan.add(lab);

     JTextfield aaInput = new JTextField();
    aaInput.setSize(300,50);
    book.addRecipeName(aaInput);
    pan.add(aaInput);
    add (aaInput);

    JTextField bInput = new JTextField();
    bInput.setSize(300,50);
    book.addTimePrep(bInput);
    add (bInput);

    JTextField cInput = new JTextField();
    cInput.setSize(300,50);
    book.addIngredients(cInput);
    add (cInput);

    JTextField aInput = new JTextField();
    aInput.setSize(300,50);
    book.addDirections(aInput);
    add (aInput);

    Button ent = new JButton("Enter"); //button to enter
    pan.add(ent);
    ent.addActionListener (new Action01());

    Recipe recepie=new Recipe(aaInput, bInput, cInput, aInput);

  // make these inputs equal the same varibles as the add varibles
}
}
}
}
