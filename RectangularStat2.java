/**
* This program intents to calculate various calculations with a rectangle. An rectangular has
* an length and width, so we must important the Scanner class, because we will need to
*declare a new scanner, being the keyboard (System.in). Later on we are going to declare
* reasonable variables needed to calculated the area and the perimeter of a rectangle.
*After ths, we are going to utilize System.out.println to give the user a prompt
*to enter a value for the length. Then width will be assigned the value of 
*the next integer scanned by the keyboard. This will be done with length as well.
* Then we essentially assign the value of perimeter to be (2*width)+(2*length) and area to
* be Width*Length. Lastly we will simply print out all the calculations together. 
* When the code is compiled and run, it works with no errors.
*   Personally, there were parts of the program I found difficult, such as 
* doing the logs of the program and recording the terminal session via command
* prompts. In addition, uploading the files using gitbash instead of directly
* gave me difficulty and I had to upload them directly.


 **/

package rectangularstat2;

import java.util.Scanner;
//Scanner class imported to read from keyboard
public class RectangularStat2 {
 
 public static void main(String[] a){
  Scanner sc = new Scanner(System.in);
  double length;
  double width;
  double area;
  double perimeter;  
  //declare proper variables to calculate area and perimeter later
  
  //Prompt user for Width and then assign the next scanned value to be the value of width
  System.out.println("Enter a value for Width and press RETURN.");  

  width = sc.nextDouble();
  
  //Prompt user for Length and then assign the next scanned value to be the value of Length

  System.out.println("Enter a value for Length and press RETURN."); 

  length = sc.nextDouble();
  
  //Perimeter of a rectangle formula
  perimeter = (2*width)+(2*length);
  
  //Area of a rectangle formula
  area = width*length;

  System.out.println("When one side is"+ " "+ width +" "+ "and the other side is"+ " "+ length+", the area is" + " "+ area + " "+ "and the perimeter is" + " " + perimeter + "." ); 
  //States the values of width, length, area, and perimeter
  

 }

}