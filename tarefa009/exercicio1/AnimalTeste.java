package exercicio1;
public class AnimalTeste {
    public static void main(String[] args) {

        TipoAnimal tipo1 = new Cavalo();
        Animal animal1 = new Animal("Cavalo",3,tipo1);
        animal1.settipo(tipo1);
        animal1.setIdade(2);
        animal1.setNome("Cavalo");

        System.out.println(animal1.getNome() + ":");
        System.out.println(animal1.som());
        System.out.println(animal1.locomove());

        TipoAnimal tipo2 = new Cachorro();
        Animal animal2 = new Animal("Cachorro",2, tipo2);
        animal2.settipo(tipo2);
        animal2.setIdade(3);
        animal2.setNome("Cachorro");

        System.out.println(animal2.getNome() +":");
        System.out.println(animal2.som());
        System.out.println(animal2.locomove());

        TipoAnimal tipo3 = new Preguica();
        Animal animal3 = new Animal("Preguica",6, tipo3);
        animal3.settipo(tipo3);
        animal3.setIdade(4);
        animal3.setNome("Preguica");

        System.out.println(animal3.getNome() + ":");
        System.out.println(animal3.som());
        System.out.println(animal3.locomove());
    }

}
