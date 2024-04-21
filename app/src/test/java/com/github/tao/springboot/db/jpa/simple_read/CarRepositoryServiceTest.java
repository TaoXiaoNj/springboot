package com.github.tao.springboot.db.jpa.simple_read;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = CarRepositoryService.class)
class CarRepositoryServiceTest extends RepositoryTestBase {
	@Autowired
	private CarRepositoryService carRepositoryService;

	@Test
	void should_insert_work() {
		carRepositoryService.getByPk(123L);
	}
}