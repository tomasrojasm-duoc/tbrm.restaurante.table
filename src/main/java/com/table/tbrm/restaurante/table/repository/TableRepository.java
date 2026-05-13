package com.table.tbrm.restaurante.table.repository;

import com.table.tbrm.restaurante.table.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TableRepository extends JpaRepository<Table, Long> {

    List<Table> findByStatus(String status);
    List<Table> findByCapacityGreaterThanEqual(Integer capacity);
    Table findByTableNumber(Integer tableNumber);
}