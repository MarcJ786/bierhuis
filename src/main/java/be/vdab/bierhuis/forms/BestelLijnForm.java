package be.vdab.bierhuis.forms;

import java.math.BigDecimal;

public class BestelLijnForm {

    private int bierId;
    private String bierNaam;
    private BigDecimal bierPrijs;
    private int aantalBakken;

    public BestelLijnForm(int bierId, String bierNaam,
                          BigDecimal bierPrijs) {
        this.bierId = bierId;
        this.bierNaam = bierNaam;
        this.bierPrijs = bierPrijs;
    }

    public BestelLijnForm() {
    }

    public void setBierId(int bierId) {
        this.bierId = bierId;
    }

    public void setBierNaam(String bierNaam) {
        this.bierNaam = bierNaam;
    }

    public void setBierPrijs(BigDecimal bierPrijs) {
        this.bierPrijs = bierPrijs;
    }

    public void setAantalBakken(int aantalBakken) {
        this.aantalBakken = aantalBakken;
    }

    public int getBierId() {
        return bierId;
    }

    public String getBierNaam() {
        return bierNaam;
    }

    public BigDecimal getBierPrijs() {
        return bierPrijs;
    }

    public int getAantalBakken() {
        return aantalBakken;
    }

}