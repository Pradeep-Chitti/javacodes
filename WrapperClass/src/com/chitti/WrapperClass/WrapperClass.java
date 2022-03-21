package com.chitti.WrapperClass;

public class WrapperClass {
	
	public static void main(String[] args) {
		String contacNo="9036455410";
				long contact=Long.parseLong(contacNo);
				System.out.println(contact);
				
				
				String RollNo="23";
				byte Rollno1 = Byte.parseByte(RollNo);
				System.out.println(Rollno1);
				
				String PinCode="20000";
				short Pincode=Short.parseShort(PinCode);
				System.out.println(PinCode);
				
				String  RegNO="587203";
				int REGno;Integer.parseInt(RegNO);
				System.out.println(RegNO);
				
				String Percentage="85.92";
				float Per=Float.parseFloat(Percentage);
				System.out.println(Percentage);
				
				String Price="599.95";
				double price=Double.parseDouble(Price);
				System.out.println(Price);
				
				String Cource="True";
				boolean cource=Boolean.parseBoolean(Cource);
				System.out.println(Cource);
	}
	{
		int i=20;
		System.out.println(i);
		Integer i1=i;
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());
		short ty=56;
		Short y1=ty;

		
	}
				
}

