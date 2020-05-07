package com.brain.lab.string;


import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        String literal = "literal";
        String s = new String("s");
        String[] arr = new String[3];
        String b = new String(literal.getBytes());
        StringBuilder builder = new StringBuilder();
        String str = new String(builder);
        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        System.out.println("Вариант 1: " + fruits);
        String[] fruitsArr = fruits.split(",");
        System.out.println("Вариант 2: " + Arrays.toString(fruitsArr));
        fruits = fruits.toLowerCase();
        System.out.println("Вариант 3: " + fruits);
        Arrays.stream(fruits.split(",")).sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1).peek(x -> System.out.println("Количество букв самого длинного слова: " + x.length())).forEach(System.out::println);
        for (String s1 : fruitsArr) {
            System.out.println(s1.substring(0, 3));
        }
        System.out.println();
        System.out.println("Part 2");
        String s3 = " Я_новая_строка ";
        System.out.println("До: " + Arrays.toString(s3.split("_")));
        System.out.println("После: " + Arrays.toString(s3.trim().split("_")));
        System.out.println("Ставим пробелы " + s3);
        System.out.println(s3.replace('_',' ').trim());
//        builder = new StringBuilder(fruits.concat(s3).trim().replace('_',' '));
//        System.out.println(builder);
//        System.out.println(builder.reverse());
        System.out.println();
        builder.append("Апельсин, Яблоко, Гранат,\n Груша");
        builder.append("\n").append(s3.trim().replace("_"," "));
        builder.reverse();
        String resoult = builder.toString();
        System.out.println(resoult);
        builder.reverse();
    }

}