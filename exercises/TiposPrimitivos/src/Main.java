public class Main {
    public static void main(String[] args) {
        String nome = "Jonathan";
        int idade = 23;
        Boolean trabalhando = true;
        float salario = 1936.15f;

        if (trabalhando) {
            System.out.printf("Me chamo %s, tenho %d anos e recebo R$ %.2f.\n", nome, idade, salario);
        } else {
            System.out.println("Me chamo " + nome + " e tenho " + idade + " anos.");
        }
    }
}