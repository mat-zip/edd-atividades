package com.matheus.atividades.atividade3;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
    private int number;

    public Product(int id, String name, double price, String category, int number){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", number=" + number +
                '}';
    }
}
