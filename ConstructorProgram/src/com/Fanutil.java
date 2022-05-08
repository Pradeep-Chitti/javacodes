package com;

import com.chitti.constroctorchain.Fan;
import com.chitti.constroctorchain.TableFan;
public class Fanutil {
	
	public static void main(String[] args) {
		
		Fan Faan=new Fan((byte)3,"Usha","Black");
		System.out.println(Faan);
		
		System.out.println("===========================");
		
		TableFan Table=new TableFan();
		System.out.println(Table);
	}

}

