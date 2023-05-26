public class Curso {
        private String codigoCurso;
        private String nomeCurso;
        private int duracaoCurso;

        public Curso(String codigo, String nome, int duracao) {
            this.codigoCurso = codigo;
            this.nomeCurso = nome;
            this.duracaoCurso = duracao;
        }

        public String getCodigoCurso() {
            return codigoCurso;
        }
        public void setCodigoCurso(String codigoCurso) {
            this.codigoCurso = codigoCurso;
        }
        public String getNomeCurso() {
            return nomeCurso;
        }
        public void setNomeCurso(String nomeCurso) {
            this.nomeCurso = nomeCurso;
        }
        public int getDuracaoCurso() {
            return duracaoCurso;
        }
        public void setDuracaoCurso(int duracaoCurso) {
            this.duracaoCurso = duracaoCurso;
        }
}
