package org.example.lesson5Homework;

import lombok.Data;

@Data

public class NoteBook {
    String nameOS;
    String color;
    Integer price;
    Double size;
    Integer ram;
    Integer coreCount;
    Double weight;
    Integer hardDriveVolume;


    public NoteBook(String brend, String nameOS, String color,
                    Integer price, Double size, Integer ram,
                    Integer coreCount, Double weight, Integer hardDriveVolume) {
        this.nameOS = nameOS;
        this.color = color;
        this.price = price;
        this.size = size;
        this.ram = ram;
        this.coreCount = coreCount;
        this.weight = weight;
        this.hardDriveVolume = hardDriveVolume;
    }

}

