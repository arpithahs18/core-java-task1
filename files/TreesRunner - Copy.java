class TreesRunner {
    public static void main(String[] args) {
        Trees tree1 = new Trees();
        tree1.display();

        Trees tree2 = new Trees("Mango");
        tree2.display();

        Trees tree3 = new Trees("Apple", "Red", "Fruit", 5.5, 50);
        tree3.display();

        Trees tree4 = new Trees(tree3);
        tree4.display();

        Trees tree5 = new Trees(new Trees("Neem", "Green", "Medicinal", 8.0, 120));
        tree5.display();
    }
}
