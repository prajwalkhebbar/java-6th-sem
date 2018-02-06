import java.util.Stack;

class StackTest
{
    public static void main(String arg[])
    {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("Is empty stack: " + st.empty());
        
        System.out.println("Stack A: " + st);
        st.push(42);
        System.out.println("Stack B:" + st);
        st.push(64);
        System.out.println("Stack C: " + st);
        st.pop();
        System.out.println("Stack D: " + st);
        st.push(96);
        System.out.println("Stack E: " + st);
        
        System.out.println("Peek integer: " + st.peek());
        System.out.println("Position: " + st.search(42));
        
        st.pop();
        System.out.println("Stack F: " + st);
        st.pop();
        System.out.println("Stack G: " + st);
    
    }
}
