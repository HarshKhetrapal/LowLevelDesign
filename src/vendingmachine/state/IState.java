package vendingmachine.state;

import vendingmachine.Coin;
import vendingmachine.Item;
import vendingmachine.VendingMachine;

import java.util.List;

public interface IState {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception;
    public List<Coin> cancelOrRefund(VendingMachine machine) throws Exception;
    public void chooseProduct(VendingMachine machine, int code) throws Exception;
    public Item dispenseProduct(VendingMachine machine, int code) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
