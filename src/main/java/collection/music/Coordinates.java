package collection.music;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coordinates")
public class Coordinates {
    private Double x; //Поле не может быть null
    private Integer y; //Значение поля должно быть больше -620, Поле не может быть null

    public Coordinates(){}

    public Double getX() {
        return x;
    }

    @XmlElement(name = "coordinateX")
    public void setX(Double x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    @XmlElement(name = "coordinateY")
    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}