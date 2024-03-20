import java.util.Stack;

public class QueueViaStack {
//  TODO
    Stack<Integer> s1,s2;

    public QueueViaStack() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    public void enqueue(int value){
        s1.push(value);
    }
    public void restore(){
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public void transfer(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
    public int dequeue(){
        int top;
        if (s1.size()==1){
            top = s1.pop();
        }else {
            transfer();
            top = s2.pop();
            restore();
        }
        return top;
    }
    public int peek(){
        int top;
        if (s1.size()==1){
            top = s1.peek();
        }else {
            transfer();
            top = s2.peek();
            restore();
        }
        return top;
    }

}