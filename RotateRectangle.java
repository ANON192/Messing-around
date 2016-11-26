import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateRectangle extends Application{
	
	
	int rotate = 0;
	
	public void start(Stage primaryStage){
		
		StackPane pane = new StackPane();
		
		Rectangle rectangle = new Rectangle(200, 500);
		rectangle.setStroke(Color.BLUE);
		
		pane.getChildren().add(rectangle);
		
		
		
		
		Button btRotate = new Button("Rotate");
		
		btRotate.setOnAction( e ->{
			rectangle.setRotate(rotate);
			rotate -= 15;
		});
		
		
		HBox hbox = new HBox();
		hbox.getChildren().add(btRotate);
		hbox.setAlignment(Pos.CENTER);
		
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hbox);
		
		
		Scene scene = new Scene(borderPane, 700, 700);
		primaryStage.setTitle("HAHA");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	
	
	public static void main(String [] args){
		launch(args);
	}
	
}