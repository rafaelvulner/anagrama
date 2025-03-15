package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> letters = List.of("L", "Z", "C", "A");
        
        generateAnagram("", letters, letters.size());
    }

    public static void generateAnagram(String prefix, List<String> letters, int size) {
        if (prefix.length() == size) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < letters.size(); i++) {
            List<String> rest = new ArrayList<>(letters);
            String remove = rest.remove(i);
            generateAnagram(prefix + remove, rest, size);
        }
    }
}