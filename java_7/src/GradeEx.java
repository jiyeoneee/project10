import java.util.*;  
public class GradeEx {     
	public static void main(String[] args) {        
		ArrayList<Character> a = new ArrayList<Character>();        
		Scanner scanner = new Scanner(System.in);        
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");        
		double sum = 0;        
		for(int i=0 ; i<6 ; i++) {           
			String score = scanner.next();           
			a.add(score.charAt(0));        
			}        
		for(int j=0; j<a.size(); j++) {           
			char ch = a.get(j);           
			switch(ch) {              
			case 'A' : sum += 4.0; break;              
			case 'B' : sum += 3.0; break;              
			case 'C' : sum += 2.0; break;              
			case 'D' : sum += 1.0; break;              
			case 'F' : sum += 0; break;           
				}        
			}        
		System.out.print((double)sum/6);        
		scanner.close();     
	}  
}  