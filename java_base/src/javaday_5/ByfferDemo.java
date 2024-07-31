package javaday_5;
import java.io.*;
public class ByfferDemo {

	public static void main(String[] args)throws IOException { 
		int eid;
		String ename;
		double salary;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Eneter the Employee details:");
		eid=Integer.parseInt(br.readLine());
		ename=br.readLine();
		salary=Double.parseDouble(br.readLine());
		
		System.out.println("Employee Id:" +eid);
		System.out.println("Employee Name:" +ename);
		System.out.println("Employee salary:" +salary);
	}
}