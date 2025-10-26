class Bird {
    String name;
    String color;
    int lifespan;
    double weight;
    String food;

    Bird() {}

    Bird(String name, String color, int lifespan, double weight, String food) {
        this.name = name;
        this.color = color;
        this.lifespan = lifespan;
        this.weight = weight;
        this.food = food;
    }

    Bird(Bird b) {
        this.name = b.name;
        this.color = b.color;
        this.lifespan = b.lifespan;
        this.weight = b.weight;
        this.food = b.food;
    }

    void display() {
        System.out.println("Bird [name=" + name + ", color=" + color + ", lifespan=" + lifespan 
            + ", weight=" + weight + ", food=" + food + "]");
    }
}
