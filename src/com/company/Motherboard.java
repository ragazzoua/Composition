package com.company;

/**
 * created by s.a.miroshnychenko 9/3/2018
 */

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSllots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSllots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSllots = cardSllots;
        this.bios = bios;
    }

    public void loadProgram(String programName ){
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSllots() {
        return cardSllots;
    }

    public String getBios() {
        return bios;
    }
}
