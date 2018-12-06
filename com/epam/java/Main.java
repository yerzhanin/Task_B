package com.epam.java;
//Sort text words in alphabetic order. Words with new letter type in new paragraph

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alex");
        list.add("Bob");
        list.add("Dunkan");
        list.add("Cerrone");
        list.add("Beckham");
        list.add("Aaron");
        list.add("Bomj");
        list.add("Conan");
        list.add("Denzel");
        Collections.sort(list);
        String letter = list.get(0).substring(0,1);
        for(String word : list){
            if(!word.substring(0, 1).equals(letter)){
                letter = word.substring(0, 1);
                System.out.println("\t"+word);
        }else {
                System.out.println(word);
            }
        }
    }
}
