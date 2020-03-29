package com.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {
    private Map<Integer, Product> idToProduct = new HashMap<>();
    @Override
    public void addProduct(Product productToAdd) {
        if(idToProduct.containsKey(productToAdd.getId())) {
            throw new IllegalArgumentException();
        }
        idToProduct.put(productToAdd.getId(), productToAdd);
    }
    @Override
    public Product lookupById(int id) {
        return idToProduct.get(id);
    }
    @Override
    public void clear() {
    }
}
