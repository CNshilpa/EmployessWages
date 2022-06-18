import java.util.Random;

public class EmployeeWageDetails {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random();
		int attendance = random.nextInt(3);
		int wagePerHour = 20;
		int fullDayHour = 8;
		int wagePerDay = 0;
		int partTimeHours = 4;
		int monthlyHours = 0;
		int monthlySalary = 0;
		int day = 0;
		while (monthlyHours != 100 && day != 20) {
			day++;

			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("Employee  is present");
				wagePerDay = fullDayHour * wagePerHour;
				monthlyHours = monthlyHours + fullDayHour;
				System.out.println("Employee's daily wage is:" + wagePerDay);
				break;
			case 2:
				System.out.println("Employee is present for part time");
				wagePerDay = partTimeHours * wagePerHour;
				monthlyHours = monthlyHours + partTimeHours;
				System.out.println("Employee's daily wage is:" + wagePerDay);
				break;

			}
			monthlySalary = monthlySalary + wagePerDay;
			System.out.println(
					" Day is: " + day + " monthlyHours: " + monthlyHours + " Monthly Salary is: " + monthlySalary);
		}
	}
}
