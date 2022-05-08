package com.chitti.hospitaldto.PatientDTO;

public class PatientDTO {
	private String name;
	private int id;
	private int age;
	private String disease;
	private long phno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getdisease() {
		return disease;
	}

	public void setdisease(String disease) {
		this.disease= disease;
	}


	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "PatientDTO [name=" + name + ", id=" + id + ", age=" + age + ", deises=" + disease + "]";
	}

}
	
