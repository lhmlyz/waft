import java.util.Stack;

public class LeetCode2073N {
    public static void main(String[] args) {
        // int[] tickets = { 2, 3, 2 };
        int[] tickets = { 5, 1, 1, 1 };
        // int k = 2;
        int k = 0;
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time = time + Math.min(tickets[i], tickets[k]); // 5 5 
            } else {
                time = time + Math.min(tickets[i], tickets[k] - 1); //0 4
            }
        }

        System.out.println(time);
    }
}