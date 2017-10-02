package Calculador;

public class Calculador {
    float operador1;
    float operador2;
    float resultado;
    float c=0;
    
    void sumar(){
        resultado=operador1+operador2;
    }
    
    void restar(){
        resultado=operador1-operador2;
    }

    void mult() {
         resultado=operador1*operador2;
    }
    void div(){
         resultado=operador1/operador2; 
    }
    
}