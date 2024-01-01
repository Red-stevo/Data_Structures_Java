package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        //Working with HashMaps<>();

        Map<String, Integer> results = new HashMap<>();

        results.put("Stephen Muiru\n", 89);
        results.put("Vincent Ndabacci\n", 78);

        System.out.println(results.keySet());
        System.out.println(results.get("Stephen Muiru"));
    }
}