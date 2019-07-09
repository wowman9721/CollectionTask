package com.epam.lab27.collectionTask;


public class Goods {
    private Integer idOfGood;
    private String nameOfGood;
    private Double price;
    private int quantity;
    private Double purchase;


    public Goods() {
    }

    public Goods(Integer idOfGood, String nameOfGood, Double price, int quantity) {
        this.idOfGood = idOfGood;
        this.nameOfGood = nameOfGood;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getIdOfGood() {
        return idOfGood;
    }

    public void setIdOfGood(Integer idOfGood) {
        this.idOfGood = idOfGood;
    }

    public String getNameOfGood() {
        return nameOfGood;
    }

    public void setNameOfGood(String nameOfGood) {
        this.nameOfGood = nameOfGood;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPurchase() {
        return this.price * this.quantity;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "idOfGood=" + idOfGood +
                ", nameOfGood='" + nameOfGood + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", purchase=" + purchase +
                '}';
    }
}
