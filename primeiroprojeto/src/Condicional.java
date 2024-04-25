public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2024){
            System.out.println("lançamento do momento");
        }
        else {
            System.out.println("filme de época");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("filme Liberado");
        }
        else {
            System.out.println("Por favor, adiquira o plano.");
        }

    }
}
