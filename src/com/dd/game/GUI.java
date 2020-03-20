package com.dd.game;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main (String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        //name of game
        Group root = new Group();



        Text tx = new Text(150,100,"2048");
        tx.setStyle("-fx-font: 60 arial;");
        root.getChildren().add(tx);
        Rectangle[] rect = new Rectangle[16];
        //few buttons
        Button newGame = new Button();
        newGame.setStyle("-fx-font: 20 arial;");
        newGame.setText("New Game");
        newGame.setTranslateX(430);
        newGame.setTranslateY(100);
        newGame.setPrefSize(140,70);
        root.getChildren().add(newGame);

        //board
        for(int j=2;j<6;++j){
            for(int i=0;i<4;++i){
                rect[i] = new Rectangle(100*i, 100*j, 100, 100);
                rect[i].setArcHeight(20);
                rect[i].setArcWidth(20);
                rect[i].setFill(Color.ORANGE);
                rect[i].setStroke(Color.BLACK);
                root.getChildren().add(rect[i]);
            }
        }
        Scene scene = new Scene(root, 600, 600);
        scene.setFill(Color.LIGHTGREY);
        stage.setTitle("2048(Dmitry Orlov)");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
