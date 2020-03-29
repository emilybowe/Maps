package com.Maps;

public interface ProductLookupTable {
    void addProduct(int Id, String Product);
    String lookUpProductById(int Id);
    void removeProduct(int Id);
}
