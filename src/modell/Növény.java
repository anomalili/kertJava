/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.Serializable;

/**
 *
 * @author makra
 */
public class Növény  implements Serializable{

    public Növény(String id, String name, int price, int age) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        if (id.matches("[A-Za-z]{2}[0-9]{2}")) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Az ID érvénytelen formátumú.");
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "N\u00f6v\u00e9ny{" + "id=" + id + ", name=" + name + ", price=" + price + ", age=" + age + '}';
    }
    private String id;
    private final String name;
    private int price;
    private int age;   
}
