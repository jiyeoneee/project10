import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionEx extends JFrame {
	public MouseMotionEx() {
		setTitle("�巡�뵿�� YELLOW");	 //�������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		Container c = getContentPane();
		c.setBackground(Color.GREEN);	//���� green
		MyMouseListener a = new MyMouseListener();
		c.addMouseMotionListener(a);
		c.addMouseListener(a);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW); //�巡�� �� yellow
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN); //���콺 �̵��� green
		}		
	}
	static public void main(String [] args) {
		new MouseMotionEx();
	}
}