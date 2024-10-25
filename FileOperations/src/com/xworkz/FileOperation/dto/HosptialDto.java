package com.xworkz.FileOperation.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HosptialDto implements Serializable {
	private String hName;
	private String address;
	private String splity;
	private int noOfDoctors;
	private int noOfNurses;

}
