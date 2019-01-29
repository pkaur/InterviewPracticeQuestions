package HackerRank;

public class RemoveDupesFromSortedArrayInPlace {

    public static int removeDuplicates(int[] nums) {
        int idx=0;
        int i=0;
        while(i<nums.length){
            int curr = nums[i];
            while(i<nums.length && nums[i]==curr )
            {
                i++;
            }
            nums[idx++]=curr;
        }
        return idx;
    }

    public static void main(String[] args){

        int[] a={1,1,2};
        System.out.println(removeDuplicates(a));
    }
}
