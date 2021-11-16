package com.company.dymrin12_1;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list0 = new LinkedList<>();
        list0.add("Puppy");
        list0.add("Kitty");
        list0.add("Fish");

        String element1 = "Fish";
        addFirst(list0, element1);

        String element2 = "Bird";
        addLast(list0, element2);


        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        System.out.println(join(list1, list2));

        shuffle(list1);


        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.add(2);
        integers1.add(1);
        integers1.add(4);
        integers1.add(5);
        integers1.add(7);


        LinkedList<Integer> integers2 = new LinkedList<>();
        integers2.add(2);
        integers2.add(9);
        integers2.add(1);
        integers2.add(4);
        integers2.add(6);

        System.out.println(intersent(integers1, integers2));
    }

    private static void addFirst(LinkedList<String> list, String target1) {
        list.addFirst(target1);
        System.out.println("First element is " + list.getFirst());
    }

    private static void addLast(LinkedList<String> list, String target2) {
        list.addLast(target2);
        System.out.println("Last element is " + list.getLast());
    }

    private static LinkedList<Integer> join(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }


    private static void shuffle(LinkedList<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }

    private static LinkedList<Integer> intersent(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> resultOfLists = new LinkedList<>(list1);
        resultOfLists.retainAll(list2);
        return resultOfLists;
    }
}
