package be.pxl.ja.ticketsystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Test {

    public static void main(String[] args) {
        Event event = new Event("Cyka blyat", LocalDateTime.now(), "Tri poloski and narkotik kau all day", 3.22);
        User user = new User("Pardon", "Wouter", LocalDate.of(1999, Month.APRIL, 2));
        User user2 = new User("Szarama", "Kamil", LocalDate.of(1997, Month.AUGUST, 11));
        QueueService queueService = new QueueService();
        queueService.addToQueue(event.getId(), user);
        queueService.addToQueue(event.getId(), user2);

        queueService.printQueue(event.getId());

        System.out.println(queueService.getQueueSize(event.getId()));
        System.out.println(queueService.getNextInLine(event.getId()));

        queueService.removeFromQueue(event.getId());

        System.out.println(queueService.getQueueSize(event.getId()));
        System.out.println(queueService.getNextInLine(event.getId()));
    }
}
