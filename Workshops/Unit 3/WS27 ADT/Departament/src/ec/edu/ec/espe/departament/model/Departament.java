/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.espe.departament.model;

/**
 *
 * @author Usuario
 */
public class Departament {

    private String color;
    private String characteristics;
    private String size;
    private int stuctura;
    private int price;

    public Departament(String color, String characteristics, String size, int stuctura, int price) {
        this.color = color;
        this.characteristics = characteristics;
        this.size = size;
        this.stuctura = stuctura;
        this.price = price;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the characteristics
     */
    public String getCharacteristics() {
        return characteristics;
    }

    /**
     * @param characteristics the characteristics to set
     */
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the stuctura
     */
    public int getStuctura() {
        return stuctura;
    }

    /**
     * @param stuctura the stuctura to set
     */
    public void setStuctura(int stuctura) {
        this.stuctura = stuctura;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
