package com.github.tao.springboot.db.jpa.simple_read;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.NoSuchElementException;


@Repository
@RequiredArgsConstructor
public class CarRepositoryService {
	private final CarRepository carRepository;


	/**
	 * Insert a new record, and return the auto-generated PK.
	 * */
	public Long insert(String brand, String model, String owner) {
		CarEntity carEntity = CarEntity.builder()
				.brand(brand)
				.model(model)
				.owner(owner)
				.build();

		return carRepository.save(carEntity).getPk();
	}



	/**
	 * Find a record by the given PK.<p>
	 *
	 * NoSuchElementException is thrown when can not find the record.
	 * */
	public CarEntity getByPk(Long pk) {
		return carRepository.findById(pk)
				.orElseThrow(NoSuchElementException::new);
	}
}
