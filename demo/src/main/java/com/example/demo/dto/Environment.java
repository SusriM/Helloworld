package com.example.demo.dto;

import lombok.Data;

@Data
public class Environment {

	private Vpc vpc;
	private Provider provider;
	private Ec2 ec2;
	private Subnet subnet;
	private KeyPair keyPair;
	private SecurityGroup securityGroup;
	
}
