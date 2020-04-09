class Main {
    public static void main(String[] args) {
        // Pizza p = new PizzaBuilder()
        //    .crust("Cheesy Bites")
        //    .addTopping("Meat Lovers")
        //    .addTopping("Tuna Melt")
        //    .size("large")
        //    .build();
        // System.out.println(p.getPrice());
        
        // Pizza p = new PizzaBuilder()
        //    .build();
        // System.out.println(p.getPrice());

        Pizza p = new PizzaBuilder()
           .crust("Cheesy Bites")
           .size("large")
           .addTopping("Meat Lovers")
           .crust("Original")
           .addTopping("Meat Lovers")
           .size("small")
           .build();
        System.out.println(p.getPrice());
    }
}