package patterns;
import resource.AbstractItem;

public class FoodItem extends AbstractItem {

    public FoodItem(String qType, float sizeX, float sizeY, float sizeZ, float weight) {
        super(qType, sizeX, sizeY, sizeZ, weight);
    }

    @Override
    public String GetItemType(){
        return "Food items";
    }

    @Override
    public String GetTypeOfPlace(){
        if ((weight < 100)&((sizeX<100)&(sizeY<120)&(sizeZ<80))) return "Place: shelf";
        if ((weight < 2500)&((sizeX<100)&(sizeY<120))) return "Place: pallet";
        return "Place: floor";
    }

    @Override
    public String GetStoragePlace(){
        return "Fridge";
    }

}
