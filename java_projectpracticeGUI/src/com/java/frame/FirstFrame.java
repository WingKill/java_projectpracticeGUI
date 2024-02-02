package com.java.frame;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FirstFrame extends JFrame{
	public FirstFrame(){
		setTitle("컴포넌트 붙이기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 프레임 종료버튼 사용 시 응용 프로그램도 종료시키기
        
        // 팬으로 사용할 패널 가져오기
        Container contentPane = getContentPane();
        // 패널 배경색 설정
        contentPane.setBackground(Color.white);
        // 패널 레이아웃 설정
        contentPane.setLayout(new FlowLayout());
        
        // 버튼 생성
        JButton allListBtn = new JButton("전체 목록");
        JButton myListBtn = new JButton("내 게시글 보기");
        JButton myWriteBtn = new JButton("새 게시글 작성");
        JButton myDeleteBtn = new JButton("내 게시글 삭제");
        JButton exitBtn = new JButton("종료");
        // 패널에 버튼 추가하기
        contentPane.add(allListBtn);
        contentPane.add(myListBtn);
        contentPane.add(myWriteBtn);
        contentPane.add(myDeleteBtn);
        contentPane.add(exitBtn);
        ActionListener exitAL = new ExitActionListener(); 
        // 강제로 종료하는 ExitActionListener를 구현한 상태. 
        // 종료 버튼의 ActionListener에 대입하여, 해당 버튼을 누르면 강제종료하도록 바꾸기.
        exitBtn.addActionListener(exitAL);
        
        setSize(600, 400);
        setVisible(true);
	}
}
