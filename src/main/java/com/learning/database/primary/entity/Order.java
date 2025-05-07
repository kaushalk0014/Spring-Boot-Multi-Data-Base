package com.learning.database.primary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
@ToString
public class Order {

	@Id
	@GeneratedValue
	private Integer id;
	private String productName;
	private String orderId;
	private String amount;
	private String status;
	@Version
	private int version;
	
}
