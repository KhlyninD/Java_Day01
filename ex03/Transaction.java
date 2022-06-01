import java.util.UUID;

public class Transaction {

    private UUID identifier;

    private User recipient;

    private User sender;

    private EnumCategory transferCategory;

    private int transferAmount;

    public Transaction(User sender, User recipient, int transferAmount) {

        this.sender = sender;

        this.recipient = recipient;

        this.transferAmount = transferAmount;

        identifier = UUID.randomUUID();

        if (transferAmount < 0) {
            setTransferCategory(EnumCategory.CREDIT);
        } else {
            setTransferCategory(EnumCategory.DEBIT);
        }

        sender.getTransactions().addTransaction(this);
        
        if (transferCategory == EnumCategory.CREDIT && (sender.getBalance() + transferAmount) >= 0 ) {
            sender.setBalance(sender.getBalance() + transferAmount);
            new Transaction(recipient, sender, transferAmount * -1);
        } else if (transferCategory == EnumCategory.DEBIT) {
            sender.setBalance(sender.getBalance() + transferAmount);
        }

    }

    private enum EnumCategory {
        DEBIT,
        CREDIT
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public EnumCategory getTransferCategory() {
        return transferCategory;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setTransferCategory(EnumCategory transferCategory) {
        this.transferCategory = transferCategory;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }


}
