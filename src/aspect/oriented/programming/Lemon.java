package aspect.oriented.programming;

import annotation.practice.Fruit;
import annotation.practice.Hawking;
import annotation.practice.TableOfCountries;

/**
 * Created by Adrian on 18.02.2017.
 */

@Fruit(value = "Ewa")
public class Lemon {
    String name;
    Integer length;
    Integer width;
    Integer weight;
    String color;

    @Hawking(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Hawking(name = "Length")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @TableOfCountries(countries = {"Poland", "Malta"})
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
