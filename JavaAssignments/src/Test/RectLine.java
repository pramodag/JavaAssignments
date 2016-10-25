package Test;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectLine extends Application {
	public static final String CLIPIDENTIFIER = "Excersix";

	public static void main(String[] args) {
		launch(args);

	}
//@Pratibha Chandrappa Kadasur
	//student ID: S1600455001
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creating window
		primaryStage.setTitle("Rectangle Line Exercise");
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600, Color.WHITE);
		primaryStage.setScene(scene);
		// Setting system clipboard for a fresh start
//		Clipboard clip = Clipboard.getSystemClipboard();
//		ClipboardContent clipContent = new ClipboardContent();
//		clipContent.putString("");
//		clip.setContent(clipContent);

		// CReating a Hbox for radio buttons
		HBox hbox = new HBox();
		hbox.setMinWidth(scene.getWidth());
		hbox.setPadding(new Insets(10, 12, 10, 12));
		hbox.setSpacing(150); // Gap between nodes
		// Creating a toggle group to group radio buttons
		ToggleGroup tg1 = new ToggleGroup();
		// Creating radio buttons.
		RadioButton rb1 = new RadioButton();
		rb1.setText("Rectangle");
		rb1.setUserData("rectangle");
		rb1.setSelected(true);
		rb1.setToggleGroup(tg1);

		RadioButton rb2 = new RadioButton();
		rb2.setText("Line");
		rb2.setUserData("line");
		rb2.setToggleGroup(tg1);
		// adding radio buttons to Hbox
		hbox.getChildren().addAll(rb1, rb2);
		// adding hbox to root
		root.getChildren().addAll(hbox);

		// adding on mouse clicked event for creating rectangles
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if ("rectangle".equalsIgnoreCase(tg1.getSelectedToggle().getUserData().toString())) {
					Rectangle rect = new Rectangle(80, 80, Color.BLUE);
					rect.setX(event.getX());
					rect.setY(event.getY());
					// setting mouse click event
					rect.setOnMouseClicked(new EventHandler<MouseEvent>() {

						@Override
						public void handle(MouseEvent event) {
							// getting system clipboard.
							Clipboard clipboard = Clipboard.getSystemClipboard();
							String clipboardString = clipboard.getString();
							ClipboardContent content = new ClipboardContent();
							// reading clipboard content and checking if it
							// matches our content.
							if (!clipboardString.startsWith(CLIPIDENTIFIER)) {
								//Clipboard dosen't have required content. That means we clicked on first rectangle. Copying rectangle mid points to clipboard.
								content.putString(CLIPIDENTIFIER +":"+ (rect.getX() + rect.getWidth() / 2) + ":"
										+ (rect.getY() + rect.getHeight() / 2));
								clipboard.setContent(content);
							} else {
								//Clipboard has required content. This means we clicked on second rectangle. Drawing Line.
								String[] values = clipboardString.split(":");
								//converting string to double
								double x = Double.parseDouble(values[1]);
								double y = Double.parseDouble(values[2]);
								//Creating a new line object to draw line.
								Line line = new Line();
								//Setting line starting point with values copied from clipboard.
								line.setStartX(x);
								line.setStartY(y);
								//Getting 2.nd point to draw the line.
								line.setEndX(rect.getX() + rect.getWidth() / 2);
								line.setEndY(rect.getY() + rect.getHeight() / 2);
								//setting thickness of line
								line.setStrokeWidth(2);
								//removing clipboard content so next rectangle will be treated as first rectangle point for new line
								content.putString("");
								clipboard.setContent(content);
								//adding newly created line to the root elements.
								root.getChildren().add(line);
							}
						}
					});
					root.getChildren().add(rect);
				}
			}
		});
		primaryStage.show();
	}
}