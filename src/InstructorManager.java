public class InstructorManager extends UserManager{
	

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " giri� yapt�n�z.");
		super.login(user);
	}
	@Override
	public void exit(User user) {
		System.out.println(user.getFirstName() + " ��k�� yapt�n�z.");
		super.exit(user);
	}
	public void addCourse() {
		System.out.println("Kurs eklendi.");
	}
	public void deleteCourse() {
		System.out.println("Kurs silindi.");
	}
}
