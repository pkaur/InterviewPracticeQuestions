package Arrays;

public class TwoSumIndices {

    public static int[] twoSum(int[] nums, int target) {

        int[] a= new int[2];

        for (int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    System.out.printf("%d %d",i,j);
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum exception");
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,5,8};
        twoSum(arr, 9);
    }
}
