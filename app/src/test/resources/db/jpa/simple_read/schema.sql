CREATE TABLE IF NOT EXISTS car (
    pk BIGINT NOT NULL AUTO_INCREMENT,
    brand varchar(255) NOT NULL,
    model varchar(255) NOT NULL,
    owner varchar(255) NOT NULL,
    PRIMARY KEY (pk)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;