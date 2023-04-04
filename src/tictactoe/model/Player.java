package tictactoe.model;

public class Player {
    private int id;
    private String name;
    private PlayingSymbol symbol;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PlayingSymbol getSymbol() {
        return symbol;
    }

    public Player(int id, String name, PlayingSymbol symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }
}
