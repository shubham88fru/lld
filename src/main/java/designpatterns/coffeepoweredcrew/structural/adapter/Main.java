package designpatterns.coffeepoweredcrew.structural.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		populateEmployeeData(classAdapter);//two way
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(classAdapter); //two way
		System.out.println(card);
		
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		card = designer.designCard(objectAdapter);
		System.out.println(card);

		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
