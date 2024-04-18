import java.util.*;
 class ProcessReorderingWithStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of processes
        int[] callingOrder = new int[n]; // Array to store calling order
        int[] idealOrder = new int[n]; // Array to store ideal order

        // Read calling order
        for (int i = 0; i < n; i++) {
            callingOrder[i] = sc.nextInt();
        }

        // Read ideal order
        for (int i = 0; i < n; i++) {
            idealOrder[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(callingOrder[i]); // Push calling order onto the stack
        }

        int swaps = 0; // Count the number of swaps

        for (int i = 0; i < n; i++) {
            // If elements match, "execute" (pop)
            if (stack.peek() == idealOrder[i]) {
                stack.pop();
            } else {
                // Push back the mismatched element and push the ideal process
                swaps++; // Count the swap
                stack.push(stack.pop()); // Push back the top element
                stack.push(idealOrder[i]);
            }
        }

        // Remaining elements in the stack require swapping
        swaps += stack.size();

        System.out.println(swaps);

        sc.close();
    }
}
