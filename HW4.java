package HWClass11;

/*
How would you check if String is palindrome or not? aba=> true
Abbc =>false
 */
public class HW4 {
    public static void main(String[] args) {
        String str = "cabac";

        boolean isPalindrome = true;

        for (int i = 0, j = str.length()-1; i <  j; i++, j--){
            if (str.charAt(i) == str.charAt(j))
                continue;

            isPalindrome = false;
            break;


        }
        System.out.println(isPalindrome ? "palindrome" : "not Palindrome");



    }
}
