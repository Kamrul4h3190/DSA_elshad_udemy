public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        System.out.println(newStack.peek());
        newStack.push(10);
        System.out.println(newStack.peek());
        newStack.pop();
        System.out.println(newStack.peek());
    }
}