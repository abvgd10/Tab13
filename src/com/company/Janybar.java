package com.company;

public class Janybar {

    private String name;
    private String emnekylaalat;

    public Janybar(String name, String emnekylaalat) {
        this.name = name;
        this.emnekylaalat = emnekylaalat;
    }
    public Janybar() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmnekylaalat() {
        return emnekylaalat;
    }

    public void setEmnekylaalat(String emnekylaalat) {
        this.emnekylaalat = emnekylaalat;
    }

    @Override
    public String toString() {
        return "Janybar{" +
                "name='" + name + '\'' +
                ", emnekylaalat='" + emnekylaalat + '\'' +
                '}';
    }
}
