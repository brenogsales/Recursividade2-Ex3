package controller;

public class Ex3 {
    public Ex3(){
        super();
    }
    public static int contaPares(int[] sequencia, int tamanho, int contador){
        if(tamanho == 0){
            return contador;
        }
        if(sequencia[tamanho - 1] % 2 == 0){
            contador++;
        }
        return contaPares(sequencia, tamanho - 1, contador);
    }
}