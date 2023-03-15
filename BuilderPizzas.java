import java.util.Locale;

public class BuilderPizzas {
    // Creacion de objeto por defecto pero 1 o mas atributos modificados.

    // Objeto que el builder va a construir
    // El guión bajo se utiliza para remacar que es un objeto de esta clase
    protected Pizzas _pizza;

    // Instanciamos el Objeto con todas sus variables por defecto.
    public BuilderPizzas(){
        _pizza = new Pizzas();
    }

    public Pizzas build(){
        return this._pizza;
    }


    // Metodos para la personalizacion de la pizza
    public BuilderPizzas setTipoMasa(int tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setSize(int size) {
        _pizza.setSize(size);
        return this;
    }

    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRellena(relleno);
        return this;
    }

    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    public BuilderPizzas setSinGluten(boolean sinGluten){
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    public BuilderPizzas setRecojida(int recojida) {
        _pizza.setRecojida(recojida);
        return this;
    }
}
