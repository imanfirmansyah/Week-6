class Searchengine {

    public void Browsing() {
        System.out.println("Searchengine bisa Browsing");
    }
}

class Google extends Searchengine {

    @Override
    public void Browsing() {
        System.out.println("Google bisa Browsing");
        super.Browsing();
    }
}

class Bing extends Searchengine {

    @Override
    public void Browsing() {
        System.out.println("Bing bisa Browsing");
        super.Browsing();
    }
}


class Yahoo extends Searchengine {

    @Override
    public void Browsing() {
        System.out.println("Yahoo bisa Browsing");
        super.Browsing();
    }
}

public class MainGoogle {
    public static void main(String args[]) {
        Searchengine Google = new Searchengine();
        Google GoogleSearch = new Google();
		Searchengine Bing   = new Searchengine();
		Bing BingSearch		= new Bing ();
		Searchengine Yahoo 	= new Searchengine();
		Yahoo YahooSearch	= new Yahoo();
        Google.Browsing();
        GoogleSearch.Browsing();
		Bing.Browsing();
		BingSearch.Browsing();
		Yahoo.Browsing();
		YahooSearch.Browsing();
		YahooSearch.Browsing();
    }
}
