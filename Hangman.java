import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Hangman extends Application {
	
	
	Pane pane = new Pane();

	@Override
	public void start(Stage primaryStage) {


		ImageView hangman = new ImageView("serveimage.png");
		hangman.setFitHeight(200);
		hangman.setFitWidth(500);
		pane.getChildren().add(hangman);
		
		ImageView letters = new ImageView("serveimage.jpe");
		letters.setLayoutX(0);
		letters.setLayoutY(200);
		letters.setFitHeight(150);
		letters.setFitWidth(400);
		letters.setOnMouseClicked(CrossOut());
		pane.getChildren().add(letters);

		//pane.getChildren().add(line1);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Hangman");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public EventHandler<? super MouseEvent> CrossOut() {
		Line line1 = new Line(10, 220, 75, 220);
		line1.setStrokeWidth(5);
		line1.setStroke(Color.RED);
		pane.getChildren().add(line1);
		
		return null;
	}
	
	public void wdusiefjsueif(){
		System.out.println("fnvduivnfuse");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
