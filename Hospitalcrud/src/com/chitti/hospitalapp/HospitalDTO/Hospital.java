package com.chitti.hospitalapp.HospitalDTO;

import com.chitti.hospitalapp.PatientDTO.patientDTO;
import com.chitti.hospitalapp.constant.Gender;

public class Hospital {
	private Object[] patientDTO;

	public boolean createPatientDetails(patientDTO dto) {
		patientDTO patient[];
				int index;
				public Hospital(int size) {
					Hospital[] hospital =new Hospital[size];
		
	}

			public void getAllpatientDetails() {
				System.out.println("inside getAllpatientDetails ()...fetching the data");
				for (int i = 0; i < patientDTO.length; i++) {
	        public int getPatientId(int patientId) {
				System.out.println("inside getPatientId()");
				for(int i = 0; i < patientDTO.length; i++) {
					Object[] patientDTO;
					if(patientDTO[i].getpatientId()==patientId) {
						System.out.println("patient id :"+patientDTO[i].getPatientId()+" is available");
						System.out.println("patient id :"+patientDTO[i].getPatientId());
					}
					else {
						System.out.println("patient id :"+patientDTO[i].setpatientId()+" is not available");
						System.out.println("patient id :"+patientId +" is not available");
					}
				}
	        
				return patientId;
			}



			public Gender getPatientGender(Gender patientGender) {
				System.out.println("inside getPatientByGender()..");
				for (int i = 0; i < patientDTO.length; i++) {
					Object[] patientDTO;
					if(patientDTO[i].getGender()==patientGender) {
						System.out.println("patient gender : " + patientDTO[i].getGender());
					}
					else {
						System.out.println("patient gender :" + patientGender+" is not available");
					}
				}
				return patientGender;
			}

			public long getPatientContact(long patientContact) {
				System.out.println("inside getPatientByGender()..");
				for (int i = 0; i < patientDTO.length; i++) {
					if(patientDTO[i].getContactNum()==patientContact) {
						System.out.println("patient gender : " + patientDTO[i].getContactNum());
					}
					else {
						System.out.println("patient gender :" + patientContact+" is not available");
					}
				}
				return patientContact;
			}
			public int getPatientAge(int patientAge) {
				System.out.println("inside getPatientByGender()..");
				for (int i = 0; i < patientDTO.length; i++) {
					if(patientDTO[i].getContactNum()==patientAge) {
						System.out.println("patient gender : " + patientDTO[i].getAge());
					}
					else {
						System.out.println("patient gender :" + patientAge+" is not available");
					}
				}
				return patientAge;
			}

			public String getPatientIdByName(String patientName) {
				System.out.println("inside getPatientIdByName()..");
				for (int i = 0; i < patientDTO.length; i++) {
					if(patientDTO[i].getPatientName().equals(patientName)) {
						System.out.println("patient name:"+patientDTO[i].getPatientName() + "," + "patient ID:"+patientDTO[i].getPatientId());
					}
					else {
							System.out.println("patient id :"+patientDTO[i].getPatientId()+" is not available");
							System.out.println("patient id :"+patientName+" is not available");
					}
				}
				return patientName;
			}

			public int getPatientNameById(int patientId) {
				System.out.println("inside getPatientIdByName()..");
				for (int i = 0; i < patientDTO.length; i++) {
					if(patientDTO[i].getPatientId()==patientId) {
						System.out.println("patient id:"+patientDTO[i].getPatientId() + "," + "patient name:"+patientDTO[i].getPatientName());
					}
					else {
							System.out.println("patient id :"+patientId+" is not available");
					}
				}
				return patientId;
			}

			public String getPatientAddressByName(String patientName) {
				System.out.println("inside getPatientIdByName()..");
				for (int i = 0; i < patientDTO.length; i++) {
					if(patientDTO[i].getPatientName().equals(patientName)) {
						System.out.println("patient name:"+patientDTO[i].getPatientName()+ "," +"patient address:"+patientDTO[i].getAddress() );
					}
					else {
							System.out.println("patient id :"+patientName+" is not available");
					}
				}
				return patientName;
			}

			public String getGenderByName(String patientName) {
				System.out.println("inside getPatientIdByName()..");
				for (int i = 0; i < patientDTO.length; i++) {
					if(patientDTO[i].getPatientName().equals(patientName)) {
						System.out.println("patient name:"+patientDTO[i].getPatientName()+ "," +"patient address:"+patientDTO[i].getGender() );
					}
					else {
							System.out.println("patient id :"+patientName+" is not available");
					}
				}
				return patientName;
			}



}
