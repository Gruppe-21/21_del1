package com.gruppe21.spil;

/** Repræsenterer en virtuel terning
 * @author Hildibjørg Didriksen,
 * @author Marcus Rappenborg Kjærsgaard
 * @author Frederik Meyer Lehmann Lundsbjerg
 * @author Tobias Nyholm Maneschijn
 * @author Rasmus Nylander
 * @author Troels Christoffersen
 * @author https://github.com/tobiasmaneschijn/21_del1
 */
public class Die {
    /**
     * En terning har kun 6 sider.
     */
    private final int MAX_VALUE = 6;

    /**
     * Den aktuelle værdi af terningen.
     */
    private int faceValue;

    public Die(){
        faceValue = 1;
    }

    /**
     * Sætter terningens værdi til den givne integer.
     * @param faceValue Værdien som terningen skal sættes til
     */
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    /**
     * Få terningens værdi.
     * @return  Terningens værdi
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Konverter terningens værdi til en string.
     * @return Terningens værdi som en streng
     */
    @Override
    public String toString() {
        return Integer.toString(faceValue);
    }

    /**
     * Simulerer et pseudo-tilfældigt terningekast.
     * @return værdi af terningen efter kast, som en integer.
     */
    public int roll(){
        faceValue = (int)(Math.random()) * MAX_VALUE + 1;
        return faceValue;
    }
}
