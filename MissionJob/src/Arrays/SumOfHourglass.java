package Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SumOfHourglass {
        // Complete the hourglassSum function below.
        static int hourglassSum(int[][] arr) {

            int total=-64;
            int sum=0;
            for(int y=0; y<=3; y++){
                for(int x=0; x<=3;x++){
                    sum += arr[y][x] + arr[y][x+1] + arr[y][x+2];
                    sum += arr[y+1][x+1];
                    sum += arr[y+2][x] + arr[y+2][x+1] + arr[y+2][x+2];
                    if (sum > total)
                        total = sum;

                }
            }

            return total;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            System.out.println(hourglassSum(arr));


        }
    }

