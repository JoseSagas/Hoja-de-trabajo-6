/*Isa María Contreras Sandoval 13154
*Jose Sagastume Pinto 13217
*Hoja de Trabajo 6
*Algoritmos y Estructura de Datos
*Nombre: Hdt6.java
*/

package hdt6;

import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class Hdt6 {
    
    public static void main(String[] args) {
    //Ingreso de tipo de implementacion
    System.out.println ("Que tipo de implementacion SET que desea utilizar: TS, HS, LHS"); 
    String set = ""; 
    Scanner entrada = new Scanner (System.in); 
    set = entrada.nextLine ();
    set = set.toUpperCase();
    //PRogramacion defensiva para el ingreso de implementacion
    while(!set.equals("TS") && !set.equals("HS") && !set.equals("LHS") && !set.equals("ts") && !set.equals("hs") && !set.equals("lhs")){
    System.out.println ("Que tipo de implementacion SET que desea utilizar:"); 
    set = ""; 
    entrada = new Scanner (System.in); 
    set = entrada.nextLine (); //Referencia al dato ingresado
    }
    
    if (set.equals("TS")) { //Orden alfabetico
        set = "treeset";
    }
    if (set.equals("HS")) { //Orden alfabetico
        set = "hashset";
    }
    if (set.equals("LHS")) {  //Como se ingresa
        set = "linkedhashset";
    }
    //cuantas personas quiere
    System.out.println ("Cuantas personas desea ingresar? "); 
    String personas = "";
    entrada = new Scanner (System.in); 
    personas = entrada.nextLine ();
    
    //Inicializacion de objetos
    Set<String> web = null; 
    Set<String> java = null;
    Set<String> celular = null;
    Set<String> interseccion = null; 
    Set<String> javaNoWeb = null ;
    Set<String> intWebCelular = null; 
    Set<String> WebCelularNoJava = null; 
    Set<String> mayorDesarrolladores = null; 
    Factory factory= new Factory(); 
    web=factory.getImplementacion(set); 
    java=factory.getImplementacion(set);
    celular=factory.getImplementacion(set);
    interseccion=factory.getImplementacion(set);
    javaNoWeb=factory.getImplementacion(set);
    intWebCelular=factory.getImplementacion(set);
    WebCelularNoJava=factory.getImplementacion(set);
    mayorDesarrolladores=factory.getImplementacion(set);
    celular=factory.getImplementacion(set);
    java=factory.getImplementacion(set);
    web=factory.getImplementacion(set);
   
    
    // Ciclo para ingresar los desarrolladores
    int cont=0;
    while (cont<Integer.parseInt(personas)){
    cont=cont+1;
   
    System.out.println ("Nombre: "); 
    String nombre = ""; 
    entrada = new Scanner (System.in); 
    nombre = entrada.nextLine ();
    
    System.out.println ("Que tipo de desarrollador es? (JAVA/CELULARES/WEB)"); 
    String desarrollador = ""; 
    entrada = new Scanner (System.in); 
    desarrollador = entrada.nextLine ();
    desarrollador = desarrollador.toUpperCase();
    while (!desarrollador.equals("JAVA") && !desarrollador.equals("WEB") && !desarrollador.equals("CELULARES") && !desarrollador.equals("java") && !desarrollador.equals("web") && !desarrollador.equals("celulares")){    
        System.out.println ("Que tipo de desarrollador es? (JAVA/CELULARES/WEB)");
        desarrollador = ""; 
        entrada = new Scanner (System.in); 
        desarrollador = entrada.nextLine ();
    }
    //Dependiendo del tipo de desarrollador que sea se agrega a la lista correspondiente   
    if (desarrollador.equals("web")){ 
        web.add(nombre);
        }
    if (desarrollador.equals("java")){ 
        java.add(nombre); 
        }
    if (desarrollador.equals("celulares")){ 
        celular.add(nombre); 
        }
    }
    
    // Inciso 1
    interseccion.addAll(web);
    interseccion.retainAll(celular);
    interseccion.retainAll(java);
    System.out.println("Desarrolladores Java, Web y Celular: "+interseccion);
   // Inciso 2
    javaNoWeb.addAll(java);
    javaNoWeb.removeAll(web);
    System.out.println("Desarrolladores Java pero no Web: "+javaNoWeb);
    // Inciso 3
    intWebCelular.addAll(web);
    intWebCelular.retainAll(celular);
    intWebCelular.removeAll(java);
    System.out.println("Desarrolladores Web y Celular: "+intWebCelular);
    // Inciso 4
    WebCelularNoJava.addAll(celular);
    WebCelularNoJava.addAll(web);
    WebCelularNoJava.removeAll(java);
    System.out.println("Desarrolladores de Celular o Web pero no de Java: "+WebCelularNoJava);
    // Inciso 5
    boolean subconjunto= java.containsAll(web);
    if (subconjunto){
    System.out.println("Java si es subconjunto de los desarrolladores Web");
    }else{
    System.out.println("Java no es subconjunto de los desarrolladores Web");
    }
    // Inciso 6
    int tamJava= java.size();
    int tamCelular= celular.size();
    int tamWeb= web.size();
    String mayor="";
    if (tamJava>tamCelular && tamJava>tamWeb){
    System.out.println("Java tiene la cantidad mas grande de desarrolladores"+ java);
    mayorDesarrolladores.addAll(java);
    mayor="Java";}
    if (tamCelular>tamJava && tamCelular> tamWeb){
    System.out.println("Celular tiene la cantidad mas grande de desarrolladores"+ celular);
    mayorDesarrolladores.addAll(celular);
    mayor="Celular";}
    else{
    System.out.println("Web tiene la cantidad mas grande de desarrolladores"+ web);
    mayorDesarrolladores.addAll(web);
    mayor="Web";
    }
    // Inciso 7
    Set ascendente= new TreeSet(mayorDesarrolladores);
    System.out.println("Los desarrolladores "+mayor+" tienen mayor cantidad"+ ascendente);
    }
}