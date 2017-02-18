package aspect.oriented.programming;

import annotation.practice.Fruit;
import annotation.practice.Hawking;

/**
 * Created by Adrian on 18.02.2017.
 */
@Fruit
public class Orange {
    String name;
    Integer length;
    Integer width;
    String originCountry;
    String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Hawking(name = "Width")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", originCountry='" + originCountry + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
