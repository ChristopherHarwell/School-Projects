/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamdata;

/**
 *
 * @author chris
 */
public class countCones {

    public static void main(String[] args) {
        try {
            TextIO.readFile("C:/Users/chris/Documents/Java/Java/New folder/icecream.dat");
        } catch (Exception e) {
            TextIO.putln("Error: File didn't open");
            System.exit(1);
        }

        String countFlava;
        String strawberryFlavor;
        int total = 0;
        double strawberryPercentage;
        int strawb = 1;

        int totalFlavor;

        do {
            countFlava = TextIO.getln();
            total = total + 1;

            if (countFlava.equals("Strawberry")) {
                strawb++;
            }
            
           
            strawberryPercentage = total / strawb;
        } while (!TextIO.eof());
        {
            TextIO.putln("the total number of strawberry cones sold is:\t " + strawb + " strawberry icecream cones.\n");
            TextIO.putln("The percentage of strawberry icecream cones that where sold is:\t " + strawberryPercentage + "%\n");
        }
        TextIO.putln("The sum total of all ice cream cones sold is:\t " + total + " icecream cones");
    }

}
