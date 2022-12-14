package ModelElements;

import java.lang.reflect.Type;

/*
  Класс трехмерная сцена
 */
public class Scene {
    public int Id; //Номер сцены
    public PoligonalModel Models; //Модели используемые в сцене
    public Flash Flashes; //Освещение сцены


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
        return result;


    }

}
