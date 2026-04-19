abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved = false;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title);
    }

    public abstract void processLoan();
}

class TextBook extends LibraryItem {

    public TextBook(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    public void processLoan() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued for 14 days.");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}

class ResearchPaper extends LibraryItem {

    public ResearchPaper(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    public void processLoan() {
        System.out.println("Generating secure PDF download link...");
    }
}

public class Main {
    public static void main(String[] args) {

        TextBook tb = new TextBook("B101", "Java Core");
        tb.processLoan();
        tb.processLoan(); // second time

        ResearchPaper rp = new ResearchPaper("R99", "AI Ethics");
        rp.processLoan();
    }
}