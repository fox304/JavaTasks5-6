package org.example.lesson5Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.example.lesson5Homework.Processing.getCriteria;
import static org.example.lesson5Homework.Processing.printNotebooks;

public class Final_task {

    /*
    Задание:
• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
  Критерии фильтрации можно хранить в Map. Например:
  “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */
    public static void main(String[] args) {


        NoteBook note1 = new NoteBook("HP", "Windows", "black",
                        52999, 15.6, 8, 4, 1.7, 512);
        NoteBook note2 = new NoteBook("HP", "Linux", "red",
                        78999, 15.6, 16, 8, 1.7, 256);
        NoteBook note3 = new NoteBook("Lenovo", "Windows", "grey",
                        59999, 14.0, 4, 6, 1.6, 128);
        NoteBook note4 = new NoteBook("Acer", "Linux", "red",
                        78999, 16.1, 32, 4, 1.5, 512);
        NoteBook note5 = new NoteBook("Asus", "Doc", "red",
                        58999, 14.6, 16, 8, 1.7, 128);
        NoteBook note6 = new NoteBook("Huawei", "Windows", "black",
                        43999, 15.6, 4, 6, 1.5, 256);
        NoteBook note7 = new NoteBook("Honor", "Linux", "blue",
                        55999, 15.6, 16, 4, 1.8, 256);
        NoteBook note8 = new NoteBook("Asus", "Windows", "red",
                        60999, 14.8, 16, 8, 1.6, 512);
        NoteBook note9 = new NoteBook("Acer", "Linux", "brown",
                        40999, 15.3, 16, 4, 1.7, 256);
        NoteBook note10 = new NoteBook("Lenovo", "Linux", "yellow",
                        61999, 15.6, 16, 4, 1.7, 512);


        List<NoteBook> laptops = new ArrayList<>(Arrays.asList(note1,note2,note3,note4,note4,
                                                    note5,note6,note7,note8,note9,note10));

        Map<Integer, Integer> hashMapFilter = getCriteria();


        for (NoteBook laptop : laptops) {
            boolean flag = true;
            for (Map.Entry filter : hashMapFilter.entrySet()) {

                if ((Integer) filter.getKey() == 1) {
                    if (laptop.getPrice() > (Integer) filter.getValue()) flag = false;

                } else if ((Integer) filter.getKey() == 2) {
                    if (laptop.getSize() > (Integer) filter.getValue()) flag = false;

                } else if ((Integer) filter.getKey() == 3) {
                    if (laptop.getRam() > (Integer) filter.getValue()) flag = false;

                } else if ((Integer) filter.getKey() == 4) {
                    if (laptop.getCoreCount() > (Integer) filter.getValue()) flag = false;

                } else if ((Integer) filter.getKey() == 5) {
                    if (laptop.getHardDriveVolume() > (Integer) filter.getValue()) flag = false;

                } else break;
            }
            if (flag) printNotebooks(laptop);
        }
    }
}