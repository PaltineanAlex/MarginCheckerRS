import java.util.ArrayList;
import java.util.List;

public class ItemList {
    private final List<RunescapeItem> items;

    public ItemList() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(RunescapeItem item){
        if(items.contains(item)){
            System.out.println("The item that you are trying to add is already on the list. ");
            return false;
        }
        else{
            items.add(item);
            System.out.println("Item added successfully");
            return true;
        }
    }

    public boolean removeItem(int id){
        if(!findItem(id)){
            System.out.println("The item that you are trying to remove doesn't exist.");
            return false;
        }else{
            items.remove(returnItemFound(id));
            System.out.println("Item removed successfully");
            return true;
        }
    }

    private boolean findItem(int id){
        for(int i = 0; i < items.size(); i++){
            RunescapeItem itemToFind = items.get(i);
            if(itemToFind.getId() == id){
                return true;
            }
        }
        return false;
    }

    private RunescapeItem returnItemFound(int id){
        for(int i = 0; i < items.size(); i++){
            RunescapeItem itemToFind = items.get(i);
            if(itemToFind.getId() == id){
                return itemToFind;
            }
        }
        return null;
    }

    public void printList(){
        System.out.println("The list of the current items is: ");
        for(RunescapeItem item : items){
            System.out.println(item.toString() );
        }
        System.out.println("========================");
    }
}
