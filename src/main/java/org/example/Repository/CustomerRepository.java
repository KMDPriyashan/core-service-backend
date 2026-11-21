package org.example.Repository;

import org.example.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends
        CrudRepository<CustomerEntity, Long> {
}


//meken venne machan meka crudRepository kiyala interface ekak ethota meken Customer entity ekak denava , ethkota thama
//kiyanne meka me cutomerentity ekath ekka thama vada akaranne kiyala.
//besic crud oprations karanava. e kiuanne find(),findAll(), delet(), vage functions vda karanne me cutomerentity ekath
//ekka kiyala.
//ethakota long danna hethuva thama meken kiyanne me table eke id eke data type eka ela long thama godak velavata use
//use karanna thiyanne . ethakota me id eka vadagath venava , samahara function valata , findbyId() vage methods valata