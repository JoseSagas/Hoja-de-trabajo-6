/* Isa María Contreras Sandoval 13154
*Jose Sagastume Pinto 13217
*Hoja de Trabajo 6
*Algoritmos y Estructura de Datos
*Nombre: Factory.java
*/

package hdt6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
class Factory<E> {

public Set<E> getImplementacion(String set){ 
    if (set.equals("hashset")){ 
        return new HashSet<E>();
    }
    if (set.equals("treeset")){ 
        return new TreeSet<E>(); 
    }
    if (set.equals("linkedhashset")){ 
        return new LinkedHashSet<E>(); 
    }
        return null;
    }
}