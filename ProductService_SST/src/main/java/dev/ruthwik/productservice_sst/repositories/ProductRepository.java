package dev.ruthwik.productservice_sst.repositories;

import dev.ruthwik.productservice_sst.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> finalById(Long id);

    @Override
    Product save(Product product);
}
