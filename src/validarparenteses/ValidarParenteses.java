/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validarparenteses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.*;

/**
 *
 * @author Gustavo
 */
public class ValidarParenteses {
    
   
  
 
    
    static boolean ParentesesValidados(String expressao)
    {
        
        Deque<Character> pilha
            = new ArrayDeque<Character>();
 
        // abertura
        for (int i = 0; i < expressao.length(); i++)
        {
            char x = expressao.charAt(i);
 
            if (x == '(' || x == '[' || x == '{' || x == '<')
            {
                // push no primeiro elemento pra ser validado
                pilha.push(x);
                continue;
            }
 
            // Validar fechamento
            if (pilha.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = pilha.pop();
                if (check == '{' || check == '[' || check == '<')
                    return false;
                break;
 
            case '}':
                check = pilha.pop();
                if (check == '(' || check == '[' || check == '<')
                    return false;
                break;
 
            case ']':
                check = pilha.pop();
                if (check == '(' || check == '{' || check == '<')
                    return false;
                break;
            case '>':
                check = pilha.pop();
                if (check == '(' || check == '{' || check == '[')
                    return false;
                break;
            }
        }
 
        //  pilha vazia
        return (pilha.isEmpty());
    }
 
    public static void main(String[] args)
    {
        String expr = "<<[]()>>";
         
       
        // Função
        if (ParentesesValidados(expr))
          System.out.println("OK");
        else
          System.out.println("Inválido");
    }
}
    
    

