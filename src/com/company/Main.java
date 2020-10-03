package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            ArrayList<String> list_A = new ArrayList<>(5);
            System.out.println("Посчитать до 5");

            Scanner scanner = new Scanner(System.in);
            list_A.add(scanner.nextLine() + ("Audi"));
            list_A.add(scanner.nextLine() + ("Toyota"));
            list_A.add(scanner.nextLine() + ("Honda"));
            list_A.add(scanner.nextLine() + ("Mercedes"));
            list_A.add(scanner.nextLine() + ("Nissan"));
            Iterator<String> iterator = list_A.iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                System.out.println(s);
            }

            ArrayList<String> list_B = new ArrayList<>(5);
            System.out.println("Продолжить до 10");
            Scanner scanner1 = new Scanner(System.in);
            list_B.add(scanner1.nextLine() + ("Volkswagen"));
            list_B.add(scanner1.nextLine() + ("Hyundai"));
            list_B.add(scanner1.nextLine() + ("Kia"));
            list_B.add(scanner1.nextLine() + ("Lexus"));
            list_B.add(scanner1.nextLine() + ("Ford"));
            Collections.reverse(list_B);
            iterator = list_B.iterator();
            while (iterator.hasNext()) ;

            {

                String a = iterator.next();
                System.out.println(a);
            }
            ArrayList<String> list_C = new ArrayList<String>();
            int i = 0;
            while (i < list_A.size()) {
                list_C.add(list_A.get(i));
                list_C.add(list_A.get(i));
                iterator = list_C.iterator();
                while (iterator.hasNext()) {
                    String c = iterator.next();
                    System.out.println(c);
                }
                Collections.sort(list_C, new Comparator<String>() {
                    @Override
                    public int compare(String X, String L) {
                        return X.length() - L.length();

                    }
                });
                iterator = list_C.iterator();
                while (iterator.hasNext()) {
                    String list = iterator.next();
                    System.out.println(list);
                }
            }
        }catch (OutOfMemoryError e){

        }
    }
}


