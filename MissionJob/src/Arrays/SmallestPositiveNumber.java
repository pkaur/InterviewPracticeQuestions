package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SmallestPositiveNumber {

    public static int smallestNumber(int[] num) {
       /* Arrays.sort(num);
        int result=0;
        for (int i=0; i<=num.length-2; i++){

            int diff = num[i+1] - num[i];

            if(diff >=2){

                result= num[i]+1;
            }

            if(result ==0 && i==num.length-1){
                result=num[i]+1;
            }
            if(num[i] < 0 && i==num.length-2){
                if (num[i+1] > 0) {
                    if (num[i+1] > 1) {
                        return 1;
                    } else {
                        return num[i+1] + 1;
                    }
                }
                return 1;
            }
        }
        return result;*/

  /*      HashMap<Integer, Integer> hm = new HashMap<>();
        int result =0;
        for (int i = 0; i < num.length; i++) {

            int temp = num[i];
            if (num[i] > 0 && !hm.containsKey(num[i])) {
                hm.put(num[i], 1);
                temp = num[i] + 1;
            } else {
                continue;
            }

        }
    }
return;
}*/

        Arrays.sort(num);
        ArrayList<Integer> newlist = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            if (num[i] > 0) {
                newlist.add(num[i]);
            }

            int size = newlist.size();

            if (size == 0) {
                return 1;
            } else {

                for (int j = 0; j < newlist.size(); j++) {
                    hm.put(newlist.get(j), 1);
                }

            }
        }

        int ans = 0;
        int k = 0;
        ans = newlist.get(k);

        while (k <= newlist.size()) {
            if (!hm.containsKey(ans)) {
                return ans;
            } else {
                k++;
                ans = newlist.get(k) + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {

        int[] a = {1, 3, 6, 4, 1};
        System.out.println("=== " + smallestNumber(a));

    }
}
