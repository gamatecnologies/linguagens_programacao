public class Disciplina {
    private String codigoDisciplina;
    private String nomeDisciplina;
    private int semestre;
    private int ano;
    private int cargaHoraria;
    private int creditos;

    public Disciplina(String codigoDisciplina, String nomeDisciplina, int semestre, int ano, int cargaHoraria, int creditos) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.semestre = semestre;
        this.ano = ano;
        this.cargaHoraria = cargaHoraria;
        this.creditos = creditos;
    }

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHorario(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /* MAIN */


}

