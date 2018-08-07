package sub12.model;

public class Paper {

    public void setDot(Writable obj, int x, int y){
        System.out.println(
                String.format("Поставлена точка цвета %s, диаметра %d по координатам x = %d, y = %d.",
                obj.getDot().getColor(), obj.getDot().getDiameter(), x, y)
        );
    }
}
