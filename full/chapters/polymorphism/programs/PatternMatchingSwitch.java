public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Duck();
        birds[1] = new Hoopoe();
        birds[2] = new Owl();
        birds[3] = new Rooster();

        for (Bird bird : birds) {
            switch (bird) {
                case Duck duck -> System.out.println("Quack!");
                case Hoopoe hoopoe -> System.out.println("Oop-oop!");
                case Owl owl -> System.out.println("Hoot!");
                case Rooster rooster -> System.out.println("Cockadoodledoo!");
                default -> System.out.println("(Unknown bird)");
            }
        }

        Bird bird = birds[0];
        String call = switch (bird) {
            case Duck duck -> "Quack!";
            case Hoopoe hoopoe -> "Oopoop!";
            case Owl owl -> "Hoot!";
            case Rooster rooster -> "Cockadoodledoo!";
            default -> "(Unknown bird)";
        };
        System.out.println(call);

        double area = getArea(new Circle(10));
        System.out.println(area);

        Animal creature = new Human(true, true);
        switch (creature) {
            case Human human -> System.out.println("Human");
            case Mammal mammal -> System.out.println("Mammal");
            case Animal animal -> System.out.println("Animal");
        }

        Object object = "unpredictable";
        String result = switch (object) {
            case String string -> {
                if (string.length() % 2 == 0) {
                    yield "even string";
                } else if (string.length() > 5) {
                    yield "long string";
                } else {
                    yield "who knows";
                }
            }
            case Duck duck -> "quacks like a duck";
            default -> "who knows";
        };

        System.out.println(result);

        result = switch (object) {
            case String string when string.length() % 2 == 0 -> "even string";
            case String string when string.length() > 5  -> "long string";
            case Duck duck -> "quacks like a duck";
            default -> "who knows";
        };

        System.out.println(result);

        Object unknown = null;
        String data = switch(unknown) {
            case null -> "(null)";
            case String string -> "String: " + string;
            case Object other -> "Other: " + other;
        };

        System.out.println(data);
    }

    public static double getArea(Object object) {
        return switch (object) {
            case Circle circle -> Math.PI * circle.getRadius() * circle.getRadius();
            case Rectangle rectangle -> rectangle.getLength() * rectangle.getWidth();
            case Triangle triangle -> 0.5 * triangle.getBase() * triangle.getHeight();
            default -> throw new IllegalArgumentException();
        };
    }
}
