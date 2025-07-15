import java.util.Scanner;

public class ArrayExercicio {
    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário
        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o número %d: \n", i+1);
            int numeroAtual = scanner.nextInt();    
            numeros[i] = numeroAtual;
            if(i==0){
                maiorNumero = numeroAtual;
            }else{
                if(numeroAtual > maiorNumero){
                    maiorNumero = numeroAtual;
                } 
            }
            soma += numeroAtual;
        }

        // Exibindo os resultados
        System.out.println("Conteúdo do array:");
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < numeros.length; i++) {
            buff.append(numeros[i] + " ");
        }
        System.out.println(buff.toString());

        System.out.printf("Soma de todos os números: %d\n", soma);

        System.out.printf("Maior número no array: %d\n", maiorNumero);
        
        
        scanner.close();
    }
    
}