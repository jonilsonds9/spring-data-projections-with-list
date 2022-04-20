package br.com.springdatatest.controllers;

import br.com.springdatatest.projections.CategoryProjection;
import br.com.springdatatest.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ApiController {

    private CategoryRepository categoryRepository;

    @GetMapping
    public List<CategoryProjection> getCategoriesProjection() {
        List<CategoryProjection> list = categoryRepository.findCategoryProjection();
        return list;
    }

}
