package com.example.demo.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Ec2 {
	
	@Id
	@Column
	private long id;
	
	private String amiId;
	private String instanceType;
	private String keyName;
	
	

}
