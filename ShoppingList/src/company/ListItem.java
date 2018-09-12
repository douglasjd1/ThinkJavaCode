package company;

public class ListItem
{
    private String name;
    private int quantity = 1;

    ListItem(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void quantityUp()
    {
        quantity++;
    }

    public void quantityDown()
    {
        quantity--;
    }

    public void addQuantity( int numToAdd)
    {
        quantity += numToAdd;
    }

    public void subQuanitity(int numToSub){ quantity -= numToSub; }

}
