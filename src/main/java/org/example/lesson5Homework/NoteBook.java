package org.example.lesson5Homework;

import lombok.Data;

@Data

public class NoteBook {
    private String brend ;
    private String nameOS;
    private String color;
    private Integer price;
    private Double size;
    private Integer ram;
    private Integer coreCount;
    private Double weight;
    private Integer hardDriveVolume;


    public NoteBook(String brend,String nameOS, String color, Integer price,
                    Double size, Integer ram, Integer coreCount,
                    Double weight, Integer hardDriveVolume) {
        this.brend = brend;
        this.nameOS = nameOS;
        this.color = color;
        this.price = price;
        this.size = size;
        this.ram = ram;
        this.coreCount = coreCount;
        this.weight = weight;
        this.hardDriveVolume = hardDriveVolume;
    }

    @Override
    public String toString() {
        return "Ноутбук " + brend +
                " с оперативной системой " + nameOS +
                ", цвет " + color +
                ", цена " + price +
                ", диагональ " + size +
                ", RAM " + ram +
                ", кол-во ядер " + coreCount +
                ", вес " + weight +
                ", объём жёсткого диска " + hardDriveVolume;
    }
}

