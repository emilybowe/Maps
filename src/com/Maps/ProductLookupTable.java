package com.Maps;

public interface ProductLookupTable {
    void addProduct(Product productToAdd);
    Product lookupById(int id);
    void clear();
}
