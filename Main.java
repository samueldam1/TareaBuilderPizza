public class Main {

    public static void main(String[] args){

        // Metodo normal de crear Objetos
        Pizzas pizzas_blank = new Pizzas();

        // Metodo con build

        // 1. Instanciar el Builder
        // 2. Modificar atributos
        // 3. Instanciar el objeto con el Builder (.build)


        // 1. Instanciar el Builder
        BuilderPizzas miBuilder = new BuilderPizzas();

        // 2. No modificamos nada
        // *****

        // 3. Instanciar el objeto con el Builder (.build)
        Pizzas pizzaDefault = miBuilder.build();

        // Imprimir el Objeto _pizza Tipo Pizza con el metodo toString
        System.out.println("Pizzas default: " + pizzaDefault.toString());


        // 1. Instanciar el Builder
        // YA ESTA

        // 2. Modificar atributo 'Cebolla' a 'true'
        miBuilder.setCebolla(false);

        // 3. Instanciar el objeto con el Builder (.build)
        Pizzas pizza_sin_Cebolla = miBuilder.build();

        // Imprimir el Objeto _pizza Tipo Pizza con el metodo toString
        System.out.println(pizza_sin_Cebolla.toString());

        // SINTAXIS REDUCIDA POCO LEGIBLE

        // 1. Instanciar el Builder
        // 2. Modificar atributos
        // 3. Instanciar el objeto con el Builder (.build)
        Pizzas pizza_sinGluten = new BuilderPizzas().setSinGluten(true).build();

        // SINTAXIS REDUCIDA LEGIBLE

        // 1. Instanciar el Builder
        Pizzas pizza_sinGluten2 = new BuilderPizzas()
                // 2. Modificar atributos
                .setSinGluten(true)
                // 3. Instanciar el objeto con el Builder (.build)
                .build();

    }
}