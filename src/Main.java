package model;
import Task.*;

class Main {
    public static void main(String[] args) {
        Task manager = new Task();
        manager.setTaskId(1);
        System.out.println(manager.getTaskId());
        System.out.println(manager.getTaskStatus());
    }
}