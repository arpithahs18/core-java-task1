class Mobile {
    String name;
    String brand;
    String color;
    String model;
    int storage;

    Mobile() {}

    Mobile(String name, String brand, String color, String model, int storage) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.storage = storage;
    }

    Mobile(Mobile m) {
        this.name = m.name;
        this.brand = m.brand;
        this.color = m.color;
        this.model = m.model;
        this.storage = m.storage;
    }

    void display() {
        System.out.println("Mobile [name=" + name + ", brand=" + brand + ", color=" + color 
            + ", model=" + model + ", storage=" + storage + "]");
    }
}