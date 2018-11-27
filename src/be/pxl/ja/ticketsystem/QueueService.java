package be.pxl.ja.ticketsystem;

import java.util.*;

public class QueueService {

    private HashMap<String, ArrayDeque<User>> queueEventHashMap = new HashMap<>();

    public void addToQueue(String eventId, User user) {
        if(!queueEventHashMap.containsKey(eventId)){
            ArrayDeque<User> adq = new ArrayDeque<>();
            adq.add(user);
            queueEventHashMap.put(eventId, adq);
        } else {
            queueEventHashMap.get(eventId).add(user);
        }
    }
    public ArrayDeque<User> getQueue(String eventId) {
        return queueEventHashMap.get(eventId);
    }
    public User getNextInLine(String eventId) {
        return queueEventHashMap.get(eventId).getFirst();
    }
    public void removeFromQueue(String eventId) {
        queueEventHashMap.get(eventId).removeFirst();
    }
    public void printQueue (String eventId) {
        queueEventHashMap.get(eventId).forEach(System.out::println);
    }
    public int getQueueSize (String eventId) {
        return queueEventHashMap.get(eventId).size();
    }
}
