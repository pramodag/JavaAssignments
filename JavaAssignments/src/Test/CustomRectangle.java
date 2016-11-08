package Test;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class CustomRectangle {

	Rectangle rect;
	String type;

	public CustomRectangle(double x, double y, String type) {
		this.type = type;
		System.out.println("Creating rectangle object");
		rect = new Rectangle();
		rect.setUserData(type);
		rect = new Rectangle(x, y, Constants.width, Constants.height);
		rect.setFill(Color.TRANSPARENT);
		rect.setStrokeWidth(Constants.strokeWidth);
		rect.setStroke(Paint.valueOf(Constants.rectangleColor));
		if (Constants.dashed.equalsIgnoreCase(type)) {
			rect.setStrokeDashOffset(Constants.dashOffset);
			rect.getStrokeDashArray().addAll(5.0, 10.0);
		}
		rect.setOpacity(Constants.opacity);
		System.out.println("Done creating rectangle onject");
		rect.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {

				if (event.getButton() == MouseButton.PRIMARY) {
					// Checking if first point is set
					if (RectLine.x == -1 && RectLine.y == -1) {
						System.out.println("Mouse clicked on rectangle");
						// No first point setting values.
						RectLine.x = rect.getX() + rect.getWidth() / 2;
						RectLine.y = rect.getY() + rect.getHeight() / 2;
						RectLine.type = type;
						System.out.println(RectLine.x + " " + RectLine.y + " " + type);
					} else {
						CustomLine cLine = null;

						if ("DashedLine".equalsIgnoreCase(RectLine.tg1.getSelectedToggle().getUserData().toString())) {
							if (!(type.equalsIgnoreCase(RectLine.type))) {
								cLine = new CustomLine(rect.getX() + rect.getWidth() / 2,
										rect.getY() + rect.getHeight() / 2, Constants.dashed);
								Line line = cLine.getLine();
								System.out.println("Adding line");
								RectLine.root.getChildren().add(line);
							}
						}
						if ("SolidLine".equalsIgnoreCase(RectLine.tg1.getSelectedToggle().getUserData().toString())) {
							if ((Constants.solid.equalsIgnoreCase(type)
									&& Constants.solid.equalsIgnoreCase(RectLine.type))) {
								cLine = new CustomLine(rect.getX() + rect.getWidth() / 2,
										rect.getY() + rect.getHeight() / 2, Constants.solid);
								Line line = cLine.getLine();
								System.out.println(line);
								RectLine.root.getChildren().add(line);
							}

						}
						RectLine.x = RectLine.y = -1;
						RectLine.type = null;
					}
				} else if (event.getButton() == MouseButton.SECONDARY) {
					System.out.println("Adding text field");
					TextField tf=new TextField("Please name the object");
					tf.setLayoutX(rect.getX()+2);
					tf.setLayoutY(rect.getY()+10);
					RectLine.root.getChildren().add(tf);
				}
			}
		});
	}

	public Rectangle getRectangle() {
		return this.rect;
	}
}