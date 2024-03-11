## Requirements
1. Customer can search flights by feeding src, dest and date.
2. Customer can see pricelist of all airlines, timing and select one flight.
3. System should do payment process and send booking notification.

# Parts of the System
1. Flight Management
   1. Flight Info
   2. Seat Info
   3. Airport
   4. Airline info
2. Flight Reservation
   1. Customer Info
   2. Seats..
3. Payments
4. Notifications

# Entities
   1. Flight Management
      1. Flight
      2. Airport
      3. FlightSchedule
      4. FlightStatus
      5. Address
      6. Seat
      7. FlightSchedule
      8. FlightSeat
      9. AirLine

   2. Flight reservation
      1. Customer
      2. FlightReservation
      3. ReservationStatus

   3. Notification service
      1. Notification
      2. EmailNotification
      3. SMSNotification

   4. Payment gateway
      1. PayPal
      2. MobileTransactions