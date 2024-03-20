import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
  // TODO
    ArrayList<Stack> stackList = new ArrayList<>();
    public int stackCapacity;
    public SetOfStacks(int stackCapacity){
        this.stackCapacity = stackCapacity;
    }

    public Stack getLastStack() {
        if (stackList.isEmpty()) {
            return null;
        }
        return stackList.get(stackList.size()-1);
    }

    public Stack getStackAtIndex(int stackNo){
        if (stackList.isEmpty()) {
            return null;
        }
        return stackList.get(stackNo);
    }
    public void push(int value){
        Stack lastStack = getLastStack();
        if (lastStack==null){
            Stack freshStack = new Stack(stackCapacity);
            freshStack.push(value);
            stackList.add(freshStack);
        }else {
            if (lastStack.isFull()){
                Stack freshStack = new Stack(stackCapacity);
                freshStack.push(value);
                stackList.add(freshStack);
            }else {
                lastStack.push(value);
            }
        }
    }
    public int pop(){
        Stack lastStack = getLastStack();
        if (lastStack==null)
            throw new EmptyStackException();
        int popped = lastStack.top.value;
        lastStack.pop();
        if (lastStack.size==0)
            stackList.remove(lastStack);
        return popped;
    }
    /*public int popAt(int stackNo){
        //int popped = stackList.get(stackNo).top.value;
        int popped =0;
        for (int i = stackNo; i < stackList.size(); i++) {
            Stack currStack = getStackAtIndex(stackNo);
            Stack nextStack = getStackAtIndex(stackNo+1);
            //popped = currStack.top.value;
            popped = currStack.pop();
            //StackNode nodeToPush = new StackNode(nextStack.removeBottom());
            currStack.push(nextStack.removeBottom());
            if (i==stackNo){
                currStack = getStackAtIndex(stackNo);
                nextStack = getStackAtIndex(stackNo+1);
                //popped = currStack.top.value;
                popped = currStack.pop();
                //StackNode nodeToPush = new StackNode(nextStack.removeBottom());
                currStack.push(nextStack.removeBottom());
            } else if (i!=stackNo && i!= stackList.size()-1) {
                currStack = getStackAtIndex(stackNo);
                nextStack = getStackAtIndex(stackNo+1);
                currStack.push(nextStack.removeBottom());
            } else  {
                //if (stackNo==stackList.size()-1)
                popped = pop();
            }

        }
        return popped;
    }*/
    public int popAt(int stackNo){
        int popped =0;
        if (stackNo==stackList.size()-1){
            popped = pop();
        }
        else {
            for (int i = stackNo; i < stackList.size()-1; i++) {
                Stack currStack = getStackAtIndex(stackNo);
                Stack nextStack = getStackAtIndex(stackNo+1);
                popped = currStack.pop();
                currStack.push(nextStack.removeBottom());
            }
        }

        return popped;
    }
}