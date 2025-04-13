package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        Node newElement = new Node();

        newElement.value = value;
        Node tmp = last.prev;
        last.prev = newElement;
        newElement.next = last;
        newElement.prev = tmp;
        tmp.next = newElement;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
