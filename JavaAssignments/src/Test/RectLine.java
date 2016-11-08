package Test;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectLine extends Application {
	public static double x = -1, y = -1;
	public static String type;
	public static Group root;
	// Creating a toggle group to group radio buttons
	public static ToggleGroup tg1 = new ToggleGroup();

	public static void main(String[] args) {
		launch(args);

	}

	// @Pratibha Chandrappa Kadasur
	// student ID: S1600455001
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creating window
		primaryStage.setTitle("Rectangle Line Exercise");
		root = new Group();
		Scene scene = new Scene(root, 800, 600, Color.WHITE);
		primaryStage.setScene(scene);
		// CReating a Hbox for radio buttons
		HBox hbox = new HBox();
		hbox.setMinWidth(scene.getWidth());
		hbox.setPadding(new Insets(10, 12, 10, 12));
		hbox.setSpacing(15); // Gap between nodes

		// Creating radio buttons.
		RadioButton rb1 = new RadioButton();
		rb1.setText("Solid Rectangle");
		rb1.setUserData("SolidRectangle");
		rb1.setSelected(true);
		rb1.setToggleGroup(tg1);

		RadioButton rb2 = new RadioButton();
		rb2.setText("Solid Line");
		rb2.setUserData("SolidLine");
		rb2.setToggleGroup(tg1);

		// CReating radio buttons for dashed
		RadioButton rb3 = new RadioButton();
		rb3.setText("Dashed Rectangle");
		rb3.setUserData("DashedRectangle");
		rb3.setToggleGroup(tg1);

		RadioButton rb4 = new RadioButton();
		rb4.setText("Dashed Line");
		rb4.setUserData("DashedLine");
		rb4.setToggleGroup(tg1);

		// adding radio buttons to Hbox
		hbox.getChildren().addAll(rb1, rb3, rb2, rb4);
		// adding hbox to root
		root.getChildren().addAll(hbox);

		// adding on mouse clicked event for creating rectangles
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				for (Node node : root.getChildren()) {
					if (node instanceof Rectangle && node.contains(new Point2D(event.getX(), event.getY())))
						return;
				}
				if ("SolidRectangle".equalsIgnoreCase(tg1.getSelectedToggle().getUserData().toString())) {
					CustomRectangle cRrect = new CustomRectangle(event.getX(), event.getY(), Constants.solid);
					Rectangle rect = cRrect.getRectangle();
					root.getChildren().add(rect);
				} else if ("DashedRectangle".equalsIgnoreCase(tg1.getSelectedToggle().getUserData().toString())) {
					CustomRectangle cRrect = new CustomRectangle(event.getX(), event.getY(), Constants.dashed);
					Rectangle rect = cRrect.getRectangle();
					root.getChildren().add(rect);
				}
			}
		});
		primaryStage.show();
	}
}