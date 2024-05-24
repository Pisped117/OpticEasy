package com.app.opticeasy.opticeasyapp.presentation;

import com.app.opticeasy.opticeasyapp.OpticeasyAppApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class PersonaFx extends Application {

    private ConfigurableApplicationContext applicationContext;
    /*public static void main(String[] args) {
        launch(args);
    }*/

    @Override
    public void init (){
        this.applicationContext = new SpringApplicationBuilder(OpticeasyAppApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(OpticeasyAppApplication.class.getResource("/templates/personaView.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void stop (){
        applicationContext.close();
    }
}
