package vendingmachine.state.stateImpl;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;
import vendingmachine.state.IState;

import java.util.List;

public class SelectionState implements IState {
    public SelectionState() {
        System.out.println("State is Selection");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Choose product or press cancel");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Choose product or press cancel");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("Choose product or press cancel");
    }

    @Override
    public List<Coin> cancelOrRefund(VendingMachine machine) throws Exception {
        System.out.println("Refunding the money, please collect from the cash tray");
        machine.setMachineState(new IdleState());
        return machine.getCoins();
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        Item item = machine.getInventory().getItem(code);
        int amountPaid = 0;
        for (Coin coin: machine.getCoins()) {
            amountPaid += coin.value;
        }
        if (amountPaid < item.getPrice()) {
            System.out.println("Insufficient amount please add correct amount for thr selected product");
            cancelOrRefund(machine);
            throw new Exception("Insufficient amount");
        }
        else {
            if(amountPaid > item.getPrice())
                getChange(amountPaid - item.getPrice());
            machine.setMachineState(new DispenseState(machine, code));
        }

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("Choose product or press cancel");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returning change " + returnChangeMoney + ", please collect from thr cash tray.");
        return returnChangeMoney;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Choose product or press cancel");
    }
}
