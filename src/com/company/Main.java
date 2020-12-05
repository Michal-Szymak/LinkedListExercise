package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringLinkedList list = new StringLinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println("### Printing out elements by index ###");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("\nList size: " + list.size() + "\n");

        System.out.println("### Printng out elements with next() method ###");
        System.out.println(list.get(0));
        System.out.println(list.next());
        System.out.println(list.next());
        System.out.println(list.next());

        GenericLinkedList<Integer> genericList = new GenericLinkedList<>();
        genericList.add(123);
        genericList.add(234);
        genericList.add(3456);
        genericList.add(4567);

        System.out.println("### Checking generic list ###");
        System.out.println(genericList.get(0));
        System.out.println(genericList.next());
        System.out.println(genericList.next());
        System.out.println(genericList.get(3));
    }
}
