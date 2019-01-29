package HackerRank;

public class RemoveElementFromArray {

    public static int removeElement(int[] nums, int val) {

        int idx=0;
        for(int i=0; i<nums.length; i++){

            if(nums[i] != val){
                nums[idx++] = nums[i];

            }
        }

        return idx;
    }

    public static void main(String[] args){
        int[] a={1,2,3,4,5,3};
        System.out.println(removeElement(a,3));
    }
}
