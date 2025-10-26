class Trees {
    String name;
    String color;
    String usage;
    double height;
    int lifespan;

    
    Trees() {
    }

    Trees(String n) {
        name = n;
    }

    Trees(String name, String color, String usage, double height, int lifespan) {
        this.name = name;
        this.color = color;
        this.usage = usage;
        this.height = height;
        this.lifespan = lifespan;
    }

   
    Trees(Trees tree) {
        this.name = tree.name;
        this.color = tree.color;
        this.usage = tree.usage;
        this.height = tree.height;
        this.lifespan = tree.lifespan;
    }

    void display() {
        System.out.println("Name: " + name + ", Color: " + color + ", Usage: " + usage +
                           ", Height: " + height + ", Lifespan: " + lifespan);
    }
}
