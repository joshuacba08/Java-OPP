import java.util.ArrayList;
import java.util.Iterator;

public class Agenda{
    private ArrayList<String> notas;

    public Agenda(){
        notas = new ArrayList<String>();
    }

    public boolean validarNumeroDeNota(int numeroDeNota){
      if ((numeroDeNota<0)||(numeroDeNota>numeroDeNotas())) {
        return false;
      }
      else{
        return true;
      }
    }

    public void guardarNota(String nota){
      notas.add(nota);
    }

    public int numeroDeNotas(){
      return notas.size();
    }
    public void mostrarNumeroDeNotas(int numeroDeNota){
      if(validarNumeroDeNota(numeroDeNota)){
        System.out.println(notas.get(numeroDeNota));  
        }
      else{
        System.out.println("La nota no existe");
      }
    }

    public void eliminarNota(int numeroDeNota){
      if(validarNumeroDeNota(numeroDeNota)){
        notas.remove(numeroDeNota);
      }
      else{}
    }
    public void imprimirNotas(){
        int i=0;
        for(String nota : notas){
            System.out.println( i +": "+ nota);
            i++;
    
        }
    }
    
    public void listarTodasLasNotas(){
        Iterator<String> it = notas.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
