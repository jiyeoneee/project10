import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickEx extends JFrame {
	public ClickEx() {
		super("Ŭ�� ���� �� �������α׷�");  //�������� Ÿ��Ʋ �ޱ�
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		
		JLabel label = new JLabel("C");
		label.setLocation(100,100); //j label �ʱ� ��ġ
		label.setSize(20, 20);
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				int xBound = c.getWidth() - la.getWidth(); 
				int yBound = c.getHeight() - la.getHeight(); 			
				int x = (int)(Math.random()*xBound);
				int y = (int)(Math.random()*yBound);		//�����Լ� ���		
				la.setLocation(x, y);
			} //���콺 Ŭ���� ������ �������� �̵�
		});
		add(label);
		setSize(300,300); //(300,300)������
		setVisible(true);
	}
	static public void main(String [] args) {
		new ClickEx();
	}
}
