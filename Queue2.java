package collection;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue2 {
    
    public static Deque<Character> updateStack(Deque<Character> inputStack) {
        if (inputStack.size() < 3) {
            // there aren't enough elements to update, so return the original stack
            return inputStack;
        }
        
        // remove the bottom three elements and store them in a temporary deque
        Deque<Character> tempDeque = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            tempDeque.offerFirst(inputStack.pollLast());
        }
        
        // add the elements from the temporary deque to the top of the original deque
        while (!tempDeque.isEmpty()) {
            inputStack.offerFirst(tempDeque.pollLast());
        }
        
        return inputStack;
    }
    
    public static void main(String[] args) {
        Deque<Character> inputStack = new ArrayDeque<>();
        inputStack.push('E');
        inputStack.push('D');
        inputStack.push('C');
        inputStack.push('B');
        inputStack.push('A');
        
        Deque<Character> resultStack = updateStack(inputStack);
        
        System.out.println("The alphabets in updated stack are:");
        for (Character alphabet : resultStack) {
            System.out.println(alphabet);
        }
    }
}

