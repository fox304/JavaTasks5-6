package org.example.lesson5Homework;

import java.util.*;

public class word {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Задание 1 (1-ый способ) ");
        System.out.println("-----------------------------------");
        taskNumber1_1();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Задание 1 (2-oй способ) ");
        System.out.println("-----------------------------------");
        taskNumber1_2();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Задание 2  ");
        System.out.println("-----------------------------------");
        taskNumber2();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Задание 3  ");
        System.out.println("-----------------------------------");
        taskNumber3();
        System.out.println("Остальные слова не пересекаются");

    }

    public static void taskNumber1_1(){
        /*
        Подсчитать количество вхождения каждого слова (первый способ)
         */
        String str = "Белый снег, белый мел, Белый заяц тоже бел. " +
                "А вот белка не бела – Белой даже не была. ";

        str = str.replaceAll("\\pP", "").toLowerCase();
        String [] list1 = str.split(" ");
        List<String> str_ = new ArrayList<>(Arrays.asList(list1));
        int n = 1;
        for (int j = 0; j < str_.size()-1 ; j++) {
            str =str_.get(j);

            for (int i = j+1; i < str_.size()-1; i++) {
                if(str_.get(i).equals(str)) {
                    n++;
                    str_.remove(i);
                    i--;
                }
            }
            System.out.println(str_.get(j)+" "+n);
            n = 1;
        }
    }
    public static void taskNumber1_2(){
        /*
         Подсчитать количество вхождения каждого слова (второй способ)

        */
        String str = "Белый снег, белый мел, " +
                "Белый заяц тоже бел. " +
                "А вот белка не бела – " +
                "Белой даже не была. ";

        String strAfter = str.replaceAll("\\pP", "").toLowerCase();
        String [] list1 = strAfter.split(" ");
        Map<String,Integer> map = new HashMap<>();

        for (String s : list1) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        for (Map.Entry<String,Integer> maplist :map.entrySet()) {
            System.out.println(maplist.getKey()+" "+maplist.getValue());
        }
    }
    public static void taskNumber2(){
        /*
         Подсчитать количество искомого слова, через map
         (наполнением значение, где искомое слово будет являться ключом)
         */

        String str = "Что такое Новый год? " +
                "Это – дружный хоровод, " +
                "Это – дудочки и скрипки, " +
                "Шутки, песни и улыбки – " +
                "Вот, что значит, " +
                "Вот, что значит Новый год! " +
                "Что такое Новый год? " +
                "Новый год – мороз и лед! " +
                "И в танцующих снежинках " +
                "Незаметные пружинки – " +
                "Вот, что значит, " +
                "Вот, что значит Новый год! ";

        String strAfter = str.replaceAll("\\pP", "").toLowerCase();
        String [] list1 = strAfter.split(" ");
        Map<String,Integer> map = new HashMap<>();



        for (String str_:list1){
            map.putIfAbsent(str_, 0);
            map.put(str_, map.get(str_) + 1);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите искомое слово ");

        String word = sc.next();
        System.out.println("Слово "+ word+" встречается в тексте " + map.get(word)+" раз" );
        sc.close();
    }
    public static void taskNumber3(){
        /*
            Найти пересечения слов в массивах и
            указать их общее количество.
            Пример:
            mas1= [“qwe”,”asd”,”qwe”,”x”]
            mas2=[“qwe”,”v”]"qwe","v"
            Результат:
            qwe=3
         */

        List<String > arr1 = Arrays.asList("новый","год","новый","дед","мороз");
        List<String > arr2 = Arrays.asList("новый","мороз","дед","год","мороз","мороз","новый");

        Map<String ,Integer> map2  = new HashMap<>();

        Set<String> set1 = new HashSet<>(arr1);
        Set<String> set2 = new HashSet<>(arr2);

        for (String s : arr1) {
            if (set2.contains(s)) {
                map2.putIfAbsent(s, 0);
                map2.put(s, map2.get(s) + 1);
            }

        }

        for (String s : arr2) {
            if (set1.contains(s)) {
                map2.putIfAbsent(s, 0);
                map2.put(s, map2.get(s) + 1);
            }
        }
        for (var map_ :
                map2.entrySet()) {
            System.out.println(" слово "+map_.getKey()+" " +
                    " встречается "+ map_.getValue()+"  раз");
        }




    }
}
