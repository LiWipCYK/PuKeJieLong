package pukejielong;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * Organise In Project: PuKeJieLong
 * Author: liaow
 * Date: 2018-8-18
 * Time: 14:16
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class MainUI extends JFrame {
    JPanel usernamePanel, passwordPanel, buttonPanel;
    JLabel usernameLable, passwordLable;
    JTextField usernameField, passwordField;
    JButton loginButton, registerButton;

    public static void main(String[] args) {
        new MainUI();
    }

    public MainUI() {
        usernamePanel = new JPanel();
        passwordPanel = new JPanel();
        buttonPanel = new JPanel();

        usernameLable = new JLabel("用户名：");
        usernameField = new JTextField(10);

        passwordLable = new JLabel("密码：");
        passwordField = new JTextField(10);

        loginButton = new JButton("登录");
        registerButton = new JButton("注册");

        usernamePanel.add(usernameLable);
        usernamePanel.add(usernameField);

        passwordPanel.add(passwordLable);
        passwordPanel.add(passwordField);

        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);


        this.setLayout(new GridLayout(3,2));

        this.add(usernamePanel);
        this.add(passwordPanel);
        this.add(buttonPanel);

        //设置窗体属性
        this.setTitle("登录注册面板演示");
        this.setSize(300, 150);
        this.setLocation(500, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
