<<<<<<< HEAD
package src; 
import java.util.ArrayList;
import menu.menuPrincipal;
import java.util.List;

import src.models.Categoria;
import src.models.Clientes;
import src.models.Producto;
import src.models.comun.DbObject;
import src.models.comun.Tools; 

public class Main extends menuPrincipal {
	
	/**
	 * <strong>EJERCICIOS</strong>
	 * <strong>Entrega: 6 de Noviembre (Github)</strong>
	 * 
	 * 1.- Actualizar vuestros repositorio con este
	 * 2.- Interface Comandos:
	 * 	-> Categoria: CRUD
	 *  -> Producto: CRUD // NOTA: Un producto tiene un id_Categoria obligatorio, y tiene existir la categoria
	 *  -> Cliente: CRUD
	 * 
	 * 2.- Listar:
	 *  -> Productos de una Categoria // Dado un ID de categoria; tener todos los productos
	 * 
	 * 3*.- Validaciones:
	 *  -> Los datos del C/U (Create/Update) tienen que cumplir condiciones coherentes. 
	 *  => PISTA: regex
	 * 
	 * *-> Para nota ;)
	 * 
	 */

	public static void main(String[] args) {
		 
		
		 //Categoria cat = new Categoria();
		 //cat.setNombre("Cat 01");
		 //cat.setNombre("Cat 02");
		 //

			//Clientes cli =new Clientes();
			//cli.setDireccion("Calle rapaciones");
			//cli.setDni("71665576z");
			//cli.setEmail("Prueba@prueba.com");
			//cli.setNombre("Juanjose");
			//cli.setTelefono("985115858");
			//cli.save();
			
			
		 iniciaMenu();
		 
		 
	}
}
=======
package src;
import java.sql.Connection; 

import src.models.Categoria;
import src.models.comun.DbSqlite;

public class Main {

	public static void main(String[] args) {
		
		// Hacer el Backup del d�a
		Backup.getInstance().doBackup();
		
		// Comprobar que la base de datos existe
		DbSqlite db = DbSqlite.getInstance();
		Connection con = db.getConnection();
		
		// Arrancar
		
		 
		Categoria.saveDb(con, "Categoria 02");
		
		menuPrincipal.iniciaMenu();
		
		//statemnt.executeQuery(sql);
		
		//con.prepareStatement(sql)
	 
	}

}
>>>>>>> branch 'master' of https://github.com/FoxAstur/DAM-PR01.git
