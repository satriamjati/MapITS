/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
/**
 *
 * @author GaLa
 */
public class ObjectSVG {
    
    Shape area;
    Label label;
    Rectangle labelBox;
    double xMax, yMax;
    Line line;
    Circle center;
    Group object;
    
    public void setGroup(){
        this.object = new Group();
        object.getChildren().addAll(this.showCenter(),this.showLine(),this.showLabelBox(),this.showLabel(),this.showArea());
    }

    public void setHover(){
        
        this.area.setOnMouseEntered(event -> {
            this.labelBox.setFill(Color.LIGHTGREY);
            this.label.setVisible(true);
            this.line.setVisible(true);
            this.center.setVisible(true);

        });
        this.area.setOnMouseExited(event -> {
            this.labelBox.setFill(Color.TRANSPARENT);
            this.label.setVisible(false);
            this.line.setVisible(false);
            this.center.setVisible(false);
        });
    }
    
    public Rectangle makeRectangle(double x,double y,double width,double height){
        Rectangle rectangle = new Rectangle(x,y,width,height);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setVisible(true);
        return rectangle;
    }
    
    public void setScreenSize(double x, double y){
        this.xMax = x;
        this.yMax = y;
    }

    public Shape showArea(){
        return area;
    }
    
    
    public Label showLabel(){
        return label;
    }
    
    public Rectangle showLabelBox(){
        return labelBox;
    }
    
    public Line showLine(){
        return line;
    }
    
    public Circle showCenter(){
        return center;
    }
    
   
 }
/*    Uncomplete SVG points-based marker   
    
//    public void setPath(){
//        this.path = new SVGPath();
//        this.path.setContent(points);
//        this.path.setFillRule(FillRule.NON_ZERO);
//        this.path.setFill(Color.BLUE);
//        this.path.setVisible(true);
//    }
*/

// minimum to none error handling
// automation from SVG

/*    Uncomplete SVG points-based marker   
    
//    public ObjectSVG(String points) {
//        this.points = points;
//    }
*/    