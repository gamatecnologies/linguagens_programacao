public class Professor extends Funcionario {

        private String titulacao;
        private String areaPesquisa;
        private Endereco endereco;

/// Construtor
        public Professor(String nome, int telefone, int cpf, float fatorSalario ,Endereco endereco, String titulacao, String areaPesquisa) {
            nome = nome; // porque já existe o construtor na class Funcionario
            nome = "";       // usado em aula
            cpf = cpf;        // usado em aula
            endereco = endereco; // usado em aula
            this.titulacao = titulacao; // usado em aula
        }
/// GETS E SETS
        public String getTitulacao() {
            return titulacao;
        }

        public void setTitulacao(String titulacao) {
            this.titulacao = titulacao;
        }

        public String getAreaPesquisa() {
            return areaPesquisa;
        }

        public void setAreaPesquisa(String areaPesquisa) {
            this.areaPesquisa = areaPesquisa;
        }
    }

