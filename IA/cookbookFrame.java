import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
//I need to figure out how to add a text field
//I also need to make the textfields objects that I can use in my class 
public class cookbookFrame extends Frame implements ActionListener{
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

static class Action1 implements ActionListener {
  public void actionPerformed(ActionEvent e){
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
    Button TP = new Button ("Time Prep");
    pan.add(TP);
    TP.addActionListener(new Action22());
    Button I = new Button ("Ingredients"); //button to add recipe
    pan.add(I);
    I.addActionListener(new Action33());
static class Action11 implements ActionListener {
    public void actionPerformed(ActionEvent e){
      JFrame FR3 = new JFrame("Search by recipe name");
      FR3.setVisible(true);
      FR3.setSize(600,250);
      JLabel lab = new JLab("Please enter the Recipe's name");
      JPanel pan1 = new JPanel();
      FR3.add(pan);
      pan1.add(lab);
      JTextField nameInput = new JTextField;
      nameInput.setSize(300,50);
      add (nameInput);
    }
static class Action22 implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JFrame FR3 = new JFrame("Search by recipe time prep");
        FR3.setVisible(true);
        FR3.setSize(600,250);
        JLabel lab = new JLab("Please enter the Recipe's time prep in minutes");
        JPanel pan1 = new JPanel();
        FR3.add(pan);
        pan1.add(lab);
        JTextField oInput = new JTextField;
        oInput.setSize(300,50);
        add (oInput);
      }
static class Action33 implements ActionListener {
    public void actionPerformed(ActionEvent e){
          JFrame FR3 = new JFrame("Search by recipe ingredient");
          FR3.setVisible(true);
          FR3.setSize(600,250);
          JLabel lab = new JLab("Please enter the Recipe's ingredient");
          JPanel pan1 = new JPanel();
          FR3.add(pan);
          pan1.add(lab);
          JTextField aInput = new JTextField;
          aInput.setSize(300,50);
          add (aInput);
        }
  }
static class Action2 implements ActionListener {
  public void actionPerformed(ActionEvent e){
    JFrame FR2 = new JFrame("Add recipe");
    FR2.setVisible(true);
    FR2.setSize(600,250);
    JLabel lab = new JLab("Please enter the recipe name/time prep/ingredients/directions");
    JPanel pan = new JPanel();
    FR2.add(pan);
    pan.add(lab);
     JTextfield aaInput = new JTextField;
    aaInput.setSize(300,50);
    pan.add(aaInput);
    add (aaInput);
    TextField bInput = new TextField;
    bInput.setSize(300,50);
    add (bInput);
    TextField cInput = new TextField;
    cInput.setSize(300,50);
    add (cInput);
    TextField aInput = new TextField;
    aInput.setSize(300,50);
    add (aInput);
  }
}
}
