package models;

import controllers.ShapeSceneController;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class EditCircleColorCommand implements Command {

	private ShapeSceneController shapesceneController;
	private Circle circle;
	private Paint oldColor;
	private Paint newColor;
	public EditCircleColorCommand(ShapeSceneController shapeSceneController, Circle circle, Paint oldColor, Paint newColor) {
		this.shapesceneController=shapeSceneController;
		this.circle=circle;
		this.oldColor=oldColor;
		this.newColor=newColor;
	}

	public EditCircleColorCommand(ShapeSceneController shapesceneController) {
		this.shapesceneController = shapesceneController;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void setOldColor(Paint oldColor) {
		this.oldColor = oldColor;
	}


	public void setNewColor(Paint newColor) {
		this.newColor = newColor;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		shapesceneController.changeCircleColor(newColor, circle);
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		shapesceneController.changeCircleColor(oldColor, circle);
		
	}
	@Override
	public void redo() {
		// TODO Auto-generated method stub
		execute();
	}
}
