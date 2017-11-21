import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FontSize extends JFrame {
	public FontSize() {
		setTitle("+,-Ű�� ��Ʈ ũ�� ����");  //�������� Ÿ��Ʋ �ޱ�
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java"); //�⺻�� love java
		c.add(la);
		
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') { //+ ������ �۾�ũ�� ����
					JLabel a = (JLabel)e.getSource();
					Font f = a.getFont();
					int size = f.getSize();
					a.setFont(new Font("Arial", Font.PLAIN, size+5)); 					
				}
				if(e.getKeyChar() == '-') { //- ������ �۾� ũ�� ����
					JLabel a = (JLabel)e.getSource();
					Font f = a.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					a.setFont(new Font("Arial", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(400,200); //(400,200) ȭ�� ���
		setVisible(true);
		
		la.setFocusable(true); 
		la.requestFocus(); // ���̺� Ű �Է� ��Ŀ�� ����
	}
			
	static public void main(String [] args) {
		new FontSize();
	}
}