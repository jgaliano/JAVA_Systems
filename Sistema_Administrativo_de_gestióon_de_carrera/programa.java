import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class programa {   
    
    

    class imprimir{
        private static ArrayList<curso> cursos = new ArrayList<>();

        public static void menu(director miDirector, carrera miCarrera, carrera miDescCarrera, curso miCurso){
            if (miDirector.getNombreDirector() == null){
                miDirector.setNombreDirector("Luis Grijalva");
            }
             if (miCarrera.getNombreCarrera() == null){
                miCarrera.setNombreCarrera("Ingeniería en Sistemas");
            }
            if (miDescCarrera.getDescCarrera() == null){
                miDescCarrera.setDescCarrera("La Ingeniería en Sistemas tiene como objetivo formar profesionales capaces de crear tecnología.");
            }
            System.out.println("-------------------------------------------------" );
            System.out.println("");
            System.out.println("            ***Información de Carrera***" );
            System.out.println("");
            System.out.println("Nombre de Carrera:" + miCarrera.getNombreCarrera());
            System.out.println("Descripción:" + miDescCarrera.getDescCarrera());
            System.out.println("Director:" + miDirector.getNombreDirector());
            System.out.println("");
            System.out.println("Menu de Opciones:" );
            System.out.println("    1. Editar datos carrera" );
            System.out.println("    2. Editar director carrera" );
            System.out.println("    3. Editar cursos carrera" );
            System.out.println("    4. Salir:" );
            System.out.println("");
            System.out.println("Ingrese una opción:" );
            System.out.println("-------------------------------------------------" );
    }

        public static void editar_carrera(Scanner scanner, carrera miCarrera, carrera miDescCarrera){
            while(true){
                System.out.println("-------------------------------------------------" );
                System.out.println("Edición Carrera:" );
                System.out.println("    1. Editar nombre carrera:" );
                System.out.println("    2. Editar descripcion carrera:" );
                System.out.println("    3. Regresar:" );
                System.out.println("    Ingrese una opción:" );
                System.out.println("-------------------------------------------------" );
                String opción_carrera = scanner.nextLine();
                switch (opción_carrera){
                    case "1":
                    System.out.println("Ingrese nuevo nombre de carrera:");
                    String new_name_carrera = scanner.nextLine();
                    miCarrera.setNombreCarrera(new_name_carrera);
                    System.out.println("");
                    System.out.println("    < Nombre cambiado Exitosamente > ");
                    System.out.println("");
                    break;
                    case "2":
                    System.out.println("Ingrese nueva descripcion de carrera:");
                    String new_desc_carrera = scanner.nextLine();
                    miDescCarrera.setDescCarrera(new_desc_carrera);
                    System.out.println("");
                    System.out.println("    < Descripcion cambiado Exitosamente > ");
                    System.out.println("");     
                    break;         
                    case "3":
                    System.out.println("-------------------------------------------------" );
                    System.out.println("Regresando a menu general");
                    return;
                    default:
                    System.out.println("-------------------------------------------------" );
                    System.out.println("");
                    System.out.println(" ! Opción no valida, por favor intentelo nuevamente ¡");
                    System.out.println("");
                }
            }
        }

        public static void editar_director(Scanner scanner, director miDirector){
            while(true){
                System.out.println("-------------------------------------------------" );
                System.out.println("Edición Director:" );
                System.out.println("    1. Editar nombre director:" );
                System.out.println("    2. Regresar:" );
                System.out.println("    Ingrese una opción:" );
                System.out.println("-------------------------------------------------" );
                String opción_director = scanner.nextLine();
                switch (opción_director){
                    case "1":
                    System.out.println("Ingrese nuevo nombre del director:");
                    String new_name_director = scanner.nextLine();
                    miDirector.setNombreDirector(new_name_director);
                    System.out.println("");
                    System.out.println("    < Nombre cambiado Exitosamente > ");
                    System.out.println("");
                    break;
                    case "2":
                    System.out.println("-------------------------------------------------" );
                    System.out.println("Regresando a menu general");
                    return;
                    default:
                    System.out.println("-------------------------------------------------" );
                    System.out.println("");
                    System.out.println(" ! Opción no valida, por favor intentelo nuevamente ¡");
                    System.out.println("");
                }
            }
         }

        public static void editar_cursos(Scanner scanner, curso miCurso){
            while(true){
            // miCurso.imprimirFunciones_curso();
            System.out.println("-------------------------------------------------" );
            System.out.println("\nCursos ingresados:");
            for (curso c : cursos) {
                System.out.println(c);
            }

            // Funciones a realizar
            System.out.println("-------------------------------------------------" );
            System.out.println("Ediicón Curso:" );
            System.out.println("    1. Editar información curso" );
            System.out.println("    2. Editar horario curso");
            System.out.println("    3. Editar profesor curso" );
            System.out.println("    4. Agregar curso" );
            System.out.println("    5. Eliminar curso" );
            System.out.println("    6. Regresar" );
            System.out.println("    Ingrese una opción" );
            System.out.println("-------------------------------------------------" );
            // Solicitar acción
            String opción_curso = scanner.nextLine();
                switch (opción_curso){
                    case "1":
                    System.out.println("-------------------------------------------------" );
                    System.out.println("Edicion Informacion Curso");
                    break;
                    case "2":
                    System.out.println("-------------------------------------------------" );
                    System.out.println("Edicion Horario Curso");
                    System.out.println("Ingrese el ID de curso que desea editar: ");
                    int ho_id_editar = scanner.nextInt();
                    scanner.nextLine();
                    for (curso nuevoCurso_2 : cursos) {
                        if (nuevoCurso_2.getID() == ho_id_editar) {
                            System.out.println("Ingrese el nuevo nombre para el curso con duración 1:");
                            String nuevoHo = scanner.nextLine();
                            nuevoCurso_2.getHorario_curso(nuevoHo);
                            System.out.println("Nombre del curso con duración 1 modificado con éxito.");
                            break;
                        }
                    }
                    break;
                    case "3":

                    System.out.println("-------------------------------------------------" );
                    System.out.println("Edicion profesor Curso");
                    System.out.println("Ingrese el ID de curso que desea editar: ");
                    int no_id_editar = scanner.nextInt();
                    scanner.nextLine();
                    for (curso nuevoCurso_1 : cursos) {
                        if (nuevoCurso_1.getID() == no_id_editar) {
                            System.out.println("Ingrese el nuevo nombre para el curso con duración 1:");
                            String nuevoNombre = scanner.nextLine();
                            nuevoCurso_1.getProfesor_curso(nuevoNombre);
                            System.out.println("Nombre del curso con duración 1 modificado con éxito.");
                            break;
                        }
                    }

                    break;
                    case "4":
                        System.out.println("-------------------------------------------------" );
                        System.out.println("Agregar Curso");
    
                        while (true) {
                            curso nuevoCurso = new curso();
                            System.out.println("-------------------------------------------------" );
                            System.out.println("Ingrese el nombre del curso (o escriba 'salir' para terminar): ");
                            String opcionNombre_Curso = scanner.nextLine();
                
                            if (opcionNombre_Curso.equalsIgnoreCase("salir")) {
                                break;
                            }
                
                            System.out.println("Ingrese el ID del curso: ");
                            int opcionID_Curso = scanner.nextInt();
                            System.out.println("Ingrese la cantidad de créditos del curso: ");
                            scanner.nextLine();
                            String opcionCreditos_Curso = scanner.nextLine();
                            System.out.println("Ingrese el horario del curso: ");
                            String opcionHorario_Curso = scanner.nextLine();
                            System.out.println("Ingrese el nombre del Profesor: ");
                            String opcionProfesor_Curso = scanner.nextLine();
                
                            nuevoCurso.getNombre_curso(opcionNombre_Curso);
                            nuevoCurso.getId_curso(opcionID_Curso);
                            nuevoCurso.getCant_curso(opcionCreditos_Curso);
                            nuevoCurso.getHorario_curso(opcionHorario_Curso);
                            nuevoCurso.getProfesor_curso(opcionProfesor_Curso);
                
                            cursos.add(nuevoCurso);
                        }     
                    break;
                    case "5":
                    System.out.println("Eliminar Curso");
                    break;
                    case "6":
                    System.out.println("Regresa");
                    return;
                    default:
                    System.out.println("-------------------------------------------------" );
                    System.out.println("");
                    System.out.println(" ! Opción no valida, por favor intentelo nuevamente ¡");
                    System.out.println("");
                }
            }        
        }


        public static void añadirCurso(Scanner scanner) {
            
        }  


}
    public static void main (String [] args){   
        Scanner scanner = new Scanner(System.in);



        // ++++++++++++++++++++++++++++++++++++++++++++++++++++

        director miDirector = new director();
        carrera miCarrera = new carrera();
        carrera miDescCarrera = new carrera();
        curso miCurso = new curso();


        // ++++++++++++++++++++++++++++++++++++++++++++++++++++




        while(true){
            imprimir.menu(miDirector, miCarrera, miDescCarrera, miCurso); 
            String opcion_case = scanner.nextLine();

            switch (opcion_case){
                case "1":
                //Editar datos carrera
                System.out.println("-------------------------------------------------" );
                System.out.println("");
                System.out.println("Ha seleccionado: Editar Datos Carrera: ");
                System.out.println("");
                imprimir.editar_carrera(scanner, miCarrera, miDescCarrera);
                break;
                case "2":
                //Editar director carrera
                System.out.println("-------------------------------------------------" );
                System.out.println("");
                System.out.println("Ha seleccionado: Editar Director Carrera: ");
                System.out.println("");
                imprimir.editar_director(scanner, miDirector);
                break;
                case "3":
                //Editar cursos carrera
                System.out.println("-------------------------------------------------" );
                System.out.println("");
                System.out.println("Ha seleccionado: Editar Cursos Carrera: ");
                System.out.println("");
                imprimir.editar_cursos(scanner, miCurso);
                break;
                case "4":
                //Salir
                System.out.println("-------------------------------------------------" );
                System.out.println("Saliendo del programa.");
                scanner.close();
                System.exit(0);
                default:
                System.out.println("-------------------------------------------------" );
                System.out.println("");
                System.out.println(" ! Opción no valida, por favor intentelo nuevamente ¡");
                System.out.println("");
            }
        }
    }   
}
