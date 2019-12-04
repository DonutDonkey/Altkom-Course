package pl.accenture;

class Animal {
    {  System.out.println("Blok kodu Animal"); }

    static {
        System.out.println("Statyczny blok kodu Animal");
    }

    public Animal() {  System.out.println("Konstruktor Animal"); }

    void breath() { System.out.println(" ######## Animal breath"); }
}

class Bird extends Animal {
    {  System.out.println("Blok kodu Bird"); }

    static { System.out.println("Statyczny blok kodu Bird"); }

    public Bird() { System.out.println("Konstructor Bird"); }

    @Override
    void breath() {
//        super.breath();
        System.out.println("##########Bird breath");
    }
}

class Pigeon extends Bird {
    {  System.out.println("Blok kodu Pidgeon"); }

    static { System.out.println("Statyczny blok kodu Pidgeon"); }

    public Pigeon() { System.out.println("Konstruktor Pigeon"); }

    @Override
    void breath() {
//        super.breath();
        System.out.println("#########Pigeon Breath");
    }
}
