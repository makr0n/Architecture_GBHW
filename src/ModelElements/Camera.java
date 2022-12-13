package ModelElements;

public class Camera {
    /*
    This Class defines Camera location and direction in the scene
     */
    public Point3D Location;
    public Angle3D Angle;

    public Camera(Point3D Location, Angle3D Angle) {
        this.Location = Location;
        this.Angle = Angle;
    }

    public void Rotate(Angle3D Angle) { // this method used for camera rotating

    }

    public void Move(Point3D Point) { // this method used for moving camera in the scene

    }
}
