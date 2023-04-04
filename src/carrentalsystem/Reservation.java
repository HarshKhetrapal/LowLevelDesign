package carrentalsystem;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
    public int ReservationId;
    public User user;
    public Vehicle vehicle;
    LocalDate bookingDate;
    LocalDate from;
    LocalDate till;
    Location pickupLocation;

    public Reservation(int reservationId, User user, Vehicle vehicle, LocalDate bookingDate, LocalDate from, LocalDate till, Location pickupLocation, Location dropLocation, ReservationStatus reservationStatus) {
        ReservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.from = from;
        this.till = till;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.reservationStatus = reservationStatus;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public void setTill(LocalDate till) {
        this.till = till;
    }

    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public int getReservationId() {
        return ReservationId;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTill() {
        return till;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    Location dropLocation;
    ReservationStatus reservationStatus;
}
