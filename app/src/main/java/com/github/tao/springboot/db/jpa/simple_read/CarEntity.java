package com.github.tao.springboot.db.jpa.simple_read;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@ToString
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
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
