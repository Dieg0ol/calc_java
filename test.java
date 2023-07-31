import java.util.Scanner;

class test {
    public static void main (String [] args ) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        String test2 = scan.nextLine(); // esse aqui pega string toda.
        System.out.println("O que voce digitou é: " + test2);
        System.out.println("DIgite alguma coisa dnv! " );
        String test3 = scan.next(); // esse cara pega só a primeira parte da frase
        System.out.println("String digitada é: " + test3);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome, idade, altura, e se tem animal de estimação: ");
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean temAnimalDeEstimação = scan.nextBoolean();
        System.out.println("As informações digitada são: " + nome);
        System.out.println("As informações digitada são: " + idade);
        System.out.println("As informações digitada são: " + altura);
        System.out.println("As informações digitada são: " + temAnimalDeEstimação);
        System.out.println("Seu nome é: " + nome + "\nSua idade é: " + idade + "\nSua altura é " + altura + "\nEssas são algumas informações suas! ");

    }
 }



