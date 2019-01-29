package Arrays;

public class FindPairs {

    public static void printPairs(int[] array, int sum) {

        for (int i=0; i<array.length; i++){ //O(n^2)

            int first = array[i];
            for (int j=i+1;j<array.length; j++){

                int second = array[j];

                if((first+second) == sum){

                    System.out.printf( "(%d,%d)%n",first, second);
                }
            }
        }

    }

    public static void main(String args[]) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};

        printPairs(numbers, 7);
        printPairs(numbersWithDuplicates, 7);
    }
}
