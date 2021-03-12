import java.util.ArrayList;
import java.util.Random;

/**
 * La clase Contestador represante un objeto generador de respuestas.
 * Se lo usa para generar una respuesta autom�tica por azar seleccionando 
 * una frase de una lista predefinida de respuestas.
 * 
 * @version    0.2
 * @author     Michael Kolling and David J. Barnes
 */
public class Contestador
{
    private Random generadorDeAzar;
    private ArrayList<String> respuestas;

    /**
     * Crea un Contestador
     */
    public Contestador()
    {
        generadorDeAzar = new Random();
        respuestas = new ArrayList<String>();
        rellenarRespuestas();
    }

    /**
     * Genera una respuesta
     * 
     * @return   Una cadena que se podr�a mostrar como respuesta
     */
    public String generarRespuesta()
    {
        // Pick a random number for the index in the default response 
        // list. The number will be between 0 (inclusive) and the size
        // of the list (exclusive).
        int indice = generadorDeAzar.nextInt(respuestas.size());
        return respuestas.get(indice);
    }

    /**
     * Construye una lista de respuestas por defecto desde donde se tomar�
     * una cuando no sepamso m�s qu� decir.
     */
	private void rellenarRespuestas() {
		respuestas.add("Parece complicado. �Podr�a describir \n"
				+ "el problema m�s detalladamente?");
		respuestas
				.add("Hasta ahora, ning�n cliente inform� \n"
						+ "sobre este problema. �Cu�l es la configuraci�n de su equipo?");
		respuestas.add("Lo que dice parece interesante, "
				+ "cu�nteme un poco m�s");
		respuestas.add("Necesito un poco m�s de informaci�n.");
		respuestas.add("�Verific� si tienen alg�n conflicto con una dll?");
		respuestas.add("Ese problema est� explicado en el manual.\n"
				+ "�Ley� el manual?");
		respuestas.add("Su descripci�n es un poco confusa.\n"
				+ "�Cuenta con alg�n experto que lo ayude a \n"
				+ "describir el problma de manera m�s precisa?");
		respuestas.add("Eso no es una falla, es una caracter�stica\n"
				+ "del programa!");
		respuestas.add("�Ha podido elaborar esto?");
	}
}
