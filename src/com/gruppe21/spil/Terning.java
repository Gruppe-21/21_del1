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
public class Terning {
    /**
     * En terning har kun 6 sider.
     */
    private int antalSider;

    /**
     * Den aktuelle værdi af terningen.
     */
    private int værdi;

    public Terning(){
        værdi = -1;
        antalSider = 6;
    }
    public Terning(int antalSider){
        værdi = -1;
        this.antalSider = antalSider;
    }

    /**
     * Sætter terningens værdi til den givne integer.
     * @param værdi Værdien som terningen skal sættes til
     */
    public void setVærdi(int værdi) {
        this.værdi = værdi;
    }

    /**
     * Få terningens værdi.
     * @return  Terningens værdi
     */
    public int getVærdi() {
        return værdi;
    }

    /**
     * Konverter terningens værdi til en string.
     * @return Terningens værdi som en streng
     */
    @Override
    public String toString() {
        return Integer.toString(værdi);
    }

    /**
     * Simulerer et pseudo-tilfældigt terningekast.
     * @return værdi af terningen efter kast, som en integer.
     */
    public int kast() {
        værdi = (int) (Math.random() * antalSider + 1);
        return værdi;
    }
}
