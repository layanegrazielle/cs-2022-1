package exercicio1;
public class Zoologico {
    public static void main(String[] args, TipoAnimal Cavalo, TipoAnimal Cachorro, TipoAnimal Preguica){
        Animal [] jaula = new Animal [10];
        jaula[0] = new Animal("Cavalo", 3, Cavalo);
        jaula[1] = new Animal("Cachorro", 5, Cachorro);
        jaula[2] = new Animal("Preguica", 6, Preguica);
    }
         
}
