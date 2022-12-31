package org.example.lesson5Homework;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class Processing {
    public static Map getCriteria(){
        out.println("*************************************************************************");
        out.println("""
                Введите критерии , по которым будете осуществлять поиск через пробел
                например: 1 4 5\s
                *************************************************************************
                1 - цена
                2 - диагональ
                3 - объём оперативной памяти
                4 - кол-во ядер процессора
                5 - объём жёсткого диска
                """);
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();

        int value ;
        String [] listCriteria = sc.split(" ");

        Map<Integer,Integer> mapFilter = new HashMap<>();
        for (String eachCriterion : listCriteria) {
            int numberCriterion = Integer.parseInt(eachCriterion);
            if(numberCriterion == 1) out.println("Введите  стоимость ноутбука в рублях, например 50000:");
            if(numberCriterion == 2) {out.println("Введите диагональ ноутбука в дюймах, например 15:");}
            if(numberCriterion == 3) out.println("Введите объём оперативной памяти ноутбука в Гб, например 8:");
            if(numberCriterion == 4) out.println("Введите кол-во ядер процессора ноутбука, например 4 :");
            if(numberCriterion == 5) out.println("Введите объём жёсткого диска ноутбука в Мб, например 500:");


            value = scanner.nextInt();
            mapFilter.put(numberCriterion, value);
        }

        scanner.close();
        return  mapFilter;

    }
    public static void printNotebooks( NoteBook laptop){
        out.println(laptop);


    }
}
