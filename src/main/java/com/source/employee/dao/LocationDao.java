package com.source.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.employee.entity.Location;
@Repository

public interface LocationDao extends JpaRepository<Location, Long> {

}
