
package listasenlazadas;


public class ListaEnlazada {
    
    Nodo cabeza;  //datos de nuestra lista
    int size; //contador 
    
    // Iniciamos las variables
    public ListaEnlazada()
    {
        cabeza = null;
        size=0;
        
    }
    // 
    public Object obtener(int index)
    {
        int contador=0;
        Nodo temporal = cabeza;
        while (contador<index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.ObtenerValor();
    }
    
    public void addNumero(Object obj)
    {
        if(cabeza == null)
        {
            cabeza = new Nodo(obj);
        }
        else
        {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
            
        }
        
        size++;
    }
    public int size()
    {
        return size;
    }
    
    //metodo
    public boolean estaVacio()
    {
        return ( cabeza == null);
    }

    private static class listaEnlazada {

        public listaEnlazada() {
        }
    }
    
}
