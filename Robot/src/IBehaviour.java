import javax.swing.JFrame;


/*****************************************************
 * INTERFACE IBehaviour
 * @author hetu
 *
 *****************************************************/
public interface IBehaviour {

	public String moveCommand();
	public String titleCommand();
}


/*****************************************************
 * AgressiveBehaviour Class
 * @author hetu
 *
 *****************************************************/
class AgressiveBehaviour implements IBehaviour{
	JFrame frame;

	public AgressiveBehaviour(JFrame frame){
		this.frame = frame;
	}

	public String moveCommand(){
		
		return "Agressive Behaviour: if find another robot attack it";

	}
	public String titleCommand(){
		return "Agreesive Behaviour";
	}
}

/*****************************************************
 * DefensiveBehaviour Class
 * @author hetu
 *
 *****************************************************/

class DefensiveBehaviour implements IBehaviour{
	
	JFrame frame;
	
	public DefensiveBehaviour(JFrame frame){
		this.frame = frame;
	}
	public String moveCommand(){
		
		return "Defensive Behaviour: if find another robot run from it";
	}
	
	public String titleCommand(){
		return "Defensive Behaviour";
	}
}
/*****************************************************
 * NormalBehaviour Class
 * @author hetu
 *
 *****************************************************/
class NormalBehaviour implements IBehaviour{
	
	JFrame frame;
	
	public NormalBehaviour(JFrame frame){
		this.frame = frame;
	}
	
	public String moveCommand(){
		
		return "Normal Behaviour: if find another robot ignore it";
		
	}
	
	public String titleCommand(){
		return "Normal Behaviour";
	}
}
