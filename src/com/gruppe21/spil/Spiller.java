package com.gruppe21.spil;

public class Spiller {
    private String navn;
    private int point = 0;
    private boolean toSekserer = false;

    public Spiller(String navn){
        this.navn = navn;
    }


    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isToSekserer() {
        return toSekserer;
    }

    public void setToSekserer(boolean toSekserer) {
        this.toSekserer = toSekserer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}