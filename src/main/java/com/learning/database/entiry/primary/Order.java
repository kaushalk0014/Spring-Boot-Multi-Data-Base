package com.learning.database.entiry.primary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class Order {

	@Id
	@GeneratedValue
	private Integer id;
	private String productName;
	private String orderId;
	private String amount;
	private String status;
	
}
