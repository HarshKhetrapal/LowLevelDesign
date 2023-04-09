package moviebookingsystem;

public class Seat {
    public int id;
    public int row;
    private SeatCategory category;
    private int price;

    public Seat(int id, int row, SeatCategory category, int price) {
        this.id = id;
        this.row = row;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public SeatCategory getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
