package com.chitti.socialmediaaap.dto;

public class socialmediaapp {
	
	private static final String social = null;
	private int id;
	private String appname;
	private int size;
	private String founder;
	
	
	
	public socialmediaapp() {

	
		
	} 
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}
@Override
public String toString() {
	return "socialmedia="+id+","+appname+", "+size+","+founder+"";
}

@Override 
public int hashCode() {
	
	return this.id;

}
public boolean equals(Object obj) {
	socialmediaapp social=(socialmediaapp)obj;
	if(this.appname==social.appname)
		return true;
	return false;
}
}


