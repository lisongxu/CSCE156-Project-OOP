package unl.soc;

public class Account implements ContentFormatter{
    private final String userName;

    public String getUsername() {
        return null;
    }

    @Override
    public String getFormattedContent() {
        return String.format("|  Current user : %-23s|\n", userName);
    }
}
