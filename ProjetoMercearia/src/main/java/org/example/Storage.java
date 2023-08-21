package org.example;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    List<Product> productList = new ArrayList<>();
    private static double valueSold = 0;
    private static double AmountSpent = 0;


    public double getValueSold() {
        return valueSold;
    }

    public static void setValueSold(double valueSold) {
        Storage.valueSold += valueSold;
    }

    public double getAmountSpent() {
        return AmountSpent;
    }

    public static void setAmountSpent(double amountSpent) {
        AmountSpent += amountSpent;
    }

    public int getTotalAmountInStorage() {
        int qty = 0;

        for (int i = 0; i < productList.size(); i++) {
            qty += productList.get(i).getQuantity();
        }

        return qty;
    }

    public int getSpecificProductQuantity(Product product){
        int qty;

        int index = productList.indexOf(product);

        qty = productList.get(index).getQuantity();

        return qty;
    }

    public void AddToStorage(Product product) {
        if (!productList.contains(product)) {
            productList.add(product);
            int index = productList.indexOf(product);
            setAmountSpent(productList.get(index).getCost() * productList.get(index).getQuantity());
        }
    }

    public void RemoveFromStorage(int x) {

        productList.remove(x);
        setValueSold(productList.get(x).getCost() * productList.get(x).getQuantity());

    }

    public double StorageTotalValue() {
        double totalValue = 0;

        for (int i = 0; i < productList.size(); i++) {
            totalValue += productList.get(i).getCost() * productList.get(i).getQuantity();
        }
        return totalValue;
    }

    public List<String> getAllMinimum() {

        List<String> lowerThanMinimum = new ArrayList<>();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getQuantity() <= productList.get(i).getMinimumQuantity()) {
                lowerThanMinimum.add(productList.get(i).getName());
            }
        }

        return lowerThanMinimum;
    }

    public boolean getProductMinimum(int x) {
        boolean minimum = false;

            if (productList.get(x).getQuantity() <= productList.get(x).getMinimumQuantity()) {
                minimum = false;
            }else {
                minimum = true;
            }

        return minimum;
    }

    public void getProducts(){

        for (int i = 0; i < productList.size(); i++){
            System.out.println("["+ i +"] " + productList.get(i).getName());
        }

    }

    public void getProductInfo(int x){
        System.out.println("Nome: " + productList.get(x).getName());
        System.out.println("Descrição: " + productList.get(x).getDescription());
        System.out.println("Custo: " + productList.get(x).getCost());
        System.out.println("Preço: " + productList.get(x).getPrice());
        System.out.println("Quantidade: " + productList.get(x).getQuantity());
        System.out.println("Quantidade mínima: " + productList.get(x).getMinimumQuantity());
        System.out.println("Taxa: " + productList.get(x).getTax());
        System.out.println("Preço final: " + productList.get(x).getFinalPrice());
    }

}
