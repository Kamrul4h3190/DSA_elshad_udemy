import java.util.LinkedList;
public class AnimalQueue {
    LinkedList<Animal> queue;
    int order=-1;
    public AnimalQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(Animal animal){
        if (queue!=null){
            order++;
            animal.setOrder(order);
            queue.add(animal);
        }
    }

    public Animal dequeueAny(){
        return queue.removeFirst();
    }

    public Animal dequeueDogs(){
        for (int i = 0; i < queue.size(); i++) {
            Animal animal = queue.get(i);
            if (animal instanceof Dog){
                return queue.remove(i);
            }
        }
        return null;
    }
    public Animal dequeueCats(){
        for (int i = 0; i < queue.size(); i++) {
            Animal animal = queue.get(i);
            if (animal instanceof Cat){
                return queue.remove(i);
            }
        }
        return null;
    }

    public void printQueue(){
        for (Animal animal :
                queue) {
            System.out.print(animal.name()+" -> ");
        }
        System.out.println();
    }
}