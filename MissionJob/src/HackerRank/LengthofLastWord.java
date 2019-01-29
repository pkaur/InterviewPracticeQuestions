package HackerRank;

public class LengthofLastWord {

    public static int lengthOfLastWord(String s) {

        int length=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') length++;
            else break;
        }
        return length;
    }

    public static void main(String[] args){

        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord("  "));
    }
}
