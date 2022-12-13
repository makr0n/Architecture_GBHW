package ModelElements;

import java.lang.reflect.Type;
/*
  Scene Class used for creating and storing 3d scene with models and lighting
 */
public class Scene {
    public int Id; //Scene ID
    public PoligonalModel Models; //Models that will be used in the scene
    public Flash Flashes; //Light in the scene


    public Scene(int Id, PoligonalModel Models, Flash Flashes) {
        this.Id = Id;
        this.Models = Models;
        this.Flashes = Flashes;
    }

    public Type method1(Type Input) {
        Type result = Input;
        return result;
    }

    public Type method2(Type Source, Type Number) {
        Type result = Source;
        if (Source != null) {
            return result;
        } else {
            return Number;
        }

    }

}
