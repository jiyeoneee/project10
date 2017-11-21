import java.util.*;
public class ArrayListStudent {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<StudentEx> dept = new ArrayList<StudentEx>();
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���."); //�Է°�
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			int num = Integer.parseInt(st.nextToken().trim());
			double grade = Double.parseDouble(st.nextToken().trim());
			
			StudentEx student = new StudentEx(name, department, num, grade);
			dept.add(student); // ArrayList�� ����
		}			
	}
	
	private void printAll() { //printAll() �޼ҵ�
		Iterator<StudentEx> it = dept.iterator();
		while (it.hasNext()) {
			StudentEx student = it.next();
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getDepartment());
			System.out.println("�й�:" + student.getNum());
			System.out.println("�������:" + student.getGrade());
			System.out.println("---------------------------");
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // �׸� �Է½� ����
			
			for(int i=0; i<dept.size(); i++) { 
				StudentEx student = dept.get(i); 
				if(student.getName().equals(name)) { //  �̸��� ���� Student ã��
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDepartment() + ", ");
					System.out.print(student.getNum() + ", ");
					System.out.println(student.getGrade());
					break;
				}
			} 
		}
	}
	
	public void run() {
		read();
		System.out.println("---------------------------");
		printAll();
		processQuery();
	}
	
	public static void main (String[] args) { //main �Լ�
		ArrayListStudent info = new ArrayListStudent();
		info.run();
	}
}