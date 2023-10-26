
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
public class CircleSVG extends ObjectSVG {
    private final double cx;
    private final double cy;
    private final double r;
    
    public CircleSVG(String cx, String cy, String r) {
        this.cx = Double.parseDouble(cx);
        this.cy = Double.parseDouble(cy);
        this.r = Double.parseDouble(r);
    }
    
    public void setArea(){
        this.area = new Circle(cx,cy,r);            
        this.area.setFill(Color.TRANSPARENT);
        this.area.setVisible(true);
    }
    public void setLabel(String nameLabel, double widthLabel, double heightLabel){
        this.label = new Label(nameLabel);
        double xLabel, yLabel, gap;
        
        gap = 3;
        if (this.cx+this.r+gap >= this.xMax-widthLabel){
            xLabel = this.cx-0.125*this.r-widthLabel;
        } else {
            xLabel = this.cx+0.375*this.r; 
        }
        if (this.cy+this.r+gap >= this.yMax-heightLabel){
            yLabel = this.cy-0.125*this.r-heightLabel;
        } else {
            yLabel = this.cy+0.375*this.r; 
        }
        
        this.label.setLayoutX(xLabel);
        this.label.setLayoutY(yLabel);
        this.label.setVisible(false);
        
        this.labelBox = makeRectangle(xLabel,yLabel,widthLabel,heightLabel);
    }
    public void setLine(){

        this.line = new Line(cx,cy,this.label.getLayoutX(),this.label.getLayoutY());
        this.line.setStroke(Color.WHITE);
        this.line.setStrokeWidth(1.5);
        this.line.setVisible(false);
        
        this.center = new Circle(cx,cy,2.7);
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
