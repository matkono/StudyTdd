package study_tdd;

public class Invoice {

    public Invoice(String clientName, String date, int value) {
        this.ClientName = clientName;
        this.Date = date;
        this.Value = value;
    }

    private final String ClientName;
    private final String Date;
    private final int Value;

    public String getClientName() {
        return ClientName;
    }

    public String getDate() {
        return Date;
    }

    public int getValue() {
        return Value;
    }
}
