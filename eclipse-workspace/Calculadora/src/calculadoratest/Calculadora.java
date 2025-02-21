package calculadoratest;

public class Calculadora {
	
	public static int suma(int a, int b) { 
        return a + b; 
        } 

public static int resta(int a, int b) { 
        return a - b; 
        } 

public static int multiplica(int a, int b) { 
        return a * b; 
    } 
 
public static int divide(int a, int b) { 
        if (b == 0) { 
            throw new IllegalArgumentException("No se puede dividir por cero"); 
        } 
        return a / b; 
    } 
 
public static double potencia(double base, double exponente) { 
        return Math.pow(base, exponente); 
    } 
 
    public static double raizCuadrada(double numero) { 
        if (numero < 0) { 
 throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo"); 
 } 
 return Math.sqrt(numero); 
 } 
    
	 public static double logaritmoNatural(double numero) { 
 if (numero <= 0) { 
 throw new IllegalArgumentException("El logaritmo natural solo está definido para números positivos"); 
 } 
 else
	 return Math.log(numero);
}

	public static void main(String[] args) {
		double numero=2;
		System.out.println(logaritmoNatural(numero));
	}
		
}
