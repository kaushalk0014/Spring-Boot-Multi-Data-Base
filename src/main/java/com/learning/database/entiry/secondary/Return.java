package com.learning.database.entiry.secondary;

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
@Table(name = "return_details")
public class Return {

	@GeneratedValue
	@Id
	private Integer id;
	private String productName;
	private String orderId;
	private String amount;
	private String returnStatus;
}
