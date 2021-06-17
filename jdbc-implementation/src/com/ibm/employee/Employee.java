package com.ibm.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String gmail;

}
