package InMemoryModel;

/*
Интерфейс смены трехмерной модели
 */
public interface IModelChanger {

    void NotifyChange(IModelChanger sender); // оповещение о смене модели

}
