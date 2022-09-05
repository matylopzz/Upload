 
package listasenlazadas;

 
public class ListasEnlazadas {

     
    public static void main(String[] args) {
      /*
        Nodo primer = new Nodo("Ejemplo");
        Nodo segundo = new Nodo(445);
        Nodo tercer = new Nodo ("Hola");
    
        primer.enlazarSiguiente(segundo);
        
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        
        System.out.println(primer
                .obtenerSiguiente()
                .obtenerSiguiente()
                .ObtenerValor().toString());
        */
      
      ListaEnlazada lista = new ListaEnlazada();
      
        System.out.println("Esta vacia: "+lista.estaVacio());
        
        lista.addNumero("jorge");
        lista.addNumero(20);
        lista.addNumero("hola que tal");
        lista.addNumero(3);
        
        System.out.println("primer elemento: "+lista.obtener(0));
        System.out.println("ultimo "+lista.obtener(lista.size()-1));
        System.out.println("index 2: "+lista.obtener(2));
        
        System.out.println("esta vacia "+lista.estaVacio());
        System.out.println("Tamaño: "+lista.size());
        
        // Queda ejecutar el codigo 
    }
    
    
}
