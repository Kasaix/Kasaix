package miniApp;

import miniApp.event.Event;

public class ToDoList {
    public static void main(String[] args) {
        Event l1 = new Event();
        System.out.println(l1.getListDebHour());
        System.out.println(l1.getListFinHour());
        System.out.println(l1.getListEvent());

    }
}