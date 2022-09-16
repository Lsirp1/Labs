/*@author Luke Sirp
 *@Date 9/16/2022
 *Assignment SirpLukeA3.java
 *Algorithm:
 * Ask user for their phrase to cipher
 * Ask user for their cipher key
 * Change one part of the phrase into a character
 * Check if the character is a letter, lower case, or upper case
 * If it is not a letter do nothing
 * If it is upper case, shift letter with upper case letters
 * If it is lower case, shift letter with lower case letters
 * Print out the character
 * Repeat for every character of the phrase
 */

import java.util.*;

public class Lab3 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);//Takes in user input
        System.out.println("What is the phrase you would like to cipher?");//Asks user for their phrase to cipher
        String phrase = keyboard.nextLine();//Takes in the phrase
        System.out.println("What is the key you would like to cipher the phrase by?");
        int shift = keyboard.nextInt();//Take in key to cipher phrase by
        int newletter;
        int safe;
        char letter;
        for(int i = 0; i <= phrase.length(); i ++){ //Loops the cipher until it reaches last character of the phrase
            letter = phrase.charAt(i);//converts one part of the phrase to a character
            if(letter < 64 || (letter < 97 && letter >90)){ //checks if letter is a special character
                //does nothing

            } 
            else if(letter > 64 && (letter < 91)){ //checks if letter is upper case
                letter += shift; //Adds key to cipher the letter
                while(letter > 90){ //Checks if the letter becomes a special character
                safe = letter % 90; //checks how many extra characters the letter was shifted by
                letter = 64; //Resets the letter
                letter += safe; //Adds the amount of extra characters the letter was shifted by
                }   
            }
            else if(letter > 96 && letter < 123){ //Checks if letter is lower case
                letter += shift;  //Adds key to cipher the letter
                while(letter > 122){ //Checks if letter becomes a special character
                    safe = letter % 122; //checks how many extra characters the letter was shifted by
                    letter = 96; //Resets the letter
                    letter += safe;//Adds the amount of extra characters the letter was shifted by
                }
            }
            
                
            
            System.out.printf("%c",letter);//Prints out ciphered character
        }
            



        



    }

}
