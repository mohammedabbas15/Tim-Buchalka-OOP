public class Printer
{
    private int pages;
    private boolean duplex;
    private int tonerLevel;

    public Printer(boolean duplex, int tonerLevel) {
        this.pages = 0;
        this.duplex = duplex;
        if (tonerLevel > -1 && tonerLevel < 100)
        {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            tonerLevel = -1;
        }
    }

    public int addToner(int tonerAmount)
    {
        if(tonerAmount > 0 && tonerAmount <= 100)
        {
            if(this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else
        {
            return -1;
        }
    }

    public int print(int numberOfPages)
    {
        int pagesToPrint = numberOfPages;
        if(this.duplex)
        {
            pagesToPrint = (numberOfPages / 2) + (numberOfPages % 2);
        }
        this.pages += pagesToPrint;
        return pagesToPrint;
    }

    public int getPages()
    {
        return this.pages;
    }
}
