public class Main {



//    public static void addToZoo(Animals animal) {
//        if (animal instanceof)
//        if (!Animals.animalExists(animal)) {
//
//        }
//    }

    public static void main(String[] args) {


//        Herbivore gazelle = new Herbivore("трава","саванна", 70);
//
//        if (!Herbivore.herbivoreExists(gazelle)) {
//            Herbivore.herbivores[0] = gazelle;
//        }
//
//
//
//        gazelle.sleep();
//        Herbivore giraffe = new Herbivore("листва","саванна",45);
//        Herbivore horse = new Herbivore("трава","степи",60);

        // хищники

        Predator tiger = new Predator("Тигр", 5, "Саванна", 80,"мясо");
        if (!Predator.predatorExists(tiger)) {
            Predator.predators[0] = tiger;
        }

        Predator hyena = new Predator("Гиена" , 4, "Саванна",50,"мясо");
        if (!Predator.predatorExists(hyena)) {
            Predator.predators[1] = hyena;
        }

        System.out.println(Predator.predators[1]);


        Predator bear = new Predator("Медведь", 10, "Лес",50,"всеядный");

        // земноводные

        Amphibians ligushka = new Amphibians("водоемы");
//        if (!Amphibians.amphibianExists(ligushka)) {
//            Amphibians.amphibians[1] = ligushka;
//        }


        ligushka.hunts();
        Amphibians alreadyFreshwater = new Amphibians("суша,водоемы");
        alreadyFreshwater.hunts();

        // птицы

        Flightless peacock = new Flightless("ходьба");
        Flightless penguin = new Flightless("ходьба,плаванье");
        Flightless dodoBird = new Flightless("ходьба");

        // летающие птицы

        FlyingBirds gull = new FlyingBirds("летают");
        FlyingBirds albatross = new FlyingBirds("летают");
        FlyingBirds falcon = new FlyingBirds("летают");





    }
}