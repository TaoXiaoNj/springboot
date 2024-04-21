package com.github.tao.springboot.db.jpa.simple_read;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Entity
@Getter
@Builder
@ToString
@Table(name = "car")
public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pk")
	private Long pk;

	@Column(name = "brand")
	private String brand;

	@Column(name = "model")
	private String model;

	@Column(name = "owner")
	private String owner;
}
