import java.util.*;

public class NearestSmallerElement {

    void main() {
        var input = List.of(4, 5, 2, 10, 8);
        IO.println(prevSmaller(input));
    }

    public List<Integer> prevSmaller(List<Integer> input) {
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> g = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            while (!stack.isEmpty() && stack.peek() >= input.get(i)) { // 4 5 2 10
                stack.pop();
            }

            int val = stack.isEmpty() ? -1 : stack.peek();
            g.add(val); //-1 4 -1 -1
            stack.push(input.get(i)); //4,5 -> 2, 10, 8
        }

        return g;
    }
}
