package org.example.lesson5Homework;

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
        NoteBook note6 = new NoteBook("Huawei", "Windows", "red",
                43999, 15.6, 4, 6, 1.5, 256);
        NoteBook note7 = new NoteBook("Honor", "Linux", "red",
                55999, 15.6, 16, 4, 1.8, 256);
        NoteBook note8 = new NoteBook("Asus", "Windows", "red",
                60999, 14.8, 16, 8, 1.6, 512);
        NoteBook note9 = new NoteBook("Acer", "Linux", "red",
                40999, 15.3, 16, 4, 1.7, 256);
        NoteBook note10 = new NoteBook("Lenovo", "Linux", "red",
                61999, 15.6, 16, 4, 1.7, 512);



    }
}