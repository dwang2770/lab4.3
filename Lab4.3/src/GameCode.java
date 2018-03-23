
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameCode extends Application
{
	private static int score = 0;
	
	public static void main(String[] args)
	{
       
		launch(args);
    }

	public void start (Stage primaryStage)
	{
		
		
		primaryStage.setTitle("Does This Button Work?");
		Button btn = new Button();
		btn.setText("Does This Button Work?");
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle (ActionEvent event)
			{
				if (scoring)
					{
					score++;
					}
				else {
					score--
				}
				
			}
		});
		
		timeStep = System.nanoTime() + 1000000000L;
		new AnimationTimer()
		{
			public void handle(long now )
		}
		
	StackPane root = new StackPane();
	root.getChildren().add(btn);
	primaryStage.setScene(new Scene(root, 300, 250));
	primaryStage.show();
	}
}
