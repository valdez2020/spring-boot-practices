package com.practica_DB_mysql.pruebas._con.mySQL.repository;

import com.practica_DB_mysql.pruebas._con.mySQL.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
