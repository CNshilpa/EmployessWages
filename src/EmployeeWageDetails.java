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
		if (attendance == 0) {
			System.out.println("Employee Absent");
			System.out.println(wagePerDay);
		} else if (attendance == 1) {
			System.out.println("Employee Present for part time hours");
			wagePerDay = wagePerHour * partTimeHours;
			System.out.println("Employee's daily wage is:" + wagePerDay);
		} else {
			wagePerDay = wagePerHour * fullDayHour;
			System.out.println("Employee's daily wage is:" + wagePerDay);
		}
	}
}
