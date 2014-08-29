/* Isa María Contreras Sandoval 13154
*Jose Sagastume Pinto 13217
*/

package hdt6;

import java.util.*;
public class Hdt6 {

   public static void main(String args[]) {
      // create a hash set
      
       HashSet hs = new HashSet();
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println("HashSet" + hs);
      
      TreeSet ts = new TreeSet();
      // Add elements to the tree set
   
      ts.add("C");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("D");
      System.out.println("TreeSet" + ts);
      
      LinkedHashSet hsl = new LinkedHashSet();
      // add elements to the hash set
      hsl.add("B");
      hsl.add("A");
      hsl.add("D");
      hsl.add("E");
      hsl.add("C");
      hsl.add("F");
      System.out.println("LinkedHashSet" + hsl);
   }
}