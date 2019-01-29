package StringManipulation;

public class RomanToInt {

    public static int romanToInt(String s){

        int value = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            switch(c)
            {
                case 'I':
                    if(i != s.length()-1 && s.charAt(i+1) == 'V')
                    {
                        value+=4;
                        i++;
                    }

                    else if(i != s.length()-1 && s.charAt(i+1) == 'X')
                    {
                        value+=9;
                        i++;
                    }
                    else
                        value+=1;

                    break;

                case 'V':
                    value+=5;
                    break;

                case 'X':
                    if(i != s.length()-1 && s.charAt(i+1) == 'L')
                    {
                        value+=40;
                        i++;
                    }

                    else if(i != s.length()-1 && s.charAt(i+1) == 'C')
                    {
                        value+=90;
                        i++;
                    }
                    else
                        value+=10;

                    break;


                case 'L':
                    value+=50;
                    break;

                case 'C':
                    if(i != s.length()-1 && s.charAt(i+1) == 'D')
                    {
                        value+=400;
                        i++;
                    }

                    else if(i != s.length()-1 && s.charAt(i+1) == 'M')
                    {
                        value+=900;
                        i++;
                    }
                    else
                        value+=100;
                    break;


                case 'D':
                    value+=500;
                    break;

                case 'M':
                    value+=1000;
                    break;
            }
        }
        return value;


    }

    public static void main(String[] args){

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    }

