//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;
        System.out.println("A nota do filme é: " + notaDoFilme);
// média calculada pelas 3 notas inseridas pelos usuários.
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(String.format("%.2f", media));
        String sinopse = """
                Filme top gun
                Filme de aventura com galã dos anos 80
                Muito bom
                Ano de lançamento
                """ + anoDeLancamento;
                System.out.println(sinopse);

                int classificacao = (int) (media /2);
                System.out.println(classificacao);
        }
    }
