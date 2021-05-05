
public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		userManager.login(new Instructor());
		userManager.exit(new Student());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse();
		instructorManager.login(new Instructor());
		
		
	}

}
