package n1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Undo u = Undo.getInstance();
		System.out.println("Añadimos los siguientes comandos: \n");
		u.addCommand("ls");
		u.addCommand("fdisk");
		u.addCommand("loadkeys");
		u.addCommand("h");
		u.commandUsed();
		
		System.out.println("\nEliminamos el comando ls: \n");
		u.removeCommand("ls");
		u.commandUsed();
		
		

	}

}
