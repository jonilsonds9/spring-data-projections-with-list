package br.com.springdatatest.projections;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface CategoryProjection {

    @Value("#{target.name}")
    String getName();

    @Value("#{target.code}")
    String getCode();

    @Value("#{target.subcategories}")
    List<SubcategoryProjection> getSubcategories();
}
