import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Robot {
	IBehaviour behaviour;
	JFrame frame;
	String name;

	public Robot(String name, JFrame frame)
	{
		this.name = name;
		this.frame = frame;
	}

	public void setBehaviour(IBehaviour behaviour)
	{
		this.behaviour = behaviour;
	}

	public IBehaviour getBehaviour()
	{
		return behaviour;
	}

	public void move()
	{
		JOptionPane.showMessageDialog(frame,
				"<html> " + this.name + ":  Based on current position the behaviour object decide the next move: <br><br>"
				+ behaviour.moveCommand() 
				+"<br><br>"
				+" The result returned by behaviour object is sent to the movement mechanisms"
				+ " for the robot '"  + this.name + "'" +"</html>",
				"Robot's " + behaviour.titleCommand(), JOptionPane.PLAIN_MESSAGE);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
