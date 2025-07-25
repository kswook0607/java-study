package exercise04.ex01;

public abstract class Employee {
	
	public abstract int getSalary();
}

class PartTimeEmployee extends Employee{

	@Override
	public int getSalary() {
		return 120000;
	}
class FullTime extends Employee{

	@Override
	public int getSalary() {
		return 3000000;
	}
	
}
	
}
