package Test;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

public class CustomLine {
	Line line;

	public CustomLine(double x, double y, String type) {
		// Creating a new line object to draw line.
		line = new Line();
		// Setting line starting point with values
		line.setStartX(RectLine.x);
		line.setStartY(RectLine.y);
		// Getting 2.nd point to draw the line.
		line.setEndX(x);
		line.setEndY(y);
		// setting thickness of line
		line.setStrokeWidth(Constants.lineStroke);
		line.setStroke(Paint.valueOf(Constants.lineColor));
		// removing clipboard content so next rectangle will be
		// treated as first rectangle point for new line
		if (Constants.dashed.equalsIgnoreCase(type)) {
			line.setStrokeDashOffset(Constants.dashOffset);
			line.getStrokeDashArray().addAll(5.0, 10.0);
		}
		line.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if (event.getButton() == MouseButton.SECONDARY) {
					System.out.println("Adding text field");
					TextField tf = new TextField("Please name the object");
					tf.setLayoutX(line.getStartX()+(line.getEndX()-line.getStartX())/2);
					tf.setLayoutY(line.getStartY()+(line.getEndY()-line.getStartY())/2);
					RectLine.root.getChildren().add(tf);
				}

			}
		});
	}

	public Line getLine() {
		return this.line;
	}
}
