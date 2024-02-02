package com.java.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 종료 버튼에 들어가는 ActionListener 구현하기.
public class ExitActionListener implements ActionListener{
	@Override
    public void actionPerformed(ActionEvent e) {
        // 종료 버튼 클릭 시 프로그램 종료
        System.exit(0);
    } 
}
