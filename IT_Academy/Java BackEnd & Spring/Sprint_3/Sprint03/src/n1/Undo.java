package n1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instancia;
	private ArrayList<String> commands;
	
	private Undo() {
		this.commands = new ArrayList<String>();
	}
	
	public static Undo getInstance() {
		if(instancia == null) {
			instancia = new Undo();
		}
		
		return instancia;
	}

	public ArrayList<String> getCommands() {
		return commands;
	}
	
	public void addCommand(String cmnd) {
		this.commands.add(cmnd);
	}
	
	public void removeCommand(String cmnd) {
		this.commands.remove(cmnd);
	}
	
	public void commandUsed() {
		for(String c: commands) {
			System.out.println(c);
		}
		
		if (this.commands.size() == 0) {
			System.out.println("NMothing");
		}
	}

	
	
	
	

}
