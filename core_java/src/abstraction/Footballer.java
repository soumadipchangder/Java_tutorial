package abstraction;

public class Footballer {

    private Country country;

    private Club club;

    public Footballer() {
        this.country = new Country("India");
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public void playMatch() {
        System.out.println("Playing for Country: " + getCountry().getName());

        if (getClub() != null) {
            System.out.println("Playing for Club: " + getClub().getName());
        } else {
            System.out.println("Currently not playing for any club.");
        }
    }

    public static void main(String[] args) {

        Footballer f = new Footballer();

        Club c = new Club("Real Madrid");

        f.setClub(c);

        f.playMatch();
    }
}

class Country {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Club {
    private String name;

    public Club(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
