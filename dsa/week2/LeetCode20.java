import java.util.Deque;
import java.util.ArrayDeque;

public class LeetCode20 {

    void main() {
        IO.println(isValid("()"));
    }

    public boolean isValid(String s) {
        Deque<Character> chars = new ArrayDeque<>();
        char [] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                chars.push(c[i]);
            } else {
                if (chars.isEmpty()) {
                    return false;
                }

                char top = chars.pop();
                if ((c[i] == ')' && top != '(') || (c[i] == ']' && top != '[') || (c[i] == '}' && top != '{') ) {
                    return false;
                }
            }
        }

        return chars.isEmpty();

    }
}