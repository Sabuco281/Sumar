package Sumar;

public class Final {


	public static void main(String[] args)
	{
		if (args.length != 1) {
            System.err.println("Es necesario un argumento en la ĺínea de comandos.");
        } else {
            Sumar suma = new Sumar(args[0]);
            System.out.println(suma.mostrar());
        }
	}

}