package object_class;

import java.util.Objects;

class Player {

    int jerseyNo;
    String name;
    String sport;

    Player(int jerseyNo, String name, String sport) {
        this.jerseyNo = jerseyNo;
        this.name = name;
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Player [jerseyNo=" + jerseyNo + ", name=" + name + ", sport=" + sport + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Player other = (Player) obj;

        return jerseyNo == other.jerseyNo &&
               name.equals(other.name) &&
               sport.equals(other.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jerseyNo, name, sport);
    }
}

public class PlayerDemo {

    public static void main(String[] args) {

        Player p1 = new Player(7, "Ronaldo", "Football");
        Player p2 = new Player(7, "Ronaldo", "Football");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
