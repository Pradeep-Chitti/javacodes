package com.chitti.Scannerapp;
import java.util.Scanner;

public class ScannerApp {
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);	

System.out.println("enter brand");
String brand=scan.next();

System.out.println("enter size");
int size=scan.nextInt();

System.out.println("enter the color");
String color=scan.next();

System.out.println("weight of shoes");
double shoes=scan.nextDouble();

System.out.println("enter the price");
float price=scan.nextFloat();

System.out.println("enter mobile number");
double MobileNo=scan.nextDouble();

System.out.println("enter initial name");
String InitialName=scan.next();

System.out.println("Quality is good");
boolean Quality=scan.nextBoolean();
}
}
