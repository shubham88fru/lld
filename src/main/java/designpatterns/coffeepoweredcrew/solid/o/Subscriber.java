package designpatterns.coffeepoweredcrew.solid.o;

//base class - closed for modification.
public abstract class Subscriber {
    protected Long subscriberId;

    private String address;

    private Long phoneNumber;

    protected int baseRate;

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //open for extension
    public abstract double calculateBill();
}
