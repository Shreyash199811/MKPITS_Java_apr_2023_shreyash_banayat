import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(404);
        priorityQueue.offer(101);
        priorityQueue.offer(303);
        priorityQueue.offer(202);
        priorityQueue.offer(505);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}