package com.example.springbootone.repository;

import com.example.springbootone.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    // Custom queries (if needed) can be added here, for example:
    // List<Company> findByName(String name);
}
//Always repository have interface @repository annotation
//which extends jpa repository<entityname, primarykey type>