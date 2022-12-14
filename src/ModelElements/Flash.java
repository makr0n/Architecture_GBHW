package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;
import java.awt.*;

/*
Класс источник освещения
 */
public class Flash {
    public Point3D Location;// Местоположение источника света
    public Angle3D Angle; // Угол источника света
    public Color Color; // Цвет источника света
    public Float Power; // Яркость освещения

    public Flash(Point3D Location, Angle3D Angle, Color Color, Float Power) {
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(Angle3D Angle) { // Метод для поворота источника света

    }

    public void Move(Point3D Point) { // Метод для перемещения источника

    }

}
