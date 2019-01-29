package StringManipulation;

import java.util.HashMap;

public class StringIsUnique {

    public static boolean isUnique(String str){

        HashMap<Character,Integer> hm = new HashMap<>();

        int count=1;
        for (Character c: str.toCharArray()){
            if (!hm.containsKey(c)){
                hm.put(c,count);
            } else
                return false;
        }

        return true;
    }

    public  static boolean isUniquefor(String str){

        for (int i=0; i<str.length(); i++){

            for (int j=i+1; j<str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){

        System.out.println("Is Unique : " + StringIsUnique.isUnique("Puneet"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("abc"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("null"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique(""));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("hutg9mnd!nk9"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("%$^$%^!"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("abcd10jk"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("5236245267"));
        System.out.println("Is Unique : " + StringIsUnique.isUnique("1234567"));

        System.out.println("==========================================================");
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("Puneet"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("abc"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("null"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor(""));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("hutg9mnd!nk9"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("%$^$%^!"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("abcd10jk"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("5236245267"));
        System.out.println("Is Unique : " + StringIsUnique.isUniquefor("1234567"));

    }
}
