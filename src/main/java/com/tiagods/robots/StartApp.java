package com.tiagods.robots;

import com.tiagods.robots.g5.CadastroREINF;
import javafx.application.Application;
import javafx.stage.Stage;

public class StartApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        new CadastroREINF();
    }
    public static void main(String[] args){
        launch(args);
    }
}
