package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] filds = employeeCsv.split(",");
				list.add(new Employee(filds[0], Double.parseDouble(filds[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list); //ordenando lista
			for (Employee emp : list) {
				System.out.println(emp.getName() + "," + emp.getSalary());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
