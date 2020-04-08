package models;

import controllers.ShapeSceneController;

public class EditBackgroundColorCommand implements Command {

	
	private ShapeSceneController shapesceneController;
	private String oldStyle;
	private String newStyle;
	public EditBackgroundColorCommand(ShapeSceneController shapeSceneController, String oldStyle, String newStyle) {
		this.shapesceneController=shapeSceneController;
		this.oldStyle=oldStyle;
		this.newStyle=newStyle;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		shapesceneController.setBackgrondColor(newStyle);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		shapesceneController.setBackgrondColor(oldStyle);
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		execute();
	}

}
