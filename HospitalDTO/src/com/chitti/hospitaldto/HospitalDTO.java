package com.chitti.hospitaldto;

import java.util.Iterator;

import com.chitti.hospitaldto.PatientDTO.PatientDTO;

public class HospitalDTO {
 
public PatientDTO patientDTO[];
int index;

public void Hospital(int size) {
patientDTO=new PatientDTO[size]; 
}
public boolean CreatePatientDetails(PatientDTO dto) {
	
	System.out.println("invoked ceatePatientDetails()");
	boolean patientAdded=false;
	if(dto !=null) {
		
		patientDTO[index++]=dto;
		patientAdded=true;
	}
	else {
		System.out.println("No patient found");
		
	}
	System.out.println("end of craetePatientDetails");
	return patientAdded;
}

public void getPatientDetails() {
	System.out.println("inside getPatientDetails().......fetching the data");
	for(int i=0; i<patientDTO.length; i++) {
	
		
		System.out.println(patientDTO[i]);
	}
	
	//public void getPatientById(int patientId) {
		//System.out.println("inside getpatientId()");
		//System.out.println("arg 1 Patient Id"+patientId);
		//for (int i = 0; i < patientDTO.length; i++) {
			//if(patientDTO[1].getAge()==patientId) {
				//System.out.println(patientDTO[i]);
		
			}	
}

