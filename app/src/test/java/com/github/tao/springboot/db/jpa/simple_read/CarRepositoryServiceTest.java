package com.github.tao.springboot.db.jpa.simple_read;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlMergeMode;
import static org.junit.jupiter.api.Assertions.assertEquals;


@ContextConfiguration(classes = CarRepositoryService.class)
@SqlMergeMode(SqlMergeMode.MergeMode.MERGE)
@Sql("/db/jpa/simple_read/schema.sql")
class CarRepositoryServiceTest extends RepositoryTestBase {
	@Autowired
	private CarRepositoryService carRepositoryService;


	/**
	 * The table will be created as an empty table automatically
	 * BEFORE the test case is run.
	 * */
	@Test
	void should_insert_and_then_fetch_work() {
		// insert a new record, and its PK will be returned
		Long pk = carRepositoryService.insert("BMW", "X5", "Jack");

		// do the query by PK
		CarEntity record = carRepositoryService.getByPk(pk);

		// we expect to see the inserted record
		assertEquals("BMW", record.getBrand());
		assertEquals("X5", record.getModel());
		assertEquals("Jack", record.getOwner());
	}
}