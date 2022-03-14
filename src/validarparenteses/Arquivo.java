/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validarparenteses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Gustavo
 */
public class Arquivo {

    public static String Read(String Caminho) {
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException ex) {
                conteudo = "Erro: Não foi possivel encontrar o arquivo";
            }
        } catch (FileNotFoundException ex) {
            conteudo = "Erro: Arquivo não encontrado";
        }
        if (conteudo.contains("Erro")) {
            return "";
        } else {
            return conteudo;
        }
    }
    
    public static boolean Write(String Caminho,String Texto){
        try{
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
           System.out.println(e.getMessage());
           return false;       
        }
    }
    
}



