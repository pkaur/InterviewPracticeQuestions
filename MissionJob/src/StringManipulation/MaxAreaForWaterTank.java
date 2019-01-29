package StringManipulation;

public class MaxAreaForWaterTank {

    //The intuition behind this approach is that the area formed between the lines will always be limited by the height of the shorter line.
        public static int maxArea(int[] height) {
            int maxarea = 0;
            for (int i = 0; i < height.length; i++)
                for (int j = i + 1; j < height.length; j++)
                    maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
            return maxarea;
        }

        public static void main(String[] args){
            int[] a ={1,8,6,2,5,4,8,3,7};

            System.out.println(maxArea(a));
        }
    }

