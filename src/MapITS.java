import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MapITS extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Markers
        String x,y,width,height,cx,cy,r;
        double xMax,yMax;
        xMax = 842;
        yMax = 1090;
        
        RectangleSVG stadionITS = new RectangleSVG(x="189.3333",y="684",width="60",height="101.6667");
        stadionITS.setAll(xMax,yMax,"Stadion ITS",90,30);
        stadionITS.setGroup();
        
        CircleSVG grahaITS = new CircleSVG(cx="172.1786",cy="174.6786",r="24.75");
        grahaITS.setAll(xMax,yMax,"Graha ITS",90,30);
        grahaITS.setGroup();
        
        CircleSVG bundaranITS = new CircleSVG(cx="97.8393",cy="329.4821",r="32.4107");
        bundaranITS.setAll(xMax,yMax,"Bundaran ITS",90,30);
        bundaranITS.setGroup();
        
        RectangleSVG towerMIPA = new RectangleSVG(x="316.5",y="697",width="39.8571",height="23.7857");
        towerMIPA.setAll(xMax,yMax,"Tower FMIPA ITS",120,30);
        towerMIPA.setGroup();
        
        RectangleSVG towerElektro = new RectangleSVG(x="386.5714",y="713.7143",width="38.5714",height="32.1429");
        towerElektro.setAll(xMax,yMax,"Tower Elektro ITS",120,30);
        towerElektro.setGroup();
        
        RectangleSVG gedungRobotika = new RectangleSVG(x="533.7857",y="179.5",width="79.0714",height="43.7143");
        gedungRobotika.setAll(xMax,yMax,"Gedung Robotika ITS",120,30);
        gedungRobotika.setGroup();
        
        RectangleSVG gedungRiset = new RectangleSVG(x="526.7143",y="430.2143",width="32.7857",height="37.9286");
        gedungRiset.setAll(xMax,yMax,"Gedung Riset ITS",120,30);
        gedungRiset.setGroup();
        
        RectangleSVG deptInformatika = new RectangleSVG(x="514.5",y="326.0714",width="54",height="59.1429");
        deptInformatika.setAll(xMax,yMax,"Departemen Informatika ITS",180,30);
        deptInformatika.setGroup();
        
        RectangleSVG masjidManarulIlmi = new RectangleSVG(x="243.2143",y="514.4286",width="41.1429",height="41.1429");
        masjidManarulIlmi.setAll(xMax,yMax,"Masjid Manarul Ilmi",120,30);
        masjidManarulIlmi.setGroup();
        
        CircleSVG perpustakaanITS = new CircleSVG(cx="427.1429",cy="484.25",r="15.1071");
        perpustakaanITS.setAll(xMax,yMax,"Perpustakaan ITS",90,30);
        perpustakaanITS.setGroup();
        
        CircleSVG bundaranUtaraITS = new CircleSVG(cx="577.1786",cy="20.3929",r="17.6786");
        bundaranUtaraITS.setAll(xMax,yMax,"Bundaran Utara ITS",90,30);
        bundaranUtaraITS.setGroup();
        
        final ImageView selectedImage = new ImageView();
        String imagePath = "images/map.png";
        Image backgroundImage = new Image(getClass().getResource(imagePath).toString());
        selectedImage.setImage(backgroundImage);
        
        RectangleSVG rektoratITS = new RectangleSVG(x="346.7143",y="456.5714",width="30.2143",height="30.2143");
        rektoratITS.setAll(xMax,yMax,"Rektorat ITS",90,30);
        rektoratITS.setGroup();
        
        RectangleSVG asramaITS = new RectangleSVG(x="56.7857",y="851.9286",width="179.3571",height="140.7857");
        asramaITS.setAll(xMax,yMax,"Asrama ITS",90,30);
        asramaITS.setGroup();
        
        Group root = new Group();
        
        root.getChildren().addAll(selectedImage);
        root.getChildren().addAll(stadionITS.object,grahaITS.object,bundaranITS.object,towerMIPA.object,towerElektro.object,gedungRobotika.object,gedungRiset.object,deptInformatika.object,masjidManarulIlmi.object,perpustakaanITS.object,bundaranUtaraITS.object,rektoratITS.object,asramaITS.object);
        
        
        ScrollPane sp = new ScrollPane();
        sp.setContent(root);
        
        Scene scene = new Scene(sp,700, 700);
        primaryStage.setTitle("MapITS: Map of ITS Surabaya");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
