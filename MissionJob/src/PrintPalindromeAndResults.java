import java.io.*;
import java.util.*;

public class PrintPalindromeAndResults {
    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

        public static boolean is_palindrome(String s){

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++){

                if(Character.isLetter(s.charAt(i))){
                    sb.append(s.charAt(i));
                }
            }

            String newString = sb.toString().toLowerCase();
            int length= newString.length();
            if(newString.length() ==0) { return true;}
            for(int j=0; j<length/2; j++){

                if(newString.charAt(j) != newString.charAt(length-j-1)){
                    return false;
                }

            }
            return true;

        }

        public static void main(String[] args) {

            String[] candidates = {"racecar",
                    "Kayak",
                    "never odd or even",
                    "rats live on no evil star",
                    "A Toyota! Race fast... safe car: a Toyota",
                    "Some men interpret nine memos",
                    "wombat",
                    "No lemons, one melon",
                    "Too bad – I hid a book",
                    "No trace; not one cartoon",
                    "Ma'am, I'm Adam",
                    "Del was a sled",
                    "Flee to Em, remote elf",
                    "Ma? Ha! A sham!"
            };

            if(candidates.length == 0){
                System.out.println("The array of strings is empty.");
            }

            for (String candidate: candidates){

                System.out.println(candidate + " : " + is_palindrome(candidate));

            }

        }
    }


/*
Your previous Python 2 content is preserved below:

Hello, Puneet!


candidates = [
    # Valid
    "racecar",
    "Kayak",
    "never odd or even",
    "rats live on no evil star",
    "A Toyota! Race fast... safe car: a Toyota",
    "Some men interpret nine memos",
    # Invalid
    "wombat",
    "No lemons, one melon", # lemons, one->lemon, no
    "Too bad – I hid a book", # book->boot
    "No trace; not one cartoon", # cartoon->carton
    "Ma'am, I'm Adam", # Ma'am->Madam
    "Del was a sled", # was->saw
    "Flee to Em, remote elf", # Em->me
    "Ma? Ha! A sham!" # Ha! A sham->Has a ham
]

def is_palindrome(candidate):
    # Make this work
    return False

for candidate in candidates:
    print '{}: {}'.format(candidate, is_palindrome(candidate))

 */

