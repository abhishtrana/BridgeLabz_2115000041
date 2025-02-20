interface MealPlan {
    String getMealPlanType();
}

class VegetarianMeal implements MealPlan {
    public String getMealPlanType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealPlanType() {
        return "Vegan";
    }
}

class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMeal() {
        System.out.println("Meal Plan: " + mealType.getMealPlanType());
    }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated meal plan: " + meal.getMealPlanType());
    }

    public static void main(String[] args) {
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();

        generateMeal(vegMeal);
        generateMeal(veganMeal);
    }
}
