package com.ihsan_kurnia.android.gearboxshop;

public class Mobil {
    private String nameCars;
    private String years;
    private String manufacture;
    private int photoCars;
    private int photolsCars;
    private String TextDetail;

    public String getTextDetail() {
        return TextDetail;
    }

    public void setTextDetail(String textDetail) {
        TextDetail = textDetail;
    }

    public String getNameCars() {
        return nameCars;
    }

    public void setNameCars(String nameCars) {
        this.nameCars = nameCars;
    }

    public String getYears() {
        return years;
    }

    public int getPhotolsCars() {
        return photolsCars;
    }

    public void setPhotolsCars(int photolsCars) {
        this.photolsCars = photolsCars;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getPhotoCars() {
        return photoCars;
    }

    public void setPhotoCars(int photoCars) {
        this.photoCars = photoCars;
    }
}
