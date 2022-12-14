package ModelElements;

/*
 Класс полигональная модель
 */
public class PoligonalModel {
    public Poligon Poligons ;
    public Texture Textures;


    public PoligonalModel(Poligon Poligons, Texture Textures) {
        this.Poligons = new Poligon(Poligons.Points) ;
        this.Textures = Textures;
    }
}
