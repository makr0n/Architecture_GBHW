package InMemoryModel;
import ModelElements.*;

public class ModelStore {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangedObserver changeObservers;

    public ModelStore(PoligonalModel Models, Scene Scenes, Flash Flashes, Camera Cameras, IModelChangedObserver changeObservers) {
        this.Models = new PoligonalModel(Models.Poligons, Models.Textures);
        this.Scenes = new Scene(Scenes.Id, Scenes.Models,Scenes.Flashes);
        this.Flashes = new Flash(Flashes.Location, Flashes.Angle, Flashes.Color,Flashes.Power);
        this.Cameras = new Camera(Cameras.Location, Cameras.Angle);
        this.changeObservers = changeObservers;
    }
}
