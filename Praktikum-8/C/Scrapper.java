import java.util.ArrayList;

class Scrapper {
    private ArrayList<String> urlList;
    private int counter;

    public Scrapper() {
        urlList = new ArrayList<String>();
        counter = 0;
    }

    public void addUrl(String url) {
        urlList.add(url);
    }

    public int scrapLowestPrice() {
        // Kode berikut masih melakukan scrap ke banyak website
        // secara sekuensial. Agar lebih cepat, ubahlah kode di bawah ini
        // menjadi paralel menggunakan wait dan notify, dengan membuat
        // instance ScrapperThread
        // Hint: baca materi praktikum
        int lowest = Integer.MAX_VALUE;
        int n = urlList.size();
        for (String url : urlList) {
            Website website = new Website(url);
            int currInt = website.getPrice();
            lowest = (lowest > currInt) ? currInt : lowest;
        }
        return lowest;
    }
}
