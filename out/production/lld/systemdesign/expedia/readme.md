## Hotel booking system Requirements

# Entities
1. User
   1. id
   2. name
   3. mbNo
   4. emailId

2. Hotel
   1. id
   2. rooms //List<Room>
   3. address
   4. name

3. Room
   1. id
   2. hotelId //A room can't exit without a hotel.
   3. type
   4. status

4. Booking
   1. user
   2. hotel
   3. rooms //list of rooms booked by user.
   4. paymentStatus
   5. duration

user --> selects a hotel --> selects rooms in the hotel --> Booking created. 


## Similar LLD questions
- Bus booking system.
- Cab booking system.