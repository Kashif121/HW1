/**
* This program intents to calculate a grade involving different categories. Due to
* the different categories we must important the Scanner class, because we will need to
*declare a new scanner, which is the keyboard (System.in). Following this we are going to 
* declare useful variable names needed to calculate the total one ones grade.
*After this, we are going to use System.out.println to give the user a prompt
*to put in a value for homework. Then homework will be given the value of 
*the next number scanned by the keyboard. We do this gain with Codelab grade, Midterm One
*and Midterm Two. Then we essentially assign the value of total to be the values of the other
* categories added. Lastly we will simply print out all the calculations together. 
* When the code is finished it compiles well and it runs well. 
*   Personally, there were parts of the program I found difficult, such as 
* doing the logs of the program and recording the terminal session via command
* prompts. In addition, uploading the files using gitbash instead of directly
* gave me difficulty and I had to upload them directly.
 **/

package gradecalculator;

import java.util.Scanner;
//Scanner class is imported bc we will need to read numbers for keyboard

public class GradeCalculator {
 
 public static void main(String[] a){
  Scanner sc = new Scanner(System.in);
  double homework;
  double codelab;
  double midterm1;
  double midterm2;  
  double total;
  //declare variables with names that are appropriate names
  
  //Prompt the user to enter a value for homework grade
  System.out.println("Enter a value for Homework and press RETURN.");  
  
  //Assigns the next value entered via keyboard to be homework grade
  homework = sc.nextDouble();
  
  //Prompt the user to enter a quantity for CodeLab grade
  System.out.println("Enter a value for CodeLab and press RETURN."); 

  //Assigns the next value entered via keyboard to be Codelab grade
  codelab = sc.nextDouble();

  //Prompt the user to enter a value for Midterm one
  System.out.println("Enter a value for Midterm One and press RETURN."); 
  
  //Assigns the next value entered via keyboard to be Midterm One grade
  midterm1 = sc.nextDouble();
  
  //Prompt the user to enter a value for Midterm Two
  System.out.println("Enter a value for Midterm Two and press RETURN."); 
  
  //Assigns the next value entered through the keyboard to be Midterm Two grade
  midterm2 = sc.nextDouble();
  
  //Assign the value of the total grades together to the total variable
  total= homework+codelab+midterm1+midterm2;
  
  //Simply prints out the total 
  System.out.println("The total score is ="+" "+ total);

 }

}
