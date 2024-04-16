package dev.ruthwik.productservice_sst.repositories;

import dev.ruthwik.productservice_sst.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CateogryRepsitory extends JpaRepository<Category,Long> {
    @Override
    Category save(Category category);
}
