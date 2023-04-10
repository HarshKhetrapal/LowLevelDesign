package vendingmachine.state.stateImpl;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;
import vendingmachine.state.IState;

import java.util.List;

public class HasMoneyState implements IState {
    public HasMoneyState() {
        System.out.println("State is HasMoney");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw  new Exception("Insert coin or press cancel");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Coin accepted");
        machine.getCoins().add(coin);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        machine.setMachineState(new SelectionState());
    }

    @Override
    public List<Coin> cancelOrRefund(VendingMachine machine) throws Exception {
        System.out.println("Refunding the money, please collect from the cash tray");
        machine.setMachineState(new IdleState());
        return machine.getCoins();
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("Insert coin");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("Insert coin");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Insert coin");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Insert coin");
    }
}
