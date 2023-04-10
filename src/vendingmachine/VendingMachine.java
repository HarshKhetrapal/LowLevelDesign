package vendingmachine;

import vendingmachine.state.IState;
import vendingmachine.state.stateImpl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    IState machineState;
    Inventory inventory;
    List<Coin> coins;

    public VendingMachine() {
        this.machineState = new IdleState();
        this.inventory = new Inventory(10);
        this.coins = new ArrayList<>();
    }

    public IState getMachineState() {
        return machineState;
    }

    public void setMachineState(IState machineState) {
        this.machineState = machineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
}
