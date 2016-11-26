import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CircleCatch extends Application{
	
	int count = 0;
	
	public void start(Stage primaryStage) throws Exception {
		
		int size = 50;
		
		StackPane pane = new StackPane();
		
		Polygon circlePath = new Polygon();
		ObservableList<Double> list = circlePath.getPoints();
		int sides = 8;
		for(int i = 0; i < sides; i++){
			double x = 300 * (Math.cos((2 * Math.PI / sides) * i));
			list.add(x);
			
			double y = 300 * (Math.sin((2 * Math.PI / sides) * i));
			list.add(y);
		}
		
		circlePath.setStroke(Color.BLACK);
		circlePath.setFill(Color.DARKBLUE);
		
		Circle circle = new Circle();
		circle.setRadius(size);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.LIMEGREEN);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(5000));
		pt.setPath(circlePath);
		pt.setNode(circle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(5);
		pt.setAutoReverse(false);
		pt.play(); // Start animation

		

		
		circle.setOnMouseClicked(e ->{
			count++;
			
			int red, green, blue;
			red = (int) ((Math.random() * (255)));
			green = (int) ((Math.random() * (255)));
			blue = (int) ((Math.random() * (255)));
			
			circle.setFill(Color.rgb(red, green, blue));
			System.out.println(red + " " + green + " " + blue);
			System.out.println(count);
		});
		
		
		
		
		pane.getChildren().addAll(circlePath, circle);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Game thingamabob");
		primaryStage.show();
		
	}
	
	
	public static void main(String []args){
			launch();
	}
}
