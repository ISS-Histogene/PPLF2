/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class SudokuSolver {

 
    public static void jogo(String[][] matriz, SudokuInterface inter){
        ArrayList<Celula> blankcells = new ArrayList();
        Celula[][] sudoku = new Celula[9][9];
        for(int a=0; a<=8;a++){
            for(int b=0; b<=8;b++){
                int valor = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
                if(matriz[a][b].equals("")){
                    Celula celula = new Celula(0, a, b);
                    sudoku[a][b] = celula;
                    ArrayList vazio = new ArrayList();
                    vazio.add(a);
                    vazio.add(b);
                    blankcells.add(celula);
                }
                else{
                    Celula celula = new Celula(Integer.parseInt(matriz[a][b]), a, b);
                    sudoku[a][b] = celula;
                }
            }
        }
        Estado primeiroestado = new Estado(sudoku, blankcells, null, 1);
        resolvedor(primeiroestado, inter);
        
    }
    
    public static void resolvedor(Estado testarestado, SudokuInterface inter){
        inter.preencher(testarestado.getMatriz());
        Estado generico = testarestado;
        int x = 0;
        while(true){
            if(x==1){
                JOptionPane.showMessageDialog(null, "Continuar");
            }
            if(generico.getBlankcells().size()==45){
                x = 1;
            }
            inter.preencher(generico.getMatriz());
            if(generico.getValor()==10){
                    generico = generico.getEstadoanterior();
                    generico.setValor(generico.getValor()+1);
                }
            else if(generico.getBlankcells().isEmpty()){
                JOptionPane.showMessageDialog(null, "Resolvido");
                return;
            }
            else {
                Estado novoestado = copiarEstado(generico);
                System.out.println("restantes: "+generico.getBlankcells().size());   
                ArrayList chavecelula = novoestado.getBlankcells().keySet().iterator().next();
                Celula celulatestar = novoestado.getBlankcells().get(chavecelula);
                celulatestar.setNumero(generico.getValor());
                if(testarValor(novoestado)){
                    novoestado.getBlankcells().remove(chavecelula);
                    generico.setValor(generico.getValor());
                    generico = novoestado;
                }
                else{
                    generico.setValor(generico.getValor()+1);
=======
    public static void resolvedor2(Estado estado){
        int valor = 1;
        Estado atual = estado;
        while(!(atual.getBlankcells().isEmpty())){
            ArrayList<Integer> chave = estado.getBlankcells().keySet().iterator().next();
            Celula celula = estado.getBlankcells().get(chave);
            
        }
    }
    
    
    public static void resolvedor(Estado testarestado){
        if(testarestado.getBlankcells().isEmpty()){
            JOptionPane.showMessageDialog(null, "Resolvido");
            interfacee.preencher(testarestado.getMatriz());
            return;
        }
        else {
            for(int t = 1; t<=9; t++){
                System.out.println("restantes: "+testarestado.getBlankcells().size());   
                ArrayList chavecelula = testarestado.getBlankcells().keySet().iterator().next();
                Celula celulatestar = testarestado.getBlankcells().get(chavecelula);
                celulatestar.setNumero(t);
                if(!(conflitos(testarestado.getMatriz()))){
                    System.out.println(chavecelula);
                    testarestado.getBlankcells().remove(chavecelula);
                    resolvedor(testarestado);
>>>>>>> origin/master
                }
            }
        }
    }
    
    public static boolean testarValor(Estado estado){
        if(!(conflitos(estado.getMatriz()))){
            return true;
        }
        return false;
    }
    
    
        
        
  
    
    
    public static Estado copiarEstado(Estado estado){
        HashMap<ArrayList<Integer>, Celula> blankcellestado = estado.getBlankcells();
        Celula[][] celulasestado = estado.getMatriz();
        
        HashMap<ArrayList<Integer>, Celula> blankcellcopiado = new HashMap();
        Celula[][] celulascopiado = new Celula[9][9];
        
        for(ArrayList<Integer> chave : blankcellestado.keySet()){
            blankcellcopiado.put(chave, blankcellestado.get(chave));
        }
        
        for(int j=0; j<=8;j++){
            for(int k=0; k<=8;k++){
                celulascopiado[j][k] = celulasestado[j][k];
            }
        }
        return new Estado(celulascopiado, blankcellcopiado, estado, 1);
        
    }
    
    
    
    
    
    public static boolean conflitos(Celula[][] sudoku){
        for(int g=0;g<=8;g++){
            for(int h=0;h<=8;h++){
                if(sudoku[g][h].getNumero()!=0){
                    if((conflitoLinha(g, h, sudoku[g][h].getNumero(), sudoku)) || (conflitoColuna(g, h, sudoku[g][h].getNumero(), sudoku)) || (conflitoBox(g, h, sudoku[g][h].getNumero(), sudoku))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean conflitoLinha(int posicaox, int posicaoy, int valorteste, Celula[][] sudoku){
        int linhateste = posicaox;
        for(int i=0;i<=8;i++){
            if(i==posicaoy){
                continue;
            }
            Celula celulatestar = sudoku[linhateste][i];
            if(celulatestar.getNumero()==valorteste){
                return true;
            }
        }
        return false;
    }
    public static boolean conflitoColuna(int posicaox, int posicaoy, int valorteste, Celula[][] sudoku){
        int colunateste = posicaoy;
        for(int i=0;i<=8;i++){
            if(i==posicaox){
                continue;
            }
            Celula celulatestar = sudoku[i][colunateste];
            if(celulatestar.getNumero()==valorteste){
                return true;
            }
        }
        return false;
    }
    
    public static boolean conflitoBox(int posicaox, int posicaoy, int valorteste, Celula[][] sudoku){
        int linha = posicaox;
        int coluna = posicaoy;
        if((linha==0) || (linha==3) || (linha==6)){
            if((coluna==0) || (coluna==3) || (coluna==6)){
                for(int x=0;x<=2;x++){
                    for(int y=0;y<=2;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
            else if((coluna==1) || (coluna==4) || (coluna==7)){
                for(int x=0;x<=2;x++){
                    for(int y=-1;y<=1;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
            else if((coluna==2) || (coluna==5) || (coluna==8)){
                for(int x=0;x<=2;x++){
                    for(int y=-2;y<=0;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
        }
        else if((linha==1) || (linha==4) || (linha==7)){
            if((coluna==0) || (coluna==3) || (coluna==6)){
                for(int x=-1;x<=1;x++){
                    for(int y=0;y<=2;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
            else if((coluna==1) || (coluna==4) || (coluna==7)){
                for(int x=-1;x<=1;x++){
                    for(int y=-1;y<=1;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
            else if((coluna==2) || (coluna==5) || (coluna==8)){
                for(int x=-1;x<=1;x++){
                    for(int y=-2;y<=0;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
        }
        else if((linha==2) || (linha==5) || (linha==8)){
            if((coluna==0) || (coluna==3) || (coluna==6)){
                for(int x=-2;x<=0;x++){
                    for(int y=0;y<=2;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
            else if((coluna==1) || (coluna==4) || (coluna==7)){
                for(int x=-2;x<=0;x++){
                    for(int y=-1;y<=1;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
            else if((coluna==2) || (coluna==5) || (coluna==8)){
                for(int x=-2;x<=0;x++){
                    for(int y=-2;y<=0;y++){
                        Celula testar = sudoku[linha+x][coluna+y];
                        if(((linha+x)==posicaox) && ((coluna+y)==posicaoy)){
                            continue;
                        }
                        if(testar.getNumero()==valorteste){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    
}
