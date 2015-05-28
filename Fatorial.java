public class Fatorial{
    // Versao iterativa
    public int calculaFatorial(int n){
         if (n<0)
               System.out.println("Error");
         int resultado = 1;
         
         for(int i = 2; i<=n; i++)
            resultado *= i;

            return resultado;      
     
    }

}