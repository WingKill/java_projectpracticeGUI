package com.java.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
	public LoginFrame() {
        JFrame loginFrame = new JFrame("Login");

        // 패널 생성
        JPanel panel = new JPanel();
        loginFrame.add(panel);
        panel.setLayout(new GridLayout(3, 2));

        // 레이블 생성
        JLabel userLabel = new JLabel("사용자 이름:");
        JLabel passwordLabel = new JLabel("비밀번호:");
        panel.add(userLabel);
        panel.add(passwordLabel);

        // 입력 필드 생성
        JTextField userText = new JTextField(20);
        JPasswordField passwordText = new JPasswordField(20);
        panel.add(userText);
        panel.add(passwordText);

        // 로그인 버튼 생성
        JButton loginButton = new JButton("로그인");
        panel.add(loginButton);

        // 로그인 버튼에 액션 리스너 추가
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 사용자 이름과 비밀번호를 가져옴
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // 여기서는 간단하게 사용자 이름과 비밀번호를 확인하여 성공 여부를 판단
                // 실제로는 서버와 통신하여 인증 과정을 수행하게 됨

                // 예를 들어, 사용자 이름이 "admin", 비밀번호가 "admin123"일 때 로그인 성공으로 가정
                if ("admin".equals(username) && "admin123".equals(password)) {
                    // 로그인 성공 시 새로운 JFrame을 생성하여 다른 화면을 보여줌
                    JFrame mainFrame = new FirstFrame();            
                    // 현재 로그인 창을 닫음
                    loginFrame.dispose();
                } else {
                    // 로그인 실패 시 메시지 출력
                    JOptionPane.showMessageDialog(null,
                    		"로그인 실패. 사용자 이름과 비밀번호를 확인해주세요.",
                    		"로그인 실패", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginFrame.setSize(300, 150);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
    }	
}
