public class StudentEx {
	private String name; //�ʵ� ����
	private String department;
	private int num;
	private double grade;
	public StudentEx(String name, String department, int num, double grade) { //������ ����
		this.name = name;
		this.department = department;
		this.num = num;
		this.grade = grade;
	}
	public void setName(String name) { //�޼ҵ� ����
		this.name = name;}
	public String getName() {
		return name;}
	public void setDepartment(String department) {
		this.department = department;}
	public String getDepartment() {
		return department;}
	public void setNum(int num) {
		this.num = num;}
	public int getNum() {
		return num;}
	public void setGrade(double grade) {
		this.grade = grade;}
	public double getGrade() {
		return grade;}
}
