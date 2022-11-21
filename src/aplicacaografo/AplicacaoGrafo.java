/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaografo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Matheus Aguiar
 */
public class AplicacaoGrafo {

    /**
     * @param args the command line arguments
     */
  // LENDO O ARQUIVO E CRIANDO OS OBJETOS
  static void lerArquivo(Grafo<Cidade> grafo) {

    String line = "";
    String splitBy = ";";
    
    try {
      BufferedReader br = new BufferedReader(new FileReader("./entrada.txt"));
      
      String inutil = br.readLine();
      int qtd = Integer.valueOf(inutil);
      
      for (int i = 0; i < qtd; i++){
        line = br.readLine();
        String[] st = line.split(splitBy);
        int numero = Integer.valueOf(st[0]);
        String nome = st[1];
        grafo.adicionarVertice(new Cidade(numero, nome));
      }
      
      // FOR QUE LE A MATRIZ
      for (int i = qtd; i < 2*qtd; i++){        
        line = br.readLine();
        String[] st = line.split(splitBy);
        int peso = Integer.valueOf(st[0]);
        //grafo.adicionarAresta();
        //System.out.println(line);
        
        
      }
    }
    
    catch (IOException e) {
        e.printStackTrace();
    }
  } // FIM METODO LER ARQUIVO
    
    public static void main(String[] args) {
        Grafo<Cidade> grafo = new Grafo<Cidade>();
        
        lerArquivo(grafo);
        
        Scanner menu = new Scanner(System.in);
        int opcao;

        do{
        // MENU
        menu();
        System.out.print("- DIGITE UMA OPCAO:");
        opcao = menu.nextInt();

        switch (opcao) {
          case 1:
              System.out.print("\nOpcao obter as cidades vizinhas selecionada.\n\n");
              System.out.print("Insira a cidade que deseja selecionar: ");
              int vizinho = menu.nextInt();
              ObterVizinhos(vizinho);
              break;

          case 2:
              System.out.print("\nOpcao obter todos os caminhos a partir de uma cidade selecionada.\n\n");
              System.out.print("Insira a cidade que deseja selecionar: ");
              int obter = menu.nextInt();
              ObterTodosCaminhos(obter);
              break;
        }


        }while(opcao != 3);

      }   
    //Método para printar o menu
    static void menu(){
      System.out.print("##--Grafos Cidade--##\n\n");
      System.out.print("|----------------------------------------------------------|\n");
      System.out.print("| Opcao 1 - Obter as cidades vizinhas                      |\n");
      System.out.print("| Opcao 2 - Obter todos os caminhos a partir de uma cidade |\n");
      System.out.print("| Opcao 3 - Sair do programa :)                            |\n");
      System.out.print("|----------------------------------------------------------|\n");
    }

    static void ObterVizinhos(int vizinho){
        
    }
    
    
    static void ObterTodosCaminhos(int obter){
        
    }


}
