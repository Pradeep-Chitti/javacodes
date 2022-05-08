package com.chitti.hospitaldto.PatientTester;
import com.chitti.hospitaldto.HospitalDTO;
import com.chitti.hospitaldto.PatientDTO.*;
import com.chitti.hospitaldto.PatientTester.*;
import java.util.Scanner;

public class PatientTester {
	public static void main(String []args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the size");
		int size=scanner.nextInt();
		HospitalDTO dto=new HospitalDTO();
		
		for(int i=0; i<size; i++) {
		
		PatientDTO patient=new PatientDTO();
		System.out.println("Enter the patient name");
		patient.setAge(scanner.nextInt());
		System.out.println("Enter patient ID");
		patient.setId(scanner.nextInt());
		System.out.println("Enter age");
		patient.setAge(scanner.nextInt());
		System.out.println("Enter disease");
		patient.setdisease(scanner.next());
		System.out.println("Enter Phone number");
		patient.setPhno(scanner.nextLong());
		
		dto.CreatePatientDetails(patient);
	}

}
}