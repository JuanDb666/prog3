

public class Asignatura {
    int codigo;
    String nombre;
    int semestre;
    int n_creditos;
    String horario;
    
    public Asignatura(int codigo, String nombre, int semestre, int n_creditos, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.n_creditos = n_creditos;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getN_creditos() {
        return n_creditos;
    }

    public void setN_creditos(int n_creditos) {
        this.n_creditos = n_creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return String.format("%-7d %-35s%5d%7s", codigo, nombre, n_creditos, horario);
    }

}
