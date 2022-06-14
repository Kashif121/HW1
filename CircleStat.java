/**
* This program intents to calculate various calculations with a Circle. An circle
*has a radius and so we must important the Scanner class, because we will need to
*declare a new scanner, being the keyboard (System.in). Then we are going to declare
*meaningful variables needed to calculated the area and the circumference of a circle.
*Following this, we are going to use System.out.println to give the user a prompt
*to enter a various value for radius. Then radius will be assigned the value of 
*the next integer scanned by the keyboard. Then we essentially assign the value of
*circumference to be 2*pi*r and area to be Pi*r^2. Lastly we will simply print out
*all the calculations together. When the code is compiled and run, it works 
* with no errors.
*   Personally, there were parts of the program I found difficult, such as 
* doing the logs of the program and recording the terminal session via command
* prompts. In addition, uploading the files using gitbash instead of directly
* gave me difficulty and I had to upload them directly.


 **/

package circlestat;

import java.util.Scanner;

public class CircleStat {
 
 public static void main(String[] a){
  Scanner sc = new Scanner(System.in);
  //new scanner that is reading from keyboard 
  
  double radius;
  double area;
  double circumference;
  //Declare appropriate variable types 
  
  System.out.println("Enter a value for Radius and press RETURN.");  
  //Prompt to get the reader to enter a value of radius

  radius = sc.nextDouble();
  //Variable radius will be given the value of next decimal integer read.  
  
  //Utilizing Math class, gives us the full Pi constant
  //Circumference of a circle is 2Pi*r
  circumference = Math.PI*(2*radius);
  area = Math.PI*(radius*radius);
  //Area of a circle is Pi*r^2
  
  System.out.printf("\nWhen the radius %.3f %n"+ " "+ "\nthe circumference is %.3f %n"+ " " + "\nand the area is %.3f %n", radius, circumference, area);
  //Utilizing System.out.print f so that the statment can be formatted properly
  //$.3f determines the number to be expressed with three decimal points
  //%n represents the value of the variable
  
  }

}