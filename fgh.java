import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class fgh extends Application{



		@Override
		//public void start(Stage arg0) throws Exception {
	
		public void start(Stage primaryStage) {

		
		Pane pane = new Pane();
		
		Scene scene = new Scene(pane, 300,300);
		
		Circle circle = new Circle(50);
		
		circle.setCenterX(150);
		circle.setCenterY(95);
		
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLACK);
		
		pane.getChildren().add(circle);
		
		
		
		
		Rectangle rectangle = new Rectangle(140, 50);
		rectangle.setFill(Color.GREEN);
		rectangle.setStroke(Color.GREEN);
		rectangle.setLayoutX(80);
		rectangle.setLayoutY(150);
		rectangle.setRotate(15);
		pane.getChildren().add(rectangle);
		
		
		Polygon triangle = new Polygon();
		triangle.getPoints().addAll(new Double[] {
				160.0, 202.0,
				75.0, 275.0,
				225.0, 275.0,
		});
		triangle.setFill(Color.BLUE);
		triangle.setStroke(Color.BLACK);
		pane.getChildren().add(triangle);
		
		
		
		Label label = new Label("Good design is about balence!");
		label.setFont(Font.font(16));
		label.setLayoutX(30);
		label.setTextFill(Color.PURPLE);
		label.setLayoutY(35);
		//label.setStyle("TIMES NEW ROMAN");
		pane.getChildren().add(label);
		
		
		
		
		
		//primaryStage.setTitle("BNEJFNSFK");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		}
		
		
		
		
		public static void main(String[] args) {
			launch(args);
			
		}

	}
