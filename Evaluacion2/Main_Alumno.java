package Evaluacion2;

public class Main_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*10. Crea un objeto de tipo ‘Alumno’ con dni ‘111111111T’. (0,5 ptos si funciona)*/
		
		Alumno alumno1 = new Alumno("111111111T");
		
		/*11. Crea un objeto de tipo ‘Alumno’ llamado ‘Pepe García Sanz’ cuyo dni es ‘222222222W’
		(0,5 ptos si funciona)*/
		
		Alumno alumno2 = new Alumno("2222222222W", "Pepe Garcia Sanz");

		/*12. Asigna nombre al alumno con dni ‘111111111T’, se llama ‘Federico Pain Pain’ (0,5 ptos
		si funciona).*/
		
		alumno1.setNombreAlumno("Federico Pain Pain");
		
		/*13. Asígnale nota a todos los módulos de Federico uno por uno. (1,5 pto si funciona)
		*/
		
		alumno1.ingresarNotas(7.81, 0);
		alumno1.ingresarNotas(8.99, 1);
		alumno1.ingresarNotas(9.55, 2);

		/*14. Muestra la información de todos los atributos de uno de los alumnos (0,5ptos si
		funciona)*/
		
		System.out.println(alumno1.toString());
		
		/*15. Muestra el nombre del alumno con dni 111111111T’. ( 0,5 ptos si funciona)*/
		
		System.out.println(alumno1.getNombreAlumno() + "\n");
		
		/*
		 * 16. Muestra el dni del alumno con nombre ‘Pepe García Sanz’ (0,5ptos si
		 * funciona)
		 */
		System.out.println(alumno2.getDniAlumno());
	}

}
