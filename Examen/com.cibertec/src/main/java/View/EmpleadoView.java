package View;
import controllers.EmpleadoController;
public class EmpleadoView {

	public static void main(String[] args) {
		//String empleado = new EmpleadoController().createEmpleado("Mendoza","Jose luis","28","masculino",2.500);
		//String empleado = new EmpleadoController().deleteEmpleado(1);
		//String empleado = new EmpleadoController().updateEmpleado(2, "Herrera");
		String empleado = new EmpleadoController().getEmpleado(2);
		System.out.println(empleado);

	}

}
