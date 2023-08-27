package HWClass11;

/*
How would you swap  2 strings without a temporary variable?
 */
public class HW5 {
    public static void main(String[] args) {
        String str1 = "Walid";
        String str2 = "Tamim";

        System.out.println("Before Swapping =");
        System.out.println("First String is: " + str1);
        System.out.println("Second String is: " +str2);
        str1 =str1+str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After Swapping =");
        System.out.println("First String is: " + str1);
        System.out.println("Second String is: " +str2);





    }
}
