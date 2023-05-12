package org.dev;

public class Phone implements Comparable<Phone>{
    private String creator;
    private String model;
    private double price;

    public Phone(String manufacturer, String model, double price) {
        this.creator = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.price, o.getPrice());
    }
}
