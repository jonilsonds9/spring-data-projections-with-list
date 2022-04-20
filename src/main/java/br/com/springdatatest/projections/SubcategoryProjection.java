package br.com.springdatatest.projections;

import org.springframework.beans.factory.annotation.Value;

public interface SubcategoryProjection {

    @Value("#{target.name}")
    String getName();
}
