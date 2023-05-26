
public class Main {
    private Professor p = new Professor();
    private Endereco e = new Endereco();

    public static void main(String[] args) {

        // Terceira versão
        new Professor("Vitoria",128,12548, 555.55,new Endereco("RUA TAL","125A","brasil",15588));

        // Segunda versão
        p = new Professor("Vitoria", 3333, 152558,1586.558); // exemplo sala
        e = new Endereco ("Rual tal","135","minas", 125);

        List<Professor> 1 = new List();
        1.add(p); // dado em aula


        // Primeira versão de opção
        p.setNome = "Victoria";
        p.setCPF = "123.123,123-00";
        e.logradouro = "Rua tal";
        e.numero = 123;
        p.setEndereco(e);

        p.setNome = "Marcela";
        p.setCPF = "456.456,456-00";
        e.logradouro = "Rua Lual";
        e.numero = 45;
        p.setEndereco(e);

                }
}
