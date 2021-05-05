public class InstructorManager extends UserManager{
	

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " giriþ yaptýnýz.");
		super.login(user);
	}
	@Override
	public void exit(User user) {
		System.out.println(user.getFirstName() + " çýkýþ yaptýnýz.");
		super.exit(user);
	}
	public void addCourse() {
		System.out.println("Kurs eklendi.");
	}
	public void deleteCourse() {
		System.out.println("Kurs silindi.");
	}
}
