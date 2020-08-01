package com.epam.mentoring.product.inputports;

import com.epam.mentoring.product.models.Product;

import java.util.List;

public interface GetProductsInputPort {
    List<Product> getProducts();
}
