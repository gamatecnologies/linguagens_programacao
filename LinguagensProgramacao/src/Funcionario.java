public class Funcionario {

        private String nome;
        private int telefone;
        private int cpf;
        private float fatorSalario;

        private Endereco endereco;

        // Construtor
        public Funcionario() {
            this.nome = "";
            this.telefone = 0;
            this.cpf = 0;
            this.fatorSalario = 0;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getTelefone() {
            return telefone;
        }

        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public float getFatorSalario() {
            return fatorSalario;
        }

        public void setFatorSalario(float fatorSalario) {
            this.fatorSalario = fatorSalario;
        }
    }

