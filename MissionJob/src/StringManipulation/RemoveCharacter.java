package StringManipulation;

public class RemoveCharacter {

    public static String remove(String word, Character ch){

        if(word == null || word.length() == 0 || word.isEmpty()){
            return "String is empty";
        }

        StringBuilder sb= new StringBuilder();

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                continue;
            } else {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){

        System.out.println(remove("string", 's'));
        System.out.println(remove("", 's'));
        System.out.println(remove(null, 's'));
        System.out.println(remove("madam", 'a'));
        System.out.println(remove("12334", '3'));
        System.out.println(remove("@$@#%%$^", '%'));
    }
}
