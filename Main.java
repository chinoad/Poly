package Poly;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Movie where a shark eats tons of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens land on the Earth";
    }
}

class BridgetJonesDiary extends Movie {
    public BridgetJonesDiary() {
        super("Bridget Jones Diary");
    }

    @Override
    public String plot() {
        return "Bridget Jones meets Mr. Darcey";
    }

}

class YouveGotMail extends Movie {
    public YouveGotMail() {
        super("You've got mail");
    }

}


public class Main {

    public static void main(String[] args) {

        for (int i=0; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "plot: " + movie.plot() + "\n");
        }
    }


    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*4)+1;
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new BridgetJonesDiary();
            case 4:
                return new YouveGotMail();
        }

        return null;
    }


}
