public class Main {
    public static void main(String[] args) {
        //ce-28 calling
        /*ThreeInOne stack = new ThreeInOne(3);
        //stack.fillEntireStack();
        stack.printEntireStack();
        //System.out.println("Full : "+stack.isFull(3));
        //System.out.println("Empty : "+stack.isEmpty(2));
        stack.push(1,2);
        stack.push(1,2);
        stack.push(1,2);

        stack.push(2,3);
        stack.push(2,3);
        stack.push(2,3);

        stack.push(3,5);
        stack.push(3,6);
        stack.push(3,7);
        //stack.push(2,6);
        //stack.push(2,7);
        stack.printEntireStack();
        stack.pop(3);
        stack.pop(2);
        stack.printEntireStack();
        stack.push(2,8);
        stack.push(3,9);
        stack.printEntireStack();
        System.out.println(stack.peek(3));*/
        //ce-29 calling
        /*StackMin stack = new StackMin();
        stack.push(12);
        stack.push(14);
        stack.push(10);
        stack.push(3);
        stack.pop();
        System.out.println("top : "+stack.top.value+", min : "+stack.min());*/
        //ce-30 caling
        /*SetOfStacks newStack = new SetOfStacks(3);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);
        newStack.push(8);
        newStack.push(9);
        System.out.println("stackNo : "+(newStack.stackList.size()-1)
            +", top : "+newStack.getLastStack().top.value);
        //System.out.println("popped : "+newStack.pop());
        System.out.println("popped : "+newStack.popAt(1));
        System.out.println("top after caling poppedAt() : "+newStack.getStackAtIndex(1).top.value);
        System.out.println("stackNo : "+(newStack.stackList.size()-1)
                +", top : "+newStack.getLastStack().top.value);*/
        //ce-31 calling
        /*QueueViaStack newQueue = new QueueViaStack();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.peek());*/
        //ce-32 calling
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Beji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Dog("Dexter"));

        animals.printQueue();
        System.out.println("removed - "+animals.dequeueAny().name());
        System.out.println("removed - "+animals.dequeueDogs().name());
        System.out.println("removed - "+animals.dequeueCats().name());
        //System.out.println("removed : "+animals.queue.remove(1).name());
        animals.printQueue();
    }
}