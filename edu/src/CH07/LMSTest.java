package  CH07;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();

		e.setName("������");
		e.setAge(47);
		e.setDept("����ó");

		p.setName("��Ǫ��");
		p.setAge(52);
		p.setSubject("������");

		s.setName("������");
		s.setAge(20);
		s.setMajor("��ǻ�Ͱ���");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}