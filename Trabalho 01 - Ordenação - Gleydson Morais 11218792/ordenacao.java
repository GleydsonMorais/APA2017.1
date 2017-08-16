package trabalho01;

import java.util.ArrayList;

/**
 *
 * @author GM
 * 
 * Trabalho 01 de APA
 * Aluno: Gleydson Guedes Morais - 11218792
 */
public class ordenacao {
    
    
    //Algoritmo de ordenação SELECTION SORT
    public static void selectionSort(ArrayList<Integer> vetor) {
        //armazenam o menor valor e o índice do menor valor
        int menor, indiceMenor;
        
        for (int i = 0; i < vetor.size() - 1; i++) {
            //antes de comparar, considera-se menor o valor atual do loop
            menor = vetor.get(i);
            indiceMenor = i;

            //compara com os outros valores do vetor
            for (int j = i + 1; j < vetor.size(); j++){
            	if (vetor.get(j) < menor){
                    menor = vetor.get(j);
                    indiceMenor = j;
                }
            }

            //troca os valores menor e maior		
            vetor.set(indiceMenor, vetor.get(i));
            vetor.set(i, menor);
        }
    }
    
    //Algoritmo de ordenação INSERTION SORT
    public static void insertionSort(ArrayList<Integer> vetor) {
        for(int i = 1;  i < vetor.size(); i++){
            int hold = vetor.get(i);
            int j = i;
            
            while(j>0 && vetor.get(j-1)>hold){
                vetor.set(j, vetor.get(j-1));
                j--;
            }
            
            vetor.set(j, hold);
        }
    }
}
