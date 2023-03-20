import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Film {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int choice = 0;
        String customerName=null;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Input the customer that is in the queue");
            System.out.println("2. Next customer");
            System.out.println("3. Exit");
            System.out.println("Input your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input the customer's name");
                    input.nextLine();
                    customerName = input.nextLine();
                    queue.add(customerName);
                    break;
                case 2:
                    if(queue.size()>1) {
                        System.out.println("The next customer: " + queue.peek());
                        queue.poll();
                    } else {
                        System.err.println("There only one customer in the queue");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (choice < 3);
    }
}
