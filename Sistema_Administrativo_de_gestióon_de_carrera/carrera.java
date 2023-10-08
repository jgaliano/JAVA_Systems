public class carrera extends programa {
    private String nombre_carrera;
    private String desripcion_carrera;
    // private int duración_carrera;

    public void setNombreCarrera(String nombre_carrera){
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombreCarrera(){
        return nombre_carrera; // Devuelve el nombre de la carrera
    }

    public void setDescCarrera(String desripcion_carrera){
        this.desripcion_carrera = desripcion_carrera;
    }

    public String getDescCarrera(){
        return desripcion_carrera; // Devuelve la descripción de la carrera
    }

}
