import java.util.*;
public class CountryEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 10�� �Է��Ͻÿ�.(�� : Korea 5000)");
		while(true) { //�����̸��� �α��� ����
			System.out.print("���� �̸�, �α� >>");
			String nation = scanner.next();
			if(nation.equals("�׸�")) //�׸��� �Էµɶ����� �ݺ�
				break;
			int population = scanner.nextInt();
			nations.put(nation, population); // �ؽøʿ� �����̸��� �α��� ����
		}
		while(true) { //�˻�
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�")) //�׸��� �Էµɶ����� �ݺ�
				break;
			Integer a = nations.get(nation);  
			if(a == null)
				System.out.println(nation + " ����� �����ϴ�.");
			else 
				System.out.println(nation + "�� �α��� " + a); 
		}
		scanner.close();
	}
}
