
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GaLa
 */
public class RectangleSVG extends ObjectSVG {
    private final double x;
    private final double y;
    private final double width;
    private final double height;
    
    public RectangleSVG(String x, String y, String width, String height) {
        this.x = Double.parseDouble(x);
        this.y = Double.parseDouble(y);
        this.width = Double.parseDouble(width);
        this.height = Double.parseDouble(height);
    }
    
    public void setArea(){
        this.area = makeRectangle(this.x,this.y,this.width,this.height);
    }
    public void setLabel(String nameLabel, double widthLabel, double heightLabel){
        this.label = new Label(nameLabel);
        double xLabel, yLabel, gap;
        
        gap = 3;
        if (this.x+this.width+gap >= this.xMax-widthLabel){
            xLabel = this.x-0.25*this.width-widthLabel;
        } else {
            xLabel = this.x+0.75*this.width; 
        }
        if (this.y+this.height+gap >= this.yMax-heightLabel){
            yLabel = this.y-0.25*this.height-heightLabel;
        } else {
            yLabel = this.y+0.75*this.height; 
        }
        
        this.label.setLayoutX(xLabel);
        this.label.setLayoutY(yLabel);
        this.label.setVisible(false);
        
        this.labelBox = makeRectangle(xLabel,yLabel,widthLabel,heightLabel);
    }
    public void setLine(){
        double xCenter, yCenter;
        xCenter = this.x+0.5*this.width;
        yCenter = this.y+0.5*this.height;
        this.line = new Line(xCenter,yCenter,this.label.getLayoutX(),this.label.getLayoutY());
        this.line.setStroke(Color.WHITE);
        this.line.setStrokeWidth(1.5);
        this.line.setVisible(false);
        
        this.center = new Circle(xCenter,yCenter,2.7);
        this.center.setFill(Color.RED);
        this.center.setVisible(false);
    }
    
    public void setAll(double xMax, double yMax, String nameLabel, double widthLabel, double heightLabel){
        this.setScreenSize(xMax,yMax);
        this.setArea();
        this.setLabel(nameLabel,widthLabel,heightLabel);
        this.setLine();
        this.setHover();
    }

}
