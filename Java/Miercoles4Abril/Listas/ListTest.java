import java.util.List;
  import java.util.LinkedList;
  import java.util.ListIterator;

  public class ListTest 
  {
     public static void main( String[] args )
     {
        // añade los elementos de colores a la lista1
        String[] elementos = 
           { "hidrogeno", "helio", "litio", "berilio", "boro", "carbono" };
        List< String > lista1 = new LinkedList< String >(); 

        for ( String elemento : elementos )
           lista1.add( elemento );

        // aañade los elementos de colores2 a la lista2
        String[] elementos2 = 
           { "nitrogeno", "oxigeno", "flour", "neon", "sodio", "magnesio" };
        List< String > lista2 = new LinkedList< String >();

        for ( String elemento : elementos2 )
           lista2.add( elemento );

        lista1.addAll( lista2 ); // concatena las listas
        lista2 = null; // libera recursos
        imprimeLista( lista1 ); // imprime lista1

        convierteMayusculas( lista1 ); // convierte a mayúsculas
        imprimeLista( lista1 ); // imprime lista1

        System.out.print( "\nBorrando elementos 4 a 6..." );
        removerItems( lista1, 4, 7 ); // remueve los elementos 4-6
        imprimeLista( lista1 ); // imprime lista1
        imprimeListaInvertida( lista1 ); // imprime la lista en orden inverso
     } // fin main                                   

   // muestra el contenido de la lista
   private static void imprimeLista( List< String > lista )
   {
      System.out.println( "\nlista: " );
   
      for ( String elemento : lista )
         System.out.printf( "%s ", elemento );

      System.out.println();
   }                                                    

   // crea objetos String y los convierte a mayúsculas
   private static void convierteMayusculas( List< String > lista )
   {
      ListIterator< String > iterator = lista.listIterator();

      while ( iterator.hasNext() ) 
      {
         String elemento = iterator.next(); // devuelve el item
         iterator.set( elemento.toUpperCase() ); // convierte a mayúscula
      } // fin while
   } 

   // obtiene una sublista y usa el método clear para borrar los elementos
   private static void removerItems( List< String > lista, 
      int start, int end )
   {
      lista.subList( start, end ).clear(); // remueve elementos
   } 

   // imprime la lista en sentido inverso
   private static void imprimeListaInvertida( List< String > lista )
   {
      ListIterator< String > iterator = lista.listIterator( lista.size() );

      System.out.println( "\nLista invertida:" );

      // imprime la lista en orden inverso
      while ( iterator.hasPrevious() ) 
         System.out.printf( "%s ", iterator.previous() ); 
   } 
}
