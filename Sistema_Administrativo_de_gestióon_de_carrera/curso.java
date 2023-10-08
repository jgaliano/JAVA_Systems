public class curso extends programa{
    private String nomnbre_curso;
    private int id_curso;
    private String cant_credito_curso;
    private String horario_curso;
    private String profesor_curso;

    public void getNombre_curso(String nombre_curso){
        this.nomnbre_curso = nombre_curso;
    }

    public void getId_curso(int id_curso){
        this.id_curso = id_curso;
    }

    public void getCant_curso(String cant_credito_curso){
        this.cant_credito_curso = cant_credito_curso;
    }

    public void getHorario_curso(String horario_curso){
        this.horario_curso = horario_curso;
    }

    public void getProfesor_curso(String profesor_curso){
        this.profesor_curso = profesor_curso;
    }   

    public int getID(){
        return id_curso;
    }

    @Override
    public String toString() {
        return "    ID Curso: " + id_curso + "\n    Nombre del curso: " + nomnbre_curso + "\n    Profesor: " + profesor_curso + "\n    Horario: " + horario_curso + " horas\n";
    }
}


