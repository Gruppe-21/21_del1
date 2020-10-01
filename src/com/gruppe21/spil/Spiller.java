package com.gruppe21.spil;

public class Spiller {


    private String navn = "";            // spillers navn
    private int point = 0;               // spillers point
    private boolean toSekserer = false;  // tjekker om spiller har to seksere
    private boolean navnSlutterMedS;     // tjekker om navn slutter med s

    public Spiller(String navn){
        setNavn(navn);
    }
    public Spiller(){
    }

    // hent point værdi
    public int getPoint() {
        return point;
    }

    // sætter spillers point til givne int
    public void setPoint(int point) {
        this.point = point;
    }


    public boolean isToSekserer() {
        return toSekserer;
    }

    public void setToSekserer(boolean toSekserer) {
        this.toSekserer = toSekserer;
    }

    // hent navn som string
    public String getNavn() {
        return navn;
    }

    // sæt navn
    public void setNavn(String navn) {
        this.navn = navn;
        navnSlutterMedS = getNavn().toLowerCase().endsWith("s");
    }

    public boolean isNavnSlutterMedS() {
        return navnSlutterMedS;
    }

    // tilføj point
    public void addPoint(int i){
        setPoint(getPoint() + i);
    }
}
