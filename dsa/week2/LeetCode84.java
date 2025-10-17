import java.util.Deque;
import java.util.ArrayDeque;

public class LeetCode84 {
    
    void main() {
        int[] input = {2,4};
        var result = largestRectangleArea(input);
        IO.println(result);
    }

    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        for (int i = 0; i <= length; i++) {
            int currHeight = (i == length) ? 0 : heights[i]; //3, 1
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) { // 1
                int height = heights[stack.pop()]; // 3
                int right = i; // 1
                int left = stack.isEmpty() ? -1 : stack.peek(); 
                int width = right - left - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i); // 0,
        }
        return maxArea;
    }
}