package com.ihsan_kurnia.android.gearboxshop;

public class Mobil {
    private String nameCars;
    private String years;
    private String manufacture;
    private int photoCars;
    private int photoMerk;
    private String TextDetail;
    private String performa;


    public String getPerforma() {
        return performa;
    }

    public void setPerforma(String performa) {
        this.performa = performa;
    }

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

    public int getPhotoMerk() {
        return photoMerk;
    }

    public void setPhotoMerk(int photoMerk) {
        this.photoMerk = photoMerk;
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
