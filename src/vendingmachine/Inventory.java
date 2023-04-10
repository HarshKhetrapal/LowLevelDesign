package vendingmachine;

public class Inventory {
    ItemShelf[] itemShelves;

    public Inventory(int count) {
        this.itemShelves = new ItemShelf[count];
        this.intializeEmptyShelf();
    }

    private void intializeEmptyShelf() {
        int code = 101;
        for(int i = 0; i < this.itemShelves.length; i++) {
            ItemShelf emptyShelf = new ItemShelf();
            emptyShelf.code = code + i;
            emptyShelf.soldOut = true;
            itemShelves[i] = emptyShelf;
        }
    }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] itemShelves) {
        this.itemShelves = itemShelves;
    }

    public  void addItem(Item item, int code) throws Exception {
        for(ItemShelf shelf: itemShelves) {
            if (shelf.getCode() == code){
                if(shelf.soldOut) {
                    shelf.setItem(item);
                    shelf.setSoldOut(false);
                }
                else
                    throw new Exception("Item already present on the shelf");
            }
        }
    }

    public Item getItem(int code) throws Exception {
        for (ItemShelf shelf: itemShelves) {
            if(shelf.getCode() == code) {
                if(shelf.getSoldOut())
                    throw new Exception("Item is sold out");
                else
                    return shelf.item;
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateSoldOut(int code) {
        for (ItemShelf shelf: itemShelves) {
            if(shelf.getCode() == code) {
                shelf.setSoldOut(true);
            }
        }
    }
}
