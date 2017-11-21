import java.util.*;

public class HashMapLocation {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("����,�浵,������ �Է��ϼ���");
		for (int i=0; i<4; i++) { //4������ �ݺ�
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String nation = st.nextToken().trim();
			int a= Integer.parseInt(st.nextToken().trim());
			int b= Integer.parseInt(st.nextToken().trim());
			
			Location location = new Location(nation, a, b);
			dept.put(nation, location); //�ؽøʿ� ����
		}			
	}
	
	private void printAll() { //������ ���� ���� ��Ÿ��
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String nation = it.next(); // �����̸�
			Location location = dept.get(nation);
			System.out.println(location.getNation() + "  " + location.getA() + "  "+ location.getB());
		}		
	}
	private void processQuery() { //�˻�
		while(true) {
			System.out.print("���� �̸� >> ");
			String nation = scanner.nextLine(); // ���� �̸� �Է�
			if(nation.equals("�׸�"))
				return; // ����
			
			Location location = dept.get(nation); // �ؽøʿ��� ���� Ű�� �˻�
			if(location == null) { // ���� �ؽøʿ� ���ٸ�
				System.out.println(nation + "�� �����ϴ�.");
			}
			else { 
				System.out.println(location.getNation() + "  " + location.getA() + "  "+ location.getB());
			}
		}
	}
	public void run() {
		read();
		System.out.println("---------------------------");
		printAll();
		System.out.println("---------------------------");
		processQuery();
	}
	public static void main (String[] args) {
		HashMapLocation info = new HashMapLocation();
		info.run();
	}
}
