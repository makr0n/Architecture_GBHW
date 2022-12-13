package ModelElements;

import java.awt.*;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public Float Power;

    public Flash(Point3D Location, Angle3D Angle, Color Color, Float Power) {
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(Angle3D Angle) {

    }

    public void Move(Point3D Point) {

    }

}
