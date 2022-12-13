package ModelElements;

import java.awt.*;

/*
This class defines scene lighting behavior
 */
public class Flash {
    public Point3D Location;// location of the light source
    public Angle3D Angle; // angle of the light source
    public Color Color; // color of the light source
    public Float Power; // light power

    public Flash(Point3D Location, Angle3D Angle, Color Color, Float Power) {
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(Angle3D Angle) { // this method used for  rotating light source

    }

    public void Move(Point3D Point) { // this method used for moving light source

    }

}
