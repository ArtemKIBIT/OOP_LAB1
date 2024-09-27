package lab1;

public class Visit {
    private String service;
    private double price;
    private Date visitDate;

    public Visit(String service, double price, Date visitDate) {
        this.service = service;
        this.price = price;
        this.visitDate = visitDate;
    }

    public String getService() {
        return service;
    }

    public double getPrice() {
        return price;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void displayVisitInfo() {
        System.out.print("Visit Service: " + service + ", Price: " + price + ", Date: ");
        visitDate.displayDate();
    }
}