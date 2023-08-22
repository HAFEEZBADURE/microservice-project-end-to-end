package com.nt.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	
	private Long id;
	
	private String name;
	
	private List<Employee>  employees=new ArrayList<>();
}
