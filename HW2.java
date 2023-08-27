package HWClass11;

/*
You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?
 */
public class HW2 {
    public static void main(String[] args) {
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] aArray = a.split("[?]");
        int noOfSent = aArray.length;

        System.out.println("The number of sentences is: " + noOfSent);
    }



    }

