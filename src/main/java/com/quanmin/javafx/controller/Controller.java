package com.quanmin.javafx.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label loginText;

    public void pddLogin(ActionEvent actionEvent) {
        loginText.setText("登录成功");
    }
}
