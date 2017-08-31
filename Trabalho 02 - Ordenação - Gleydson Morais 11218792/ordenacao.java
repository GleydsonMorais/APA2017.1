package trabalho02;

import java.util.ArrayList;

/**
 *
 * @author GM
 * 
 * Trabalho 01 de APA
 * Aluno: Gleydson Guedes Morais - 11218792
 */
public class ordenacao {
    
    
    //Algoritmo de ordenação MERGE SORT
    public static void mergeSort(ArrayList<Integer> vetor, ArrayList<Integer> auxiliar, int inicio, int fim) {
        if(inicio < fim) {
            int meio = (inicio + fim) / 2;//calcula  qual é o índice do elemento que está no meio do vetor
            mergeSort(vetor, auxiliar, inicio, meio);//chamando o método mergeSort recursivamente para uma metade do vetor
            mergeSort(vetor, auxiliar, meio + 1, fim);//chamando o método mergeSort recursivamente para outra metade do vetor
            intercalar(vetor, auxiliar, inicio, meio, fim);
        }
    }
   
    //Metodo que auxilia o MERGE SORT a intercalar o vetor
    private static void intercalar(ArrayList<Integer> vetor, ArrayList<Integer> auxiliar, int inicio, 
                                                                                    int meio, int fim) {
        for(int k = inicio; k <= fim; k++)
            auxiliar.add(k, vetor.get(k));//faz uma cópia de vetor dentro de auxiliar
        
        int i = inicio;//variável para andar na primeira metade do vetor
        int j = meio +1;//variável para andar na segunda metade do vetor
        
        //faz a intercalação entre os 2 subvetores
        for(int k = inicio; k <= fim; k++){
            //se a primeira metade do vetor ultrapassou o meio, ou seja, se a primeira metade acabou
            if(i > meio)
                vetor.set(k, auxiliar.get(j++));
            //se a segunda metade do vetor ultrapassou o final, ou seja, se a segunda metade acabou
            else if(j > fim)
                vetor.set(k, auxiliar.get(i++));
            //se ainda existem elementos na primeira metade e na segunda metade
            else if(auxiliar.get(i) < auxiliar.get(j)) 
                vetor.set(k, auxiliar.get(i++));
            else
                vetor.set(k, auxiliar.get(j++));
        }    
    }
    
    //Metodo SORT (chama o QUICK SORT)
    public static void sort(ArrayList<Integer> vetor) {
        int inicio = 0;
        int fim = vetor.size() - 1;
        quickSort(vetor, inicio, fim);   
    }
    
    //Algoritmo de ordenação QUICK SORT
    private static void quickSort(ArrayList<Integer> vetor, int esquerda, int direita) {
    	if (esquerda < direita) {
        	int pivo = separar(vetor, esquerda, direita);//separa o vetor e o j guarda o valor do pivô
          	quickSort(vetor, esquerda, pivo-1);
            quickSort(vetor, pivo+1, direita);
        }
    }
    
    //Metodo que auxilia o QUICK SORT (divide o vetor)
    private static int separar(ArrayList<Integer> vetor, int esquerda, int direita) {
    	int pivo = vetor.get(direita), i = esquerda;
        
    	for(int j = esquerda; j <= direita - 1; j++){
        	if(vetor.get(j).compareTo(pivo) < 1) {
            	int aux = vetor.get(i);
               	vetor.set(i, vetor.get(j));
               	vetor.set(j, aux);
               	i += 1;
           	}
       	}
        
       	int aux = vetor.get(i);
       	vetor.set(i, vetor.get(direita));
       	vetor.set(direita, aux);
        
       	return i;
    }
    
    //Algoritmo de ordenação HEAP SORT
    public static void heapSort(ArrayList<Integer> vetor) {
        buildMaxHeap(vetor);
        int n = vetor.size();

        for (int i = vetor.size() - 1; i > 0; i--) {
            swap(vetor, i, 0);
            maxHeapify(vetor, 0, --n);
        }
    }

    private static void buildMaxHeap(ArrayList<Integer> vetor) {
        for (int i = vetor.size() / 2 - 1; i >= 0; i--)
            maxHeapify(vetor, i, vetor.size());
    }

    private static void maxHeapify(ArrayList<Integer> vetor, int pos, int tamanhoDoVetor) {  
        int max = 2 * pos + 1, direita = max + 1;  
        if (max < tamanhoDoVetor) {  
             if (direita < tamanhoDoVetor && vetor.get(max) < vetor.get(direita))  
                 max = direita;

             if (vetor.get(max) > vetor.get(pos)) {  
                 swap(vetor, max, pos);  
                 maxHeapify(vetor, max, tamanhoDoVetor);  
             }  
        }  
    }

    public static void swap(ArrayList<Integer> vetor, int j, int aposJ) {
        int aux = vetor.get(j);
        vetor.set(j, vetor.get(aposJ));
        vetor.set(aposJ, aux);
    }
}
