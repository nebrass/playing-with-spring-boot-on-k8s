/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onepoint.labs;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author n.lamouchi
 */
@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    List<Student> findByName(@Param("name") String name);

    List<Student> findByNameAndFamily(@Param("name") String name, @Param("family") String family);
}
