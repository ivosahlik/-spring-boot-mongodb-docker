package cz.ivosahlik.repositories;

import cz.ivosahlik.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Intellij Idea
 * Created by ivosahlik on 04/04/2018
 */
public interface ProductRepository extends CrudRepository<Product, String> {
}
