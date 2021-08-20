package application;

import com.sun.glass.ui.Application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Tetris extends Application {
    
    // instance variables
    private final static int SIZE = 20;
    private final static int MOVE = 20;
    private final static int XMAX = 400;
    private final static int YMAX = 600;
    
    // game board
    private static int[][] board = new int[400][600];
    
    
    public void start(Stage arg0) throws Exception {
        
    }
    
    
}
