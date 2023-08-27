package HWClass11;

/*
How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */
public class HW3 {
    public static void main(String[] args) {
        String input = "This is sentence I want to reverse";
        String[] words = input.split("\\s+");
        String reversed = "";

        for (String word : words) {
            String reversedWord = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            reversed += reversedWord + " ";
        }

        System.out.println("Reversed: " + reversed.trim());
    }



    }

