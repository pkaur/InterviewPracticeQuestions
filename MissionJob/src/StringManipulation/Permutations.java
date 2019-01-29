package StringManipulation;

import java.util.ArrayList;

public class Permutations {

    public static ArrayList<String> permutations(String s) {

        ArrayList<String> out = new ArrayList<>();
        if (s.length() == 1) {
            out.add(s);
            return out;
        }

        char first = s.charAt(0);
        String rest = s.substring(1);

        for (String permutation : permutations(rest)) {

            out.addAll(calcPerm(first, permutation));

        }
        return out;
    }

    public static ArrayList<String> calcPerm(Character c, String s) {
        ArrayList<String> out = new ArrayList<>();

        for (int i = 0; i <= s.length(); i++) {
            String inserted = s.substring(0, i) + c + s.substring(i);
            out.add(inserted);
        }
        return out;
    }

    public static void main(String[] args) {

        System.out.println(Permutations.permutations("abc"));
    }
}
