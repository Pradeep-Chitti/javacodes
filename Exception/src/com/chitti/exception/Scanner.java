package com.chitti.exception;

public class Scanner {
	public static class ExceptionApp {
		public static void main(String[] args) {
			try {
				int[] a=new int{1,2,3,4,5,};
				
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
				String st=null;
				String str="null";
				System.out.println(st.equals(str));
			}
			catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("can not add more elements");
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
			}
	}
	
}
