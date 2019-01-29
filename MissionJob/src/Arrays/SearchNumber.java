package Arrays;

public class SearchNumber {

    //array not sorted
    public static boolean isNumberPresent(int[] ar, int num) {

        for (int i=0; i<ar.length; i++){

            if(ar[i]==num){
                return true;
            }
        }

        return false;
    }


    private static boolean binarySearch(int[] ar, int start, int end, int num){

        if(end>=1) {
            int mid = start+(end-1)/2;
            System.out.println("Mid : " + mid);
            if (ar[mid] == num) {

                return true;
            } else if (ar[mid] > num) {

                return binarySearch(ar, start, mid - 1, num);
            } else {
                return binarySearch(ar, mid + 1, end, num);
            }
        }return false;

    }

    public static void main(String[] args) {
        int[] ar = {10, 12, 3, 5, 6, 8, 1, 14, 2};
        int[] ar1 = {2, 4, 6, 8, 10, 11, 12, 14, 22};

        System.out.println(SearchNumber.isNumberPresent(ar, 16));
        if(SearchNumber.binarySearch(ar1, 0,ar1.length-1,11) == false){
            System.out.println("Element not present");}
        else {
            System.out.println("Element found ");}
        System.out.println(SearchNumber.isNumberPresent(ar, 5));

    }
}
