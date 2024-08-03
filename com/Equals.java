
public class Equals {
  public static void main(String[] args) {
		student s1 = new student(22);
		student s2 = new student(24);
		System.out.println(s1.equals(s2));
	}
}
class student {
	int age;
	student(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		student s = (student) obj;
		return this.age == s.age;
	}
}
