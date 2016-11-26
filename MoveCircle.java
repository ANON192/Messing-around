import javafx.application.Application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
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

public class MoveCircle extends Application{

	int x = 0;
	int y = 0;
	
	
	public void start (Stage primaryStage){
		
		Pane pane = new Pane();
		
		
		Circle circle = new Circle(20);
		
		circle.setFill(Color.BLUE);
		
		circle.setLayoutX(x);
		circle.setLayoutY(y);
		
		pane.getChildren().add(circle);
		
		
		HBox hbox = new HBox();
		
		RadioButton btUp = new RadioButton("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button ("Right");
		
		
		btUp.setOnAction(e -> {
			if(btUp.isSelected()){
			y -= 15;
			}
			circle.setLayoutY(y);
		});
		
		btDown.setOnAction(e -> {
			y += 15;
			circle.setLayoutY(y);
		});
		
		btLeft.setOnAction(e -> {
			x -= 15;
			circle.setLayoutX(x);
		});
		
		btRight.setOnAction(e -> {
			x += 15;
			circle.setLayoutX(x);
		});
		
		
		hbox.getChildren().addAll(btUp, btDown, btLeft, btRight);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hbox);
		
		
		Scene scene = new Scene(borderPane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Lool");
		primaryStage.show();
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
		
		
	}

}
