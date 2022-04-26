package com.example.demo.dto;

import lombok.Data;

@Data
public class Ec2 {
	private String amiId;
	private String instanceType;
	private String keyName;
}
