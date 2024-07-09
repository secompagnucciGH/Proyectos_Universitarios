import java.util.ArrayList;
import java.util.Scanner;

public class EjArrayList2
{
    public static ArrayList<String> nombre = new ArrayList();
    // public static array nombre
    public EjArrayList2()
    {
        for(int i=0;i<4;i++){
            nombre.add("Elemento "+i);
        }
        // cargado de 4 elementos
    }
    
    public void borraElementos(){
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        if(pos > nombre.size()){// posicion del elemnto
            System.out.println("Elemento fuera de rango");
        }else{
            nombre.remove(pos); // elimina el elemento de la pos
            System.out.println("Elemento eliminado correctamente");    
        }
    }
    
    public void listaDeElementos(){
        for(int i=0;i<nombre.size();i++){
            System.out.print(nombre.get(i)+" ");
        }// nombre.get para obtener elemento de la pos indicada.
    }
    
    public void cantidadDeElementos(){
        System.out.println("Cantidad de elementos:"+nombre.size());
    } // array.size() para obtener el tamaño del array
    
    public void consultaElementosPorNombre(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(nombre.contains(s)){
            System.out.println(nombre.indexOf(s));
            // array.contains(elemento que quiero busc)
        }else{
            System.out.println("Error en la posicion");
        }
    }
    
    public void insertaElemento(){
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Ingrese la posicion:");
        int pos = sc.nextInt();
        if(pos < 0 || pos > nombre.size()){
            System.out.println("Error en la posicion");
        }else{
            System.out.println("Ingrese el string: ");
            String s = str.nextLine();
            if(s == ""){
                System.out.println("Error en el string");
            }else{
                nombre.add(pos,s);    
            }
        }
    }
    
    public void modificarElemento(){
        listaDeElementos();
        Scanner sc = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        int pos = sc.nextInt();
        
        if(pos < 0 || pos > nombre.size()){
            System.out.println("Error en la posicion");
        }else{
            String s = str.nextLine();
            if(s == ""){
                System.out.println("Error en el string");
            }else{
                nombre.set(pos,s);    
                System.out.println("El elemento ha sido modificado con exito");
                listaDeElementos();
            }
        }
    }
        
}
