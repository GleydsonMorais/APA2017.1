package trabalho01;

import java.util.ArrayList;

/**
 *
 * @author GM
 * 
 * Trabalho 01 de APA
 * Aluno: Gleydson Guedes Morais - 11218792
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Chama função para ler aquivo
        ArrayList<Integer> valoresDoArquivo = arquivo.lerArquivo("arquivo.txt");
        
        //Imprime valores do Arquivo não ordenado
        //for(int n : valoresDoArquivo){
        //    System.out.println(n);
        //}
        
        //Para usar os aloritimos é so Comentar 1 e Descomentar o outro
        
        //Chama o algoritmo Selection Sort
        ordenacao.selectionSort(valoresDoArquivo);
        
        //Chama o algoritmo Insertion Sort
        //ordenacao.insertionSort(valoresDoArquivo);
        
        //Imprime valores do Arquivo Ordenado
        for(int n : valoresDoArquivo){
            System.out.println(n);
        }
    }
    
}
