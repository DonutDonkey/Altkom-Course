package pl.accenture;

public class Main {
    
	// Comment - change in git repo
	
    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        Bird bird = new Bird();
        Pigeon pigeon = new Pigeon();

        Animal [] animals = {animal, bird, pigeon};

        for (Animal an : animals) {
            an.breath();
        }
    }
}
