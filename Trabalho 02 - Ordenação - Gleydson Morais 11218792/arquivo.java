package trabalho02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GM
 * 
 * Trabalho 01 de APA
 * Aluno: Gleydson Guedes Morais - 11218792
 */
public class arquivo {
    
    static ArrayList<Integer> lerArquivo(String arquivo) {
        
        ArrayList<Integer> valores_extraidos_arquivo = new ArrayList<Integer> ();
        
    	try {
            
            File file = new File(arquivo);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNext()) {
           	valores_extraidos_arquivo.add(Integer.parseInt(scanner.next()));    
            }
            
            scanner.close();
       	} catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return valores_extraidos_arquivo;
    }
}
