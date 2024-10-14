//Day 7 - Question1
//https://neetcode.io/problems/max-water-container
/*You are given an integer array heights where heights[i] represents the height of the ith bar.
ou may choose any two bars to form a container. Return the maximum amount of water a container can store.*/
public class MaxWaterContainer {
    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int res = 0;

        while(left<right){
            int area = Math.min(heights[left], heights[right]) *(right-left);
            res = Math.max(res, area);
            if(heights[left]<=heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return res;


    }
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxArea(heights));
    }
}
