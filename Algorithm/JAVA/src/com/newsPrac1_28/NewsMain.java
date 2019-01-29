package com.newsPrac1_28;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;


/*
 * DAO가 하는 일이 1. XML문서를 읽어서 파싱
 * 2. 파싱한 결과를 LIST에 담아놓는다.
 * 
 * Main GUI Event 처리
 * 
 */
public class NewsMain {
	JFrame f;
	JButton b ;
	JList li ;
	NewsDAO dao;

	public NewsMain() {
		try {
			dao = new NewsDAO();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		createGUI();
		addEvent();
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
	}

	protected void showList() {
		// dao한테서 파싱한 결과가 들어 있는 ArrayList 바당오기
		// 받아온 ArrayListfh ghkaus(JList)에 뿌리기
		List<News> data = dao.getNewsData();
		
		// ArrayList를 배열로 바꾼다음에 집어넣어주면
		// 하나씩 하나씩 꺼내서 list에 한줄씩 보여준다.
		System.out.println(Arrays.toString(data.toArray()));
		li.setListData(data.toArray());
	}

	private void createGUI() {
		f = new JFrame("News Info");
		b = new JButton("call News");
		
		
		li = new JList();
		JScrollPane pane = new JScrollPane(li);
		Container c = f.getContentPane();
		
		c.add(b, "North");
		c.add(pane, "Center");
		
		f.setSize(1200, 1200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new NewsMain();
	}


}
