package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;
import java.util.List;


public class ModelStore implements IModelChanger {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangedObserver changeObservers;

    public ModelStore(PoligonalModel Models, Scene Scenes, Flash Flashes, Camera Cameras, IModelChangedObserver changeObservers) {
        this.Models = new PoligonalModel(Models.Poligons, Models.Textures);
        this.Scenes = new Scene(Scenes.Id, Scenes.Models, Scenes.Flashes);
        this.Flashes = new Flash(Flashes.Location, Flashes.Angle, Flashes.Color, Flashes.Power);
        this.Cameras = new Camera(Cameras.Location, Cameras.Angle);
        this.changeObservers = changeObservers;
    }

    List<Scene> sceneList = new ArrayList<>();// добавлен для реализации метода GetScena, в реальной задаче сцены должны были бы храниться в БД.
    public Scene GetScena(int Id) { // Метод возвращает сцену по ее ID
        return sceneList.get(Id + 1);
    }

    public void NotifyChange() {

    }


}
