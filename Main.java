package org.dev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Iphone", "iPhone X", 77000));
        phones.add(new Phone("Samsung", "Galaxy S9", 23569));
        phones.add(new Phone("Google", "Pixel 2", 24549));
        phones.add(new Phone("OnePlus", "6T", 23549));
        phones.add(new Phone("Iphone", "iPhone XV", 140699));

        String creator = "Iphone";
        List<String> models = phones.stream()
                .filter(p -> p.getCreator().equals(creator))
                .map(Phone::getModel)
                .collect(Collectors.toList());

        System.out.println("Iphone models " + creator + ": " + models);

        phones.sort(Comparator.comparing(Phone::getModel).thenComparing(Phone::getPrice));
        phones.forEach(p -> System.out.println(p.getModel() + " - " + p.getPrice() + " rub" ));
    }
}
