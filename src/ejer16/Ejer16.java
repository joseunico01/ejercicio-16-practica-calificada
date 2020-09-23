
package ejer16;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejer16 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int nFilas,nCol;
        int matriz[][]=new int[3][3];
        
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de filas: "));
        nCol=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de columnas: "));
        
        
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original: ");
        
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //transponer la matriz
        int aux;
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
                
            }
        }
            System.out.println("La matriz transpuesta es: ");
            for(int i=0;i<nFilas;i++){
                for(int j=0;j<nCol;j++){
                    System.out.print(matriz[i][j]);
                }
                System.out.println("");
            }
            int opc;
            opc=Integer.parseInt(JOptionPane.showInputDialog(null, "\t\tMenu: \n "
                    + "1.Suma\n"
                    + "2.resta\n"
                    + "3.multiplicar\n"
                    + "4.division\n"
                    + "5.finalizar\n"));
            
            int suma_filas,suma_col,suma_total;
        switch(opc){
            case 1:     for(int i=0;i<nFilas;i++){
                        suma_filas=0;
                        for(int j=0;j<nCol;j++){
                        suma_filas+=matriz[i][j];
                            }
                        
                        System.out.print("La suma de filas ["+i+"] es: "+suma_filas);
                        System.out.println("");
                            }
                        
                        
                        for(int j=0;j<nCol;j++){
                            suma_col=0;
                            for(int i=0;i<nFilas;i++){
                                suma_col+=matriz[i][j];
                            }
                            System.out.print("La suma de columnas ["+j+"] es: "+suma_col);
                            System.out.println("");
                        }
                        
       break;
            case 2:     for(int i=0;i<nFilas;i++){
                        suma_filas=0;
                        for(int j=0;j<nCol;j++){
                        suma_filas-=matriz[i][j];
                            }
                        
                        System.out.print("La resta de filas ["+i+"] es: "+suma_filas);
                        System.out.println("");
                            }
                        
                        for(int j=0;j<nCol;j++){
                            suma_col=0;
                            for(int i=0;i<nFilas;i++){
                                suma_col-=matriz[i][j];
                            }
                            System.out.print("La resta de columnas ["+j+"] es: "+suma_col);
                            System.out.println("");
                        }
                        
        break;
            
            case 3:     for(int i=0;i<nFilas;i++){
                        suma_filas=1;
                        for(int j=0;j<nCol;j++){
                        suma_filas*=matriz[i][j];
                            }
                        
                        System.out.print("La multiplicacion de filas ["+i+"] es: "+suma_filas);
                        System.out.println("");
                            }
                        
                        
                        for(int j=0;j<nCol;j++){
                            suma_col=1;
                            for(int i=0;i<nFilas;i++){
                                suma_col*=matriz[i][j];
                            }
                            System.out.print("La multiplicacion de columnas ["+j+"] es: "+suma_col);
                            System.out.println("");
                        }
                        
        break;
            
            case 4: for(int i=0;i<nFilas;i++){
                        suma_filas=1;
                        for(int j=0;j<nCol;j++){
                        suma_filas/=matriz[i][j];
                            }
                        
                        System.out.print("La division de filas ["+i+"] es: "+suma_filas);
                        System.out.println("");
                            }
                        
                        
                        for(int j=0;j<nCol;j++){
                            suma_col=1;
                            for(int i=0;i<nFilas;i++){
                                suma_col/=matriz[i][j];
                            }
                            System.out.print("La division de columnas ["+j+"] es: "+suma_col);
                            System.out.println("");
                        }
                        
                        
        break;
            
            case 5:break;
                
                
                        
        }
        
        
    }
    
}
