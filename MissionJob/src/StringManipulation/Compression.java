package StringManipulation;

public class Compression {


    public static String compressStr(String s) {

        int count = 1;
        char last = s.charAt(0);
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < s.length(); i++) { //O(n)

            if (s.charAt(i) == last) {
                count++;
            } else {

                if (count >= 1) {

                    sb.append(last).append(count);
                }

                last = s.charAt(i);
                count = 1;
            }

        }

        if (count >= 1) {
            sb.append(last).append(count);
        }
        return sb.toString();
    }

    public static String decompress(String str) {

        System.out.println("before decompress size:" + str.length());

        char last = str.charAt(0);
        int charCompSize = 1;
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i < str.length(); i++) {

            if (i % 2 == 0) {
                last = str.charAt(i);
            } else {
                charCompSize = Character.getNumericValue(str.charAt(i));
            }

            for (int j = 0; j < charCompSize; j++) {
                sb.append(last);
            }

            charCompSize = 0;
        }
        return sb.toString();
    }

    public static void main(String args[]) {

        System.out.println(compressStr("aabccccca"));
        System.out.println(decompress(compressStr("aabcccccaaa")));
    }
}
