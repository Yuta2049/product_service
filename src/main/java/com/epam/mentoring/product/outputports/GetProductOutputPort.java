package com.epam.mentoring.product.outputports;

import com.epam.mentoring.product.models.Product;

public interface GetProductOutputPort {
    Product findProduct(long productId);
}
