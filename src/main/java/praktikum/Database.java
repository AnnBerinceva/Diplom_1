package praktikum;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс с методами по работе с базой данных.
 */
public class Database {

    private final List<praktikum.Bun> buns = new ArrayList<>();
    private final List<Ingredient> ingredients = new ArrayList<>();

    public Database() {
        buns.add(new praktikum.Bun("black bun", 100));
        buns.add(new praktikum.Bun("white bun", 200));
        buns.add(new praktikum.Bun("red bun", 300));

        ingredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));

        ingredients.add(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        ingredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        ingredients.add(new Ingredient(IngredientType.FILLING, "sausage", 300));
    }

    public List<praktikum.Bun> availableBuns() {
        return buns;
    }

    public List<Ingredient> availableIngredients() {
        return ingredients;
    }

}