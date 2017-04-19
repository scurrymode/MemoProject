package main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class MemoMain extends JFrame{
	
	JTextArea area;
	JMenuBar bar;
	JScrollPane scroll;
	JMenu menu_file;
	JMenu menu_edit;
	JMenu menu_form;
	JMenu menu_view;
	JMenu menu_help;
	JMenuItem m_file_new;
	JMenuItem m_file_open;
	JMenuItem m_file_save;
	JMenuItem m_file_asave;
	JMenuItem m_file_page;
	JMenuItem m_file_print;
	JMenuItem m_file_exit;
	JMenuItem m_edit_undo;
	JMenuItem m_edit_cut;
	JMenuItem m_edit_copy;
	JMenuItem m_edit_paste;
	JMenuItem m_edit_delete;
	JMenuItem m_edit_find;
	JMenuItem m_edit_nextFind;
	JMenuItem m_edit_switch;
	JMenuItem m_edit_move;
	JMenuItem m_edit_all;
	JMenuItem m_edit_date;
	JMenuItem m_form_changeLine;
	JMenuItem m_form_font;
	JCheckBoxMenuItem m_view_status;
	JMenuItem m_help_show;
	JMenuItem m_help_info;
	
	
	
	public MemoMain() {
		setTitle("제목 없음 - 메모장");
		bar = new JMenuBar();
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		menu_file = new JMenu("파일(F)");
		menu_edit = new JMenu("편집(E)");
		menu_form = new JMenu("서식(O)");
		menu_view = new JMenu("보기(V)");
		menu_help = new JMenu("도움말(H)");
		
		setFileMenu();
		setEditMenu();
		setFormMenu();
		setViewMenu();
		setHelpMenu();
		
		bar.add(menu_file);
		bar.add(menu_edit);
		bar.add(menu_form);
		bar.add(menu_view);
		bar.add(menu_help);		
		
		setJMenuBar(bar);
		add(scroll);
		
		setBounds(200, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void setFileMenu(){
		m_file_new = new JMenuItem("새로 만들기(N)");
		m_file_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		m_file_open = new JMenuItem("열기(O)...");
		m_file_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		m_file_save = new JMenuItem("저장(S)");
		m_file_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		m_file_asave = new JMenuItem("다른 이름으로 저장(A)...");
		m_file_page = new JMenuItem("페이지 설정(U)...");
		m_file_print = new JMenuItem("인쇄(P)...");
		m_file_print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		m_file_exit = new JMenuItem("끝내기(X)");
		
		menu_file.add(m_file_new);
		menu_file.add(m_file_open);
		menu_file.add(m_file_save);
		menu_file.add(m_file_asave);
		menu_file.addSeparator();
		menu_file.add(m_file_page);
		menu_file.add(m_file_print);
		menu_file.addSeparator();		
		menu_file.add(m_file_exit);
		
	}
	
	public void setEditMenu(){
		m_edit_undo = new JMenuItem("실행 취소(U)");
		m_edit_undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		m_edit_cut = new JMenuItem("잘라내기(T)");
		m_edit_cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		m_edit_copy = new JMenuItem("복사(C)");
		m_edit_copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		m_edit_paste = new JMenuItem("붙여넣기(P)");
		m_edit_paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		m_edit_delete = new JMenuItem("삭제(L)");
		
		m_edit_find = new JMenuItem("찾기(F)");
		m_edit_find.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		m_edit_nextFind = new JMenuItem("다음 찾기(N)");
		
		m_edit_switch = new JMenuItem("바꾸기(R)");
		m_edit_switch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		m_edit_move = new JMenuItem("이동(G)");
		m_edit_move.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		m_edit_all = new JMenuItem("모두 선택(A)");
		m_edit_all.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		m_edit_date = new JMenuItem("시간/날짜(D)");
		
		menu_edit.add(m_edit_undo);
		menu_edit.addSeparator();
		menu_edit.add(m_edit_cut);
		menu_edit.add(m_file_save);
		menu_edit.add(m_edit_copy);
		menu_edit.add(m_edit_delete);
		menu_edit.addSeparator();		
		menu_edit.add(m_edit_find);	
		menu_edit.add(m_edit_nextFind);
		menu_edit.add(m_edit_switch);
		menu_edit.add(m_edit_move);
		menu_edit.addSeparator();	
		menu_edit.add(m_edit_all);
		menu_edit.add(m_edit_date);
		
	}
	public void setFormMenu(){
		m_form_changeLine=new JMenuItem("자동 줄 바꿈(W)");
		m_form_font = new JMenuItem("글꼴(F)...");
		
		menu_form.add(m_form_changeLine);
		menu_form.add(m_form_font);
		
	}
	public void setViewMenu(){
		m_view_status = new JCheckBoxMenuItem("상태표시줄(S)");
		m_view_status.setSelected(false);
		menu_view.add(m_view_status);
	}
	public void setHelpMenu(){
		m_help_show = new JMenuItem("도움말 보기(H)");
		m_help_info = new JMenuItem("메모장 정보(A)");
		menu_help.add(m_help_show);
		menu_help.add(m_help_info);
	}
	
	public static void main(String[] args) {
		new MemoMain();

	}

}
