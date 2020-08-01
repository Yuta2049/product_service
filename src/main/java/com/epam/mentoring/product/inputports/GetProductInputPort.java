package com.epam.mentoring.product.inputports;

import com.epam.mentoring.product.models.Product;

public interface GetProductInputPort {
    Product getProduct(long productId);
}
