//Criar um programa para calcular a área de um triângulo
//Como criar com vetor
//Criar usando Loop (3x) cada vez vai preencher um dados

import java.util.Scanner;
public class TranguloVetorVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Importação do Scanner
        
        String interacao = "Olá, esse programa foi desenvolvido para dizer qual é o tipo do seu triângulo"; // dá boas vindas ao usuário
        String[] textos = {"Digite o lado: ", "O triângulo é ", "equilátero", "isósceles", "escaleno", "Não é possível formar um triângulo!"}; // Vetor tem 5 string's começando pelo vetor 0
        double[] lados = new double[3]; // vetor que cria 3 váriaveis de número 
        int cont = 0; // Valor de cont começa em 1 pois o vetor começa em 0
        
        System.out.println(interacao); // Dá boas vindas ao usuário
        
        while(cont < lados.length){ // vai repetir o while até o valor de "cont" até chegar no valor do vetor
            System.out.println(textos[0] + (cont+1)); // vai falar o texto[0] e vai somando +1 até chegar no vetor
            lados[cont] = in.nextDouble(); // vai criar uma variável a cada lado que o usuário digitar no console
            cont++; // vai adicionar o próximo double
        }
        
        cont = 1; // muda o valor de cont de 0 para 1
        int pos = 0; // Cria o valor em 0 pois ele vai ser alterado pelo maior valor
        while (cont < lados.length){ // Fica repetindo até cont for maior que lados
            if(lados[cont]>lados[pos]){ // Verifica se o tamanho de lados é maior que a quantidade lados
                pos= cont; // muda o valor de pos para cont, para o whie terminar
            }
            cont++; // soma mais 1 no cont
        }
        
        cont = 0; // Muda o valor de cont para 0
        double total = 0; // Declaração de um novo double 
        while(cont < lados.length){ // Repete até o while for maior que a quantidade de lados
            if(cont != pos){ // Se cont é diferente de pos
                total = total + lados[cont]; // valor total é a soma do total + os lados
            }
        cont++; // soma mais 1
        }
        
        if(total>lados[pos]){
            if(lados[0] == lados[1] && lados[1] == lados[2]){ // Verifica se todos os lados são iguais
                System.out.println(textos[1] + textos[2]); // Se todos os lados são iguais ele é equilátero
            }
            else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados [2]){ // Verifica se pelo menos um lado é igual ao outro
                System.out.println(textos[1] + textos[3]); // Se um lado é igual ao outro ele é Isósceles
            }
            else { // Se ele não é nenhum acima, ele obrigatóriamente vai ser isso
                System.out.println(textos[1] + textos[4]);  // Se ele for nada, ele obrigatóriamente vai ser escaleno
            }
        }
        else{ // Se não der para formar um triângulo, automáticamente não será possivel formar um triângulo
            System.out.println(textos[5]); // vai avisar ao usuáruio que não é possível formar um triângulo
        }
    }
}