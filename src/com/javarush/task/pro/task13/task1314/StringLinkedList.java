package com.javarush.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;
        last.prev = newNode;
    }

    public String get(int index) {
        //напишите тут ваш код
        Node current = first.next;
        if (current != null) {
            int answer = 0;
            while (current != last) {
                if (index == answer) {
                    return current.value;
                }
                current = current.next;
                answer++;
            }
            return current.value;
        } else {
            return null;
        }

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
