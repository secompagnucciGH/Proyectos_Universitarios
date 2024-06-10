import java.util.*;

public class Estrucuturas
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Estrucuturas
     */
    public Estrucuturas()
    {
        x = 0;
    }

    public void  e1_alt_simple()
    {
        int a = 5;
        int b = 4;
          if (a == b) {
            System.out.println("alternativa simple 1");   
            System.out.println("segunda linea de ña estrucutra alternayiva "); 
          }
        
          System.out.println("Salida fin de alternativa 1");
        
        // la misma alternativa sin llaves 
        if (a != b) 
            System.out.println("alternativa simple 2");  
        else
            System.out.println("termino la alternativa 3");  
            
        System.out.println("alternativa simple 4");        
        
            
    }
        
     /**
     * expresiones logica con variables boolenas 
     * 
     */  
    public void  e2_variable_logica()
    {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a) {  // equivale a preguntar si es verdader0
            System.out.println("es verdadero");         
        }
       
        // la mimsa alternativa sin llaves 
        if (!a) {   // si no es verdadero
            System.out.println("es falsa");         
        } else {
            System.out.println("es verdadero");  
        }  
        
               
    }
        
    /**
     * expresiones logicas compuestas and (&& or (||)
     * 
     */
       public void  e3_expres_log_dobles()
    {   
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a || c) 
            System.out.println("a o c son verdaderas ");
            

        if (a && c) {
            System.out.println("a y c son verdaderas ");
        }
        
         if (a && b) {
            System.out.println("a y b son verdaderas ");
        } else {
            System.out.println("a y b no son verdaderas ");
        }
        
     }    
     
     /**
     * expresiones logicas anidades
     * 
     */
      public void  e4_alt_anidadas()
    { 
        int temperatura = 28;
        boolean nevando = false;
        
        if (temperatura > 25) {
            // Si la temperatura es mayor que 25 ...
            System.out.println("A la playa!!!");
        } else {
            if (temperatura > 15) {
                // si es mayor que 15 y no es mayor que 25 ..
            System.out.println("A la montaña!!!");
            } else {
                if (temperatura < 5 && nevando) {
                     // si es menor que 5 y está nevando y no es mayor
                     // que 15 ni mayor que 25
                     System.out.println("A esquiar!!!");
                } else {
                    // si la temperatura no es mayor que 25 ni que 15
                //  ni menor que 5 
                    System.out.println("A descansar... zZz");
                } 
            }
        }
    }
    
    
    public void  e5_operadorCondicional(int num) {
       
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
        
        int x=4;
        int y = 5;
        
        int mayor=(x>y) ? x:y;    // toma el valor del mayor de x e y
        
        System.out.println(" 1) el mayor es "+mayor);    
        // es lo mismo que esto 
        if (x>y)
           mayor = x;
        else
           mayor = y;
        
        System.out.println(" 2) el mayor es "+mayor);             
   }
   
     /**
     * ejemplo del uso de  switch ( alternativa multiples)
     * 
     */
        public void e6_Switch_nombreMes(int mes) {
             
        switch (mes)
        {
                case 1: System.out.println("ENERO");
                           break;
                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;
               default : 
                     System.out.println("Mes no válido");      
        }
    }
 
     /**
     * ejemplo del cico FOR (PARA) 
     * 
     */
    public void  e7_cilcoFor() {
              int a = 0;
            
         for (int z=1;z<= 10;z=z+1)  {
            a=a+z;
            System.out.println(z);
            }
            
           
    }

    /**
     * ejemplo del cico DO WHILE
     * 
     */
    public void e8_ciclo_Do_While() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor=teclado.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                  if (valor>=0) {
                       System.out.println("Tiene 1 dígitos.");
                  } else {
                       System.out.println("Valor no contemplado.");
                  }
                }
            }
        } while (valor!=0);        
    }

    
    /**
     * ejemplo del cico  WHILE DO
     * 
     */
    
    public void  e9_metodo_while()      {
        Scanner teclado=new Scanner(System.in);
        int valor = 9;
        System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
         valor=teclado.nextInt();
         while (valor!=0) {
                if (valor>=100 ) {
                    System.out.println("Tiene 3 dígitos.");
                } else {
                    if (valor>=10) {
                        System.out.println("Tiene 2 dígitos.");
                    } else {
                         if (valor>=0) {
                                   System.out.println("Tiene 1 dígitos.");
                             } else {
                                   System.out.println("Valor no contemplado.");
                             }
                  }
                }
               System.out.println("Ingrese otro valor entre 0 y 999 (0 finaliza):");
               valor=teclado.nextInt();
        }
     }

    
    
    public void ingresaDatosNumerico() { 
         // definición del teclado como entrada
        Scanner sc = new Scanner(System.in);
        int nro = 0; 
        System.out.println("Ingrese un Numero: "); 
        nro = sc.nextInt(); // solicita el nro por teclado
        System.out.println("El nro ingresado fue:"+nro); 
    } 
    
    
   public void ingresaDatosAlfanumerico()  { 
        // definición del teclado como entrada 
        Scanner sc = new Scanner(System.in); 
        String p; 
        System.out.println("Ingrese una Palabra: "); 
        p = sc.nextLine(); //solicita palabra por teclado
        System.out.println("La palabra ingresada fue:"+p); 
   }
    
   public void ingresaDatos() { 
        // definición del teclado como entrada 
        Scanner sc = new Scanner(System.in); 
        int nro = 0; 
        double nrod = 0; 
        String p;
        
        System.out.print("Ingrese una Palabra: "); 
        p = sc.nextLine(); //solicita la palabra por teclado
        System.out.print("Ingrese un Numero entero: "); 
        
        nro = sc.nextInt(); //solicita el número entero por teclado
        System.out.print("Ingrese Numero con decimales: ");
        
        nrod = sc.nextDouble(); //solicita ingreso nro con decimales 
        
        System.out.println("El numero ingresado fue: "+nro); 
        System.out.println("La palabra ingresada fue:"+ p);
        System.out.println("Decimal ingresado fue: "+nrod);
        
        //Ejemplo para leer un carácter
        Scanner scLetra = new Scanner(System.in); 
        System.out.print("Ingrese una Letra: ");
        char letra=scLetra.nextLine().charAt(0);
        System.out.println("Caracter ingresado fue: "+letra);
  }
    
    
    
    
  }
