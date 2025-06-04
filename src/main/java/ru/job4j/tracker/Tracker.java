package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int idx = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                result[idx] = item;
                idx++;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int idx = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                result[idx] = item;
                idx++;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item("заявка1");
        //item1.setName("заявка1");
        tracker.add(item1);
        System.out.println("id = " + tracker.ids);
        System.out.println("size = " + tracker.size);
        Item item2 = new Item("заявка2");
        //item2.setName("заявка2");
        tracker.add(item2);
        System.out.println("id = " + tracker.ids);
        System.out.println("size = " + tracker.size);
        System.out.println("Выводим заявки из массива заявок = " + tracker.items[0].getName());
        System.out.println("Выводим заявки из массива заявок = " + tracker.items[1].getName());
        //System.out.println("Выводим заявки из массива заявок = " + tracker.items[2].getName());
        //System.out.println("Копия массива items без NULL элементов = " + res.);
        Item[] res = tracker.findAll();
        System.out.println(res.length);
        System.out.println(res[0].getName());
        System.out.println(res[1].getName());
        Item res2 = tracker.findAll()[1];
        System.out.println("Вывод res2 - " + res2.getName());
    }
}