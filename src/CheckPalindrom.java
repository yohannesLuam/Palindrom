import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CheckPalindrom {
    public static void main(String[] args) throws IOException {
        String str1, str2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a string value.");
        str1 = (br.readLine());

        String reverse = "";

        for (int i = (str1.length()-1); i>=0; i--){
            reverse += str1.charAt(i);
        }

        if (str1.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println(str1 + " is a Palindrome.");
        }
        else System.out.println(str1 + " is not a Palindrome.");
    }
}
