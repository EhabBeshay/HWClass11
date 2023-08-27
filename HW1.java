package HWClass11;

import java.util.Locale;
import java.util.Scanner;
/*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

 */
public class HW1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String momsName = s.next();
        System.out.println("Dad’s first name");
        String dadName = s.next();
        System.out.println("Boy or Girl?");
        String gender = s.next();
        String momsBoy = momsName.substring(momsName.length()/2, momsName.length()).toUpperCase();
        String momsGirl = momsName.substring(0, momsName.length()/2).toUpperCase(Locale.ROOT);
        String dadsBoy = dadName.substring(0,dadName.length()/2).toUpperCase();
        String dadsGirl = dadName.substring(dadName.length()/2, dadName.length()).toUpperCase();

        if (gender.equalsIgnoreCase("boy")){
            System.out.println(dadsBoy+momsBoy);
        } else if (gender.equalsIgnoreCase("girl")) {
            System.out.println(momsGirl+dadsGirl);

        }else {
            System.out.println("Invalid gender");
        }


    }
}
