package com.github.tao.springboot.db.jpa.simple_read;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
@Slf4j
class MysqlContainersManager {
	private static final String MYSQL_IMAGE_TAG = "mysql/mysql-server:8.0.31-1.2.10-server";
	private static final DockerImageName MYSQL_IMAGE = DockerImageName.parse(MYSQL_IMAGE_TAG)
			.asCompatibleSubstituteFor("mysql");

	// will be shared between test methods
	@Container
	private static final MySQLContainer<?> MYSQL_CONTAINER = new MySQLContainer<>(MYSQL_IMAGE);


	@Test
	void test() {
		assertTrue(MYSQL_CONTAINER.isRunning());
		log.info("Yeah ... MySql is running");
	}
}
