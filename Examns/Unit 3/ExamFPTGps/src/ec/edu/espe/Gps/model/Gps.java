/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Gps.model;

/**
 *
 * @author Usuario
 */
public class Gps {
    
private String model;
private String version;
private int price;
private String touchscreen;
private String Age;

    public Gps(String model, String version, int price, String touchscreen, String Age) {
        this.model = model;
        this.version = version;
        this.price = price;
        this.touchscreen = touchscreen;
        this.Age = Age;
    }

    public Gps(String model, String version, int price, String touchscreen, int price0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
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

    /**
     * @return the touchscreen
     */
    public String getTouchscreen() {
        return touchscreen;
    }

    /**
     * @param touchscreen the touchscreen to set
     */
    public void setTouchscreen(String touchscreen) {
        this.touchscreen = touchscreen;
    }

    /**
     * @return the Age
     */
    public String getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(String Age) {
        this.Age = Age;
    }




}
