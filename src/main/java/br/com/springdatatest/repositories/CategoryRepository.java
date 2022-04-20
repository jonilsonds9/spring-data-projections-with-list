package br.com.springdatatest.repositories;

import br.com.springdatatest.models.Category;
import br.com.springdatatest.projections.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("""
        select distinct c from Category c
        left join c.subcategories s
        left join s.courses x
        where c.active = true and s.active = true and x.visible = true
    """)
    List<CategoryProjection> findCategoryProjection();
}
