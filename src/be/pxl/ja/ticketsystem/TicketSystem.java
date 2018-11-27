package be.pxl.ja.ticketsystem;

import java.util.ArrayList;

public class TicketSystem {

    private QueueService queueService;
    private ArrayList<User> users;
    private ArrayList<Venue> venues;
    private ArrayList<Event> events;

    public TicketSystem() {
        queueService = new QueueService();
    }
    public TicketSystem(QueueService queueService) {
        this.queueService = queueService;
    }
}
