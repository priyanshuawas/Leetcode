package Medium;
import java.util.Stack;

class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length)
            return false; 
        
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;

        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            // pop all element from stack which are same as popped array
            while (popIndex < popped.length // boundry check
                    && !stack.isEmpty() // stack should not be empty
                    && popped[popIndex] == stack.peek()) // popped element must be current element in popped array
            {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty(); // stack should be empty at last
    }
}