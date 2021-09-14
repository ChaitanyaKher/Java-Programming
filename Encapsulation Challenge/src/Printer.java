public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int level,int pages,boolean duplex){
        if (level>=0 && level <=100) {
            this.tonerLevel = level;
        } else System.out.println("Invalid toner level range");
        this.pagesPrinted = pages;
        this.duplex = duplex;
    }

    public void addInk(int tonerAmount){
        if((this.tonerLevel+= tonerAmount)<=100){
            this.tonerLevel+= tonerAmount;
            System.out.println("Successfully added " + tonerAmount + " ink to the toner, new level is " + this.tonerLevel);
            if (this.tonerLevel == 100){
                System.out.println("Toner is full :D");
            }
        } else System.out.println("Ink limit exceeded");

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

    public String isDuplex() {
        return this.duplex?"Printer is duplex":"Printer is not duplex";
    }
}