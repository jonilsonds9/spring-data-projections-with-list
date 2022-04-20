package br.com.springdatatest.projections;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface CategoryProjection {

    String getName();

    String getCode();

    List<SubcategoryProjection> getSubcategories();
}
