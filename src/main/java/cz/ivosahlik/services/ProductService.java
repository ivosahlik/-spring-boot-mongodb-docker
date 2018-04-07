package cz.ivosahlik.services;

import cz.ivosahlik.commands.ProductForm;
import cz.ivosahlik.domain.Product;

import java.util.List;

/**
 * Intellij Idea
 * Created by ivosahlik on 04/04/2018
 */
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
