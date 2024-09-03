/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.entity;

/**
 *
 * @author ASUS
 */
public class CarCategoryEntity {
    private String category_id;
    private String category_name;
    private Double daily_rate;

    public CarCategoryEntity() {
    }

    public CarCategoryEntity(String category_id, String category_name, Double daily_rate) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.daily_rate = daily_rate;
    }

    /**
     * @return the category_id
     */
    public String getCategory_id() {
        return category_id;
    }

    /**
     * @param category_id the category_id to set
     */
    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    /**
     * @return the category_name
     */
    public String getCategory_name() {
        return category_name;
    }

    /**
     * @param category_name the category_name to set
     */
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    /**
     * @return the daily_rate
     */
    public Double getDaily_rate() {
        return daily_rate;
    }

    /**
     * @param daily_rate the daily_rate to set
     */
    public void setDaily_rate(Double daily_rate) {
        this.daily_rate = daily_rate;
    }
    
    
}

