package vendingmachine;

import vendingmachine.state.IState;

public class ApplicationMain {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        try{
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(machine);
            displayInventory(machine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            IState state = machine.machineState;
            state.clickOnInsertCoinButton(machine);

            state = machine.machineState;
            state.insertCoin(machine, Coin.FiveRs);
            state.insertCoin(machine, Coin.TwentyFive);
            state.insertCoin(machine, Coin.FiveRs);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            state.clickOnSelectProductButton(machine);

            state = machine.machineState;
            state.chooseProduct(machine, 102);

            displayInventory(machine);

        } catch (Exception e) {
            displayInventory(machine);
        }

    }

    private static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().getItemShelves();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = null;
            if(i >=0 && i<3) {
                newItem = new Item(ItemType.COKE, 12);
            }else if(i >=3 && i<5){
                newItem = new Item(ItemType.PEPSI, 9);
            }else if(i >=5 && i<7){
                newItem = new Item(ItemType.JUICE, 13);
            }else if(i >=7 && i<10){
                newItem = new Item(ItemType.SODA, 7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){

        ItemShelf[] slots = vendingMachine.getInventory().getItemShelves();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].getSoldOut());
        }
    }
}
