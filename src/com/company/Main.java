package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringLinkedList list = new StringLinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
