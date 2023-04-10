package vendingmachine.state.stateImpl;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;
import vendingmachine.state.IState;

import java.util.List;

public class DispenseState implements IState {

    public DispenseState(VendingMachine machine, int code) throws Exception {
        System.out.println("State is Dispense");
        dispenseProduct(machine, code);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }

    @Override
    public List<Coin> cancelOrRefund(VendingMachine machine) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        System.out.println("Product dispensed");
        Item item = machine.getInventory().getItem(code);
        machine.getInventory().updateSoldOut(code);
        machine.setMachineState(new IdleState());
        return item;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw  new Exception("can only dispense in dispense state");
    }
}
