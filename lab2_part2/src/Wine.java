public class Wine {
    private String name;
    private String trademark;
    private int bottlingDate;
    private String classification;

    Wine(String name, String trademark, int bottlingDate, String classification) {
        this.name = name;
        this.trademark = trademark;
        this.bottlingDate = bottlingDate;
        this.classification = classification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public void setBottlingDate(int bottlingDate) {
        this.bottlingDate = bottlingDate;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public String getTrademark() {
        return trademark;
    }

    public int getBottlingDate() {
        return bottlingDate;
    }

    public String getClassification() {
        return classification;
    }

    public void countWineAging (int currentDate) {
        int result = currentDate - getBottlingDate();
        System.out.print("Wine aging - " + result);
    }
}
