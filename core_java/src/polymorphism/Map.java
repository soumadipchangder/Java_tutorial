package polymorphism;

// Version 1
class MapV1 {
    public void route() {
        System.out.println("MapV1: Showing route with directions only.");
    }
}

// Version 2
class MapV2 extends MapV1 {
    @Override
    public void route() {
        System.out.println("MapV2: Showing route with directions and duration.");
    }
}

// Version 3
class MapV3 extends MapV2 {
    public void bookCab() {
        System.out.println("MapV3: Your cab is here 🚕");
    }
}

// Test class
public class Map {
    public static void main(String[] args) {

        // V1 object
        MapV1 v1 = new MapV1();
        v1.route();

        // ✅ Upcasting V2 into V1
        MapV1 v2 = new MapV2();
        v2.route();   // MapV2 version runs

        // ✅ Upcasting V3 into V1
        MapV1 v3 = new MapV3();
        v3.route();   // MapV2 version runs (overridden in V2)

        // Accessing V3 method using downcasting
        MapV3 realV3 = (MapV3) v3;
        realV3.bookCab();
    }
}
