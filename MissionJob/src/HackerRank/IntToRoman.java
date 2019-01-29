package HackerRank;

public class IntToRoman {

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        // Handling edge cases
        if (num < 0) {
            return "";
        }

        int remainder = num;
        while (remainder > 0) {
            if (remainder >= 1000) {
                result.append(convertSingleDigit(remainder / 1000, 'M', 'M', 'M'));
                remainder = remainder % 1000;
            } else if (remainder >= 100) {
                result.append(convertSingleDigit(remainder / 100, 'C', 'D', 'M'));
                remainder = remainder % 100;
            } else if (remainder >= 10) {
                result.append(convertSingleDigit(remainder / 10, 'X', 'L', 'C'));
                remainder = remainder % 10;
            } else if (remainder <= 9) {
                result.append(convertSingleDigit(remainder, 'I', 'V', 'X'));
                remainder = 0;
            }
        }

        return result.toString();
    }

    private static String convertSingleDigit(int num, char symbol, char lbSymbol, char ubSymbol) {
        StringBuilder result = new StringBuilder();
        switch (num) {
            case 1:
            case 2:
            case 3:
                for (int i = 0; i < num; i++) {
                    result.append(symbol);
                }
                break;
            case 4:
                result.append(symbol).append(lbSymbol);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                result.append(lbSymbol);
                for (int i = 0; i < num - 5; i++) {
                    result.append(symbol);
                }
                break;
            case 9:
                result.append(symbol).append(ubSymbol);
                break;
        }
        return result.toString();
    }

    public static void main(String[] args){

        System.out.println("58 --- > " +  intToRoman(58));
        System.out.println("9 --- > " +  intToRoman(9));
        System.out.println("1994 --- > " +  intToRoman(1994));
    }
}
