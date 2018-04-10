package com.example.mac.takehomeassignment09_yup;


public class Coffee {
    private boolean addCream;
    private boolean addChocolate;
    private int quantity;

    public Coffee() {
    }


    public Coffee(boolean addCream, boolean addChocolate, int quantity) {
        this.addCream = addCream;
        this.addChocolate = addChocolate;
        this.quantity = quantity;
    }

    public boolean isAddChocolate() {
        return addChocolate;
    }

    public void setAddChocolate(boolean addChocolate) {
        this.addChocolate = addChocolate;
    }

    public boolean isAddCream() {
        return addCream;
    }

    public void setAddCream(boolean addCream) {
        this.addCream = addCream;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
