package com.company;

public class House {
    public int numberHouse;
    private int numberRoom;
    private int numberResident;
    private String nameHouse;

    @Override
    public String toString() {
        return "House{" +
                "numberHouse=" + numberHouse +
                ", numberRoom=" + numberRoom +
                ", numberResident=" + numberResident +
                ", nameHouse='" + nameHouse + '\'' +
                '}';
    }

    public String getNameHouse() {
        return nameHouse;
    }

    private void setNumberResident(int numberResident) {
        this.numberResident = numberResident + 1;
    }

    private void setNumberResidentRoom(int numberResident, int numberRoom){
        this.numberResident = numberResident;
        this.numberRoom = numberRoom;
    }
}
