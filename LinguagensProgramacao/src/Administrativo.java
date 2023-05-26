public class Administrativo extends Funcionario {

        private String cargo;
        private String departamento;

        public Administrativo(String nome, int telefone, int cpf, float fatorSalario, String cargo, String departamento) {
            super(nome, telefone, cpf, fatorSalario);
            this.cargo = cargo;
            this.departamento = departamento;
        }
        public String getCargo() {

            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;

        }
        public String getDepartamento() {

            return departamento;
        }
        public void setDepartamento(String departamento) {

            this.departamento = departamento;
        }
}
