/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brooks_3_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;



/**
 *
 * @author colby
 */
public class Brooks_3_javafx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
    	Group root = new Group();
    	Canvas canvas = new Canvas(1280, 720);
    	GraphicsContext gc = canvas.getGraphicsContext2D();
    	for(int i=0; i < 1000; i+=40 ){
    	drawSquares1(gc, Math.random()*i, Math.random()*i,Math.random()*i,Math.random()*i);
    	}
    	for(int i=0; i < 1000; i+=40 ){
    	drawSquares2(gc, Math.random()*i, Math.random()*i,Math.random()*i,Math.random()*i);
    	}
    	for(int i=0; i < 1000; i+=40 ){
    	drawSquares2(gc, Math.random()*i+100, Math.random()*i+100,Math.random()*i,Math.random()*i);
    	}
    	for(int i=0; i < 1000; i+=40 ){
    	drawSquares3(gc, Math.random()*i, Math.random()*i,Math.random()*i,Math.random()*i);
    	}
    	root.getChildren().add(canvas);
    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
	}

  
	private void drawSquares(GraphicsContext gc, double x, double y, double w, double h) {
           	gc.setLineWidth(4);
           	gc.setStroke (Color.web("BLUE", .5));
           	gc.setFill(Color.web("BLUE",.1));
           	gc.fillRect(x, y, w, h);
            	gc.strokeRect(x,y,w,h);
          	 
	}
    
    	private void drawSquares1(GraphicsContext gc, double x, double y, double w, double h) {
           	gc.setLineWidth(3);
           	gc.setStroke (Color.web("LIMEGREEN", .5));
           	gc.setFill(Color.web("LIMEGREEN",.1));
           	gc.fillRect(x, y, w, h);
            	gc.strokeRect(x,y,w,h);
	}
   	 
        	private void drawSquares2(GraphicsContext gc, double x, double y, double w, double h) {
           	gc.setLineWidth(4);
           	gc.setStroke (Color.web("PURPLE", .5));
           	gc.setFill(Color.web("PURPLE",.1));
           	gc.fillRect(x, y, w, h);
           	gc.strokeRect(x,y,w,h);
	}
       	 
            	private void drawSquares3(GraphicsContext gc, double x, double y, double w, double h) {
           	gc.setLineWidth(3);
           	gc.setStroke (Color.web("DARKBLUE", .5));
           	gc.setFill(Color.web("DARKBLUE",.1));
           	gc.fillRect(x, y, w, h);
            	gc.strokeRect(x,y,w,h);
	}
    

    }

    /**
     * @param args the command line arguments
     */

    
    

