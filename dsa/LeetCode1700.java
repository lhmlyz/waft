import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
public class LeetCode1700 {

    public static void main(String[] args) {
    }

    // space complexity 1 time complexity n
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2]; // 0 circular 1 square
        for (int s : students) {
            count[s]++;
        }

        for (int s : sandwiches) {
            if (count[s] == 0)
                break;
            count[s]--;
        }

        return count[0] + count[1];
    }

    // space complexity n time complexity n
    public int countStudentsN(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new ArrayDeque<>();
        for (int i : students)
            studentsQueue.offer(i);

        int sandwichesIndex = 0;
        int count = 0;
        while (!studentsQueue.isEmpty() && count < studentsQueue.size()) {
            if (studentsQueue.peek() == sandwiches[sandwichesIndex]) {
                studentsQueue.remove();
                sandwichesIndex++;
                count = 0;
            } else {
                studentsQueue.add(studentsQueue.remove());
                count++;
            }
        }
        return studentsQueue.size();
    }

    public static int countStudentsN2(int[] students, int[] sandwiches) {
        // stack can be used but it is old
        Deque<Integer> sandwichesStack = new ArrayDeque<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichesStack.push(sandwiches[i]);
        }

        Queue<Integer> studentsQueue = new ArrayDeque<>();
        for (int i : students) {
            studentsQueue.add(i);
        }

        int count = 0;

        while (!studentsQueue.isEmpty()) {
            var firstStudent = studentsQueue.element();
            var firstSandwich = sandwichesStack.peek();
            if (firstStudent == firstSandwich) {
                studentsQueue.remove();
                sandwichesStack.pop();
                count = 0;
            } else {
                studentsQueue.add(firstStudent);
                studentsQueue.remove();
                count++;
                if (count > studentsQueue.size()) {
                    break;
                }
            }
        }

        return studentsQueue.size();
    }
}