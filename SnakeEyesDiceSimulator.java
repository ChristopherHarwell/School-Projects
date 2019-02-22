/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeEyesCount;

import java.util.Random;

/**
 *
 * @author chris
 */
public class SnakeEyesDiceSimulator {

	public static void main(String[] args) {

		int numRolls = 0;
		int count = 0;
		boolean isSnakeEyes = false;

		/*
		 * main loop roll die using only random numbers one through 6. increment the
		 * value of count by 1 everytime the program passes through the while loop and
		 * temporarily change the value of isSnakeyes to true
		 */
		while (!isSnakeEyes) {
			int die1 = (int) (Math.random() * 6) + 1;
			int die2 = (int) (Math.random() * 6) + 1;
			count++;
			numRolls = die1 + die2;
			// if the number from both die is equal to 2 isSnakeEyes equals true
			if (numRolls == 2) {
				isSnakeEyes = true;

				txtIO.putln("It has taken " + count + " rolls to get a Snake-Eyes.");
			}

			txtIO.putln("Roll number\t" + count + ": " + "\tDie1 is: " + die1 + "\tDie2 is: " + die2
					+ "\tTotal of die from both rolls is: " + numRolls);
		}
	}

	

	}


