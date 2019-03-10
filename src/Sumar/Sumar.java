package Sumar;
public class Sumar {


	private String valor_inicial;

	
	public Sumar(String string) {
        this.valor_inicial = string;
    }

	
	public String mostrar() {
        String numero = valor_inicial;
        
        if (numero.length() == 1 || (numero.length() == 2 && numero.substring(0,1).equals("-")))
        {
            return (numero + " = " + numero);
        }
        else if( numero.length() > 1 )
        {
        	String suma = "";
        	for (int i = 0; i < numero.length(); i++)
        	{
        		String digito = numero.substring(i, i+1);
        		
        		if(i == 0) { suma = suma + digito; }
        		else { suma = suma + " + " + digito; }
            }
        	
        	return (suma + " = " + total(numero));
        }
        
        return numero;
	}
	
	public int total(String numero) {
        int suma = 0;
        
        for (int i = 0; i < numero.length(); i++)
        {
            String digito = numero.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);
        }
        
        return suma;
    }
}