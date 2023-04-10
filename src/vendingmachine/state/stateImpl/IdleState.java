package vendingmachine.state.stateImpl;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;
import vendingmachine.state.IState;

import java.util.List;

public class IdleState implements IState {
    public IdleState() {
        System.out.println("State is Idle");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("click on insert coin button");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("click on insert coin button");
    }

    @Override
    public List<Coin> cancelOrRefund(VendingMachine machine) throws Exception {
        throw new Exception("click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("click on insert coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("click on insert coin button");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("click on insert coin button");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
