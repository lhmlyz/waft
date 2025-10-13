import java.util.Queue;
import java.util.ArrayDeque;;

public class LeetCode2073 {
    public static void main(String[] args) {
        // int[] tickets = { 2, 3, 2 };
        int[] tickets = { 5, 1, 1, 1 };
        // int k = 2;
        int k = 0;

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i); // store k index
        }

        int time = 0;
        while (!q.isEmpty()) {
            int person = q.poll();
            tickets[person]--;
            time++;

            if (tickets[person] > 0) {
                q.offer(person);
            }

            if (person == k && tickets[person] == 0) {
                break;
            }
        }
        System.out.println(time);
    }
}