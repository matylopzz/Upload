/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

/**
 *
 * @author Usuario
 */
public class Nodo {
    Object valor; //String, integrer .. lo que sea
    Nodo siguiente;
    
    //Constructor 
   
    public Nodo(Object valor)
    {
        this.valor = valor;
    }
    public void enlazarSiguiente(Nodo n)
    {
        siguiente = n;
    }
    public Nodo obtenerSiguiente()
    {
        return siguiente;
    }
    public Object ObtenerValor()
    {
        return valor;
    }
            
    

    
}
