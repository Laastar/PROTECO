import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        // Crea y muestra una List<String>
        String[] colores = {"rojo", "blanco",
            "azul", "verde", "gris", "naranja",   //(1)
            "blanco", "cyan", "morado", "gris"};
        SortedSet<String> tree = new TreeSet<String>(Arrays.asList(colores));
        
        System.out.print("sorted set: ");
        imprimeSet(tree);
        
        // Crea un subconjunto con naranja como headset
        System.out.print( "headSet (\"naranja\"): " );
        imprimeSet(tree.headSet("naranja"));
        
        // Crea un subconjunto con naranja como tailset
        System.out.print( "tailSet (\"naranja\"): " );
        imprimeSet(tree.tailSet("naranja"));
        
        // primer y último elementos
        System.out.printf("primero: %s\n", tree.first());
        System.out.printf("ultimo: %s\n", tree.last());
        
    }
    
    private static void imprimeSet(SortedSet<String> set){
        for (String s : set) 
            System.out.printf("%s ", s);
        
        System.out.println();
    }
}

