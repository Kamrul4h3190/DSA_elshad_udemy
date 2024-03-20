public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        // TODO
        values = new int[stackSize*numberOfStacks];
        stackCapacity = stackSize;
        sizes = new int[numberOfStacks];
        //System.out.println("Stack array created ,Size : "+values.length);
    }

    public void fillEntireStack(){
        for (int i = 0; i < values.length; i++) {
            values[i]  = i+1;
        }
    }
    public void printEntireStack(){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if(i!= values.length-1)
                System.out.print("\t");
        }
        System.out.println("\n");
    }

    // isFull
    public boolean isFull(int stackNum) {
        // TODO
        int indexToCheck = (stackCapacity*stackNum)-1;
        //System.out.println("Cheking index : "+indexToCheck);
        if (values[indexToCheck]!=0)
            return true;
        return false;
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        int indexToCheck = (stackCapacity*stackNum)-stackCapacity;
        //System.out.println("Cheking index : "+indexToCheck);
        if (values[indexToCheck]==0)
            return true;
        return false;
    }

    // indexOfTop - this is helper method for push, pop and peek methods

    public int indexOfTop(int stackNum) {
        // TODO
        int topIndex;
        if (isEmpty(stackNum)){
            topIndex = (stackCapacity*stackNum)-(stackCapacity+1);
            //System.out.println("index : "+topIndex);
        }else {
            topIndex = (stackNum*stackCapacity)-(stackCapacity-sizes[stackNum-1])-1;
           // System.out.println("index : "+topIndex);
        }
        return topIndex;
    }

    // push
    public void push(int stackNum, int value) {
        // TODO
        if (isFull(stackNum)){
            System.out.println("can not Push.Stack full");
        }else {
            int insertionIndex = indexOfTop(stackNum)+1;
            //System.out.println("pushed at index : "+insertionIndex);
            values[insertionIndex] = value;
            sizes[stackNum-1]++;
        }
    }
    // pop
    public int pop(int stackNum) {
        // TODO
        int popped=-1;
        if (isEmpty(stackNum)){
            popped = -1;
        }else {
            int popIndex = indexOfTop(stackNum);
            popped = values[popIndex];
            values[popIndex]  = 0;
            sizes[stackNum-1]--;
        }
        return popped;
    }

    // peek
    public int peek(int stackNum) {
        // TODO
        if (isEmpty(stackNum)){
            return -1;
        }else {
            return values[indexOfTop(stackNum)];
        }
    }

}
