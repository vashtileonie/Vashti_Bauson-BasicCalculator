package com.vashtibauson.library.model;

/**
 * Abstract class representing a category of items.
 */
public abstract class Category {

    private String type; // Type of the category

    /**
     * Constructs a new Category with the specified type.
     *
     * @param type The type of the category (e.g., "Book", "E-Book")
     */
    public Category(String type) {
        this.type = type;
        printType(); // Print the type when a category is created
    }

    /**
     * Returns the type of the category.
     *
     * @return The type of the category
     */
    public String getType() {
        return type;
    }

    /**
     * Prints the type of the category.
     */
    public void printType() {
        System.out.println("Type: " + type);
    }
}
