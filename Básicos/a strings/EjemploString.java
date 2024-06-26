
/**
 * class EjemploString .
 * 
 * @author jlc
 * @version 1.0.0
 */
public class EjemploString
{
    // instance variables -
    private String s;    
    private char c = 'w';

    /**
     * Constructor for objects of class EjemploString
     */
    public EjemploString()
    {
        // initialise instance variables
        s = "abc-abc-123";
    }

     /*
     * Ejemplo del metodo length();
     */
     public void setS(String s)
    {
        System.out.println("Cantidad de caracteres antes de modificar -"+this.s+"- = "+this.s.length());
        this.s = s;
        int  longitud =  s.length();
        System.out.println("Cantidad de caracteres ahora -"+s+"- = "+longitud);
    }
    
    
    /*
     * Ejemplo del metodo length();
     */
     public void ejemploLength()
    {
    String s = "cucu";
        int  longitud =  s.length();
        System.out.println("Cantidad de caracteres de "+s+" = "+longitud);
    }
    
    /*
     * Ejemplo del metodo indexOf()
     */   
    public void ejemploIndexOf()
    {
        
        String str1 = "expedición";
        //Busca la p a partir del 5to carácter
        System.out.println("Palabra:-"+str1+"- cantidad de caracteres: "+str1.length());
        System.out.println("Busca la -p- en "+str1+" a partir del 5to caracter: "+str1.indexOf("p",5));
         System.out.println("Busca la -p- en "+str1+" a partir del 1er caracter: "+str1.indexOf("p",0));

        //Busca la ‘p’ a partir del último carácter
        System.out.println("Busca la -p- en "+str1+" a partir del caracter "+ str1.length()+":"+str1.indexOf("p",str1.length()));
        System.out.println("Busca la -p- en "+str1+" a partir del caracter 22 "+str1.indexOf("p",22));
    
        
        String str = "la expedicion de san Martin en el cruce de los andes ";
          
          System.out.println(str.indexOf(('x'), str.length()));
          System.out.println("Buscando la letra -x- a´partir de la posicion : "+str.length()+
           " en la palabra "+str);
           
           System.out.println("Buscando  -d- a partir de la posicion 0, esta en la posicion "+str.indexOf(('d'), 0));
           System.out.println("Buscando -pe- a partir de la posicion 5, esta en la posicion "+str.indexOf(("pe"), 5));
     }
    
     /**
     * Ejemplo del metodo replace('u', 'o');
     */ 
     public void ejemploReplace()
    {
        String s = "cucu";
        String s1 = s.replace('u', 'o');
        System.out.println(s);
        System.out.println(s1);
        
        
        // cambio un subtring por otro 
        String s2 = "la computadora es muy potente";
        String s3 = s2.replace("potente", "debil");
        System.out.println(s2);
        System.out.println(s3);
    }
    /**
     * Ejemplo del metodo Uppercase
     */ 
    public void ejemploUppercase()
     {
      
          String a = "La computadora es rápida";
          System.out.println(a);
          String A = a.toUpperCase();
          System.out.println("Pasado a mayuscula:"+A);
    }    

    /**
     * Ejemplo del metodo Equals
     */ 
    public void ejemploEquals()
     {
    
        String str1="El lenguaje Java";
        String str2="El lenguaje Java";

       if(str1.equals(str2)){  
           System.out.println("El mismo contenido");
       }else{
            System.out.println("Distinto contenido");
        }

    }
      
    /**
     * Ejemplo del metodo StartsWith
     */ 
      public void ejemploStartsWith()
     { 
         String a1 = "El lenguaje Java";
         if  (a1.startsWith("E")) 
            System.out.println("es una e mayuscula");
         else
            System.out.println("NO es una e mayuscula");

            
         if  (a1.startsWith("E", 4)) 
            System.out.println("es una e mayuscula es la posicion 4");
         else
            System.out.println("NO es una e mayuscula es la posicion 4");
            
            
         String a = "Maquina del Tiempo";
     
        //boolean startsWith(String str):  
            if (a.startsWith("Maq"))
                System.out.println("Comienza con Maq");
            else
                System.out.println("NO Comienza con Maq");

        String b = "LA MAQUINA";
          if (b.startsWith("MA", 3))
                System.out.println("Comienza con MA después de la posición 3");
         else
                System.out.println("NO Comienza con MA después de la posición 3");

     }
      
     /**
     * Ejemplo del metodo Trim()
     * saca los espacios antes y despues del string 
     */ 
      public void ejemplosTrim()
     { 
         String str = " hola que tal ";
         System.out.println("Total de caracteres de -"+str+"- "+str.length());
         String str_trim = str.trim();
         System.out.println("Total de caracteres de -"+str_trim+"- "+str_trim.length());

     }
     
          
     /**
     * Ejemplo del metodo EndWith()
     */ 
      public void ejemplosEndWith()
     { 
         String str_Sample = "Java String endsWith ejemplo";
        //Check if ends with a particular sequence
        System.out.println("EndsWith character 'e': " + str_Sample.endsWith("e"));
        System.out.println("EndsWith character 'ple': " + str_Sample.endsWith("plo"));
        System.out.println("EndsWith character 'Java': " + str_Sample.endsWith("Java"));
     
     
      }
     
     /**
     * Ejemplo del metodo SubString()
     */ 
      public void ejemplosSubString()
     { 
         String str = "hola que tal";
         System.out.println(str.substring(2, 4));
         
        
         
         // no se compara con signo igual 
         // compara de la posicion 2 a la 3 incluida ( no toma la posicion 4) 
         if (str.substring(2, 4) == "la")
           System.out.println("de la posicion a2 a la 3 esta -la- ");
         else
           System.out.println("de la posicion  2 a la 3 NO esta -la-");
         
           
           //se compara con el metodo equals.  
           if(str.substring(2,4).equals("la")){  
              System.out.println("El mismo contenido de la posicion 2 a la 3");
           }else{
                System.out.println("Distinto contenido de la posicion 2 a la 3");
           }
           
           
           
        String str1 = "La máquina del tiempo no existe";
        System.out.println(str1.substring(4,9));
        
         // da error de inidice fuera de rango 
         System.out.println(str1.substring(2, 55));


     }
     
     /**
     * Ejemplo del metodo CharAt()
     */
     public void ejemplosCharAt()
     {
        String a = "En mi proxima vida, voy a ser un héroe";
        char result = a.charAt(7);
        System.out.println("Caracter 7:"+result);

      }
     
     
    /**
     *  
     * Recorrer un String caracter por caracter
     * 
     */
    public void recorrerPorLetra()
    {
        String a = "Mañana es sabado";
        int x;
        for (x=0;x<a.length();x=x+1) {
            System.out.println("letra en posicion:"+x+" "+a.charAt(x));
              
        }        

    }
    
      
   /**
     *  
     * Comparacion de String
     */
   public void ej4ComparaString()
   {
   
   String str1="El lenguaje Java";
   String str2=new String("El lenguaje Java");

   if(str1==str2){
      System.out.println("Los mismos objetos");
   }else{
      System.out.println("Distintos objetos");
   }

   if(str1.equals(str2)){  
      System.out.println("El mismo contenido");
   }else{
        System.out.println("Distinto contenido");
   }

  }   
   
  /**
     *  
     * Comparacion de String
     */
   public void ej5ComparaString()
   {
   
   String str1="El lenguaje Java";
   String str2=str1;

   if(str1==str2){
      System.out.println("Los mismos objetos");
   }else{
      System.out.println("Distintos objetos");
   }

   if(str1.equals(str2)){  
      System.out.println("El mismo contenido");
   }else{
        System.out.println("Distinto contenido");
   }

  }   
   
   
}
