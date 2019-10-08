package com.cts.trainings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.trainings.model.Trainings;

public interface TrainingsRepository extends CrudRepository<Trainings,Long> {
//	@Query(value="select * from trainings where mentorId in ?1",nativeQuery=true)
	public List<Trainings> findBymentorIdIn(List<Long> list);
	
}