import java.util.ArrayList;


class Hero
{
    public String name;
    public float hp;
    public int damage;
    public Hero()
    {

    }
    public Hero(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name;
    }
}
public class Collection
{
    public static void main(String[] args)
    {
        ArrayList heros = new ArrayList();
        heros.add(new Hero("盖伦"));
        System.out.println(heros.size());

    }
}
