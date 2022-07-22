
public class Student {

	private String roll_no;
	private String name;
	private String age;
	
	
	public Student(String roll_no, String name, String age) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
