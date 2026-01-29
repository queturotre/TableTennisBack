package com.tabletennis.repository;

import com.tabletennis.DTO.CategoryDTO;
import com.tabletennis.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT new com.tabletennis.DTO.CategoryDTO(c.idCategory, c.name) " +
            "FROM Category c")
    List<CategoryDTO> findAllCategories();
}
