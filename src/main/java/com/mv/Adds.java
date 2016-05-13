package com.mv;

import javax.swing.*;

/**
 * Additional methods.
 * Created by Dimon on 06.05.2015.
 */
public class Adds {

    /**
     * Shows JOptionPanel message dialog.<br>
     * Messages can be one of these types:<br>
     *     0 - ERROR message;<br>
     *     1 - WARNING message;<br>
     *     2 - QUESTION message;<br>
     *     3 - INFORMATION message;<br>
     *     4 - PLAIN message.<br>
     * @param message information for user
     * @param type message type
     */
    public static void showMessage(String message, int type){
        if (type == 0){
            JOptionPane.showMessageDialog(null,message,"Сообщение об ошибке",JOptionPane.ERROR_MESSAGE);
        } else if (type == 1) {
            JOptionPane.showMessageDialog(null,message,"Предупреждение",JOptionPane.WARNING_MESSAGE);
        } else if (type == 2) {
            JOptionPane.showMessageDialog(null,message,"Запрос",JOptionPane.QUESTION_MESSAGE);
        } else if (type == 3) {
            JOptionPane.showMessageDialog(null,message,"Информационное сообщение",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,message,"Сообщение", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void recordNoticeToConsole(String notice){
        System.out.println("NOTICE: "+notice);
    }

    public static boolean checkLogin(String login){
        if (login == null) {
            recordNoticeToConsole("login is null.");
            return false;
        }
        if (login.length() < 4 || login.length() > 30){
            showMessage("Длинна имени пользователя должна быть от 4 до 30 символов.",4);
            return false;
        }
        if (!login.matches("^[a-zA-Zа-яА-Я][a-zA-Zа-яА-Я0-9-_\\.]{3,28}$")){
            showMessage("Имя пользователя содержит запрещённые символы.\nИмя пользователя может состоять из букв, цифр, тире, точки или знака подчёркивания и начинаться должно с буквы.",4);
            return false;
        }
        return true;
    }

    public static boolean checkPassword(char[] password){
        if (password == null){
            recordNoticeToConsole("password is null");
            return false;
        }
        if (password.length < 4 || password.length > 50){
            showMessage("Длинна пароля должна быть от 4 до 50 символов.",4);
            return false;
        }
        return true;
    }

}
