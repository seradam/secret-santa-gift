import java.util.Random;
import java.util.Scanner;

class Event {

    static Balint balint = new Balint();

    static void arriveToCodecool() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Egy átlagos hétfő reggelen megérkezel a codecoolba. Mit teszel?\n" +
                "1. A helyedre mész és lecuccolsz.\n2. A konyhába mész és iszol egy teát.");
        int n = reader.nextInt();
        if (n == 1) {
            balint.isLaptop = false;
            System.out.println("Leültél a helyedre és csekkoltad a facebookot. " +
                    "Semmi érdekeset nem láttál Patrik szokásos hülyeségein kívül\n" +
                    "http://www.borsonline.hu/celeb/nem-telhet-el-a-hetvege-pikans-pucer-palvin-foto-nelkul-18/123569");
        }
        else if (n == 2) {
            System.out.println("A konyhában teázás közben büszkén meséled a többieknek, hogy ezúttal végre " +
                    "leadtad a házit. \nAz emberek örvendeznek vala https://www.youtube.com/watch?v=UWLIgjB9gGw");
        }
        else {
            balint.canplay = false;
        }
    }

    static void preparation() {
        Scanner reader = new Scanner(System.in);
        System.out.println("\nVáratlanul Creepy Guy lép oda hozzád, és közli, hogy névsorolvasás után várnak a " +
                "tárgyalóban.\nEkkor ugrik be, hogy hiába csináltad meg, ráadásul pusholtad a megoldásodat, " +
                "Canvasba is fel kellett volna tölteni azt a házit :(\nMit teszel? \n" +
                "1. Kíváncsian várod, vajon kirúgnak-e.\n2. Elbújsz az új irodarészben, hátha nem találnak rád.");
        int n = reader.nextInt();
        if (n == 1) {
            balint.canplay = false;
            System.out.println("Lezajlik a névsorolvasás. Közben felfigyelsz rá, hogy munkások egy bazinagy dobozt " +
                    "cipelnek ki az ajtón, de ez most nem izgat túlságosan.\nCreepy Guy és a mentorok bekísérnek a " +
                    "tárgyalóba, ahol közlik veled, hogy a sokadik figyelmeztetés ellenére már megint nem adtad le a házidat." +
                    "\nKI VAGY RÚGVA!\nBúcsúzóul néhány jótanács: https://www.youtube.com/watch?v=lUs01oxpjQw");
        }
        else if (n == 2) {
            emptyRoom();
        }
        else {
            balint.canplay = false;
        }
    }

    private static void emptyRoom(){
        Scanner reader = new Scanner(System.in);
        if (balint.isLaptop){
            System.out.println("\nAz iroda hátsó részében egy indokolatlanul bazinagy dobozt találsz, és nem bírod " +
                    "megállni, hogy ne bontsd ki.\nA belsejében egy gépet találsz rajta egy nagy piros gombbal. " +
                    "Muszáj megnyomnod. Ekkor hirtelen egy nagy kavargó kék örvény keletkezik, ami beszippant téged.\n" +
                    "https://www.youtube.com/watch?v=7zdRrf8OdSA \n" +
                    "Durván szédülsz, de pár pillanat múlva magadhoz térsz. Észreveszed, hogy odakint hirtelen sötét " +
                    "lett. Az örvény még mindig ott kavarog melletted. Mit teszel?\n" +
                    "1. Sok volt ez az egész, inkább visszamész beszélni a mentorokkal.\n" +
                    "2. Úgy érzed, ezt muszáj még egyszer kipróbálnod, és visszaugrasz az örvénybe.\n" +
                    "3. Gyorsan feltöltöd a megoldást, bízol benne, hogy megkegyelmeznek és elindulsz a tárgyalóba.\n" +
                    "4. Gyorsan feltöltöd a megoldást, bízol benne, hogy megkegyelmeznek, de azért félsz, hogy " +
                    "kirúgnak, ezért muszáj ezt az örvényt még egyszer kipróbálni, mielőtt vissza indulnál.");
            int n = reader.nextInt();
            if (n == 1 || n == 3) {
                balint.canplay = false;
                System.out.println("Miközben visszafele sétálsz, szembejön egy srác, aki pont úgy néz ki mint te," +
                        " ráadásul a tegnapi ruhád van rajta.\nEkkor váratlanul összeomlott az univerzum.\n" +
                        "Na ezt jól megcsináltad bazmeg!");
            }
            else if (n == 2) {
                System.out.println("Az örvény szépen lassan eltűnik. Kint újra világos van, " +
                        "te pedig rájössz, hogy nem bújkálhatsz itt örökké, és elindulsz a tárgyalóba.");
            }
            else if (n == 4) {
                balint.isassignment = true;
                System.out.println("Az örvény szépen lassan eltűnik. Kint újra világos van, " +
                        "te pedig reménykedve indulsz meg a tárgyaló irányába.");
            }
            else {
                balint.canplay = false;
            }
        }
        else {
            System.out.println("\nAz iroda hátsó részében egy indokolatlanul bazinagy dobozt találsz, és nem bírod " +
                    "megállni, hogy ne bontsd ki.\nA belsejében egy gépet találsz rajta egy nagy piros gombbal. " +
                    "Muszáj megnyomnod. Ekkor hirtelen egy nagy kavargó kék örvény keletkezik, ami beszippant téged.\n" +
                    "https://www.youtube.com/watch?v=7zdRrf8OdSA \n" +
                    "Durván szédülsz, de pár pillanat múlva magadhoz térsz. Észreveszed, hogy odakint hirtelen sötét " +
                    "lett. Az örvény még mindig ott kavarog melletted. Mit teszel?\n" +
                    "1. Sok volt ez az egész, inkább visszamész beszélni a mentorokkal.\n" +
                    "2. Úgy érzed, ezt muszáj még egyszer kipróbálnod, és visszaugrasz az örvénybe.");
            int n = reader.nextInt();
            if (n == 1) {
                System.out.println("Miközben visszafele sétálsz, szembejön egy srác, aki pont úgy néz ki mint te," +
                        " ráadásul a tegnapi ruhád van rajta.\nEkkor váratlanul összeomlott az univerzum.\n" +
                        "Na ezt jól megcsináltad bazmeg!");
            }
            else if (n == 2) {
                System.out.println("Az örvény szépen lassan eltűnik. Kint újra világos van, " +
                        "te pedig rájössz, hogy nem bújkálhatsz itt örökké, és elindulsz a tárgyalóba.");
            }
            else {
                balint.canplay = false;
            }
        }
    }

    static void meetingRoom(){
        System.out.println("\nBelépsz a tárgyalóba, ahol Creepy Guyt egyedül találod.");
        if (balint.isassignment) {
            balint.isLaptop = false;
            System.out.println("Furcsán néz rád, megkérdezi, mit szeretnél. Hiába mondod, hogy de hát ő hívott, " +
                    "fogalma sincs, miről beszélsz.\nAz esetet nem tudod mire vélni, de inkább le is szarod, és " +
                    "fejben már a délutáni csocsóbajnokságra készülsz. Érzed, hogy ez a délelőtt még hosszú lesz.");
        }
        else {
            balint.canplay = false;
            System.out.println("Megkér, hogy foglalj helyet, és behívja a mentorokat.\nMindenki megérkezik, majd " +
                    "közlik veled, hogy a sokadik figyelmeztetés ellenére már megint nem adtad le a házidat.\n" +
                    "KI VAGY RÚGVA!\nBúcsúzóul néhány jótanács: https://www.youtube.com/watch?v=lUs01oxpjQw");
        }
    }

    static void lunchBreak() {
        Scanner reader = new Scanner(System.in);
        System.out.println("\nEz a délelőtt hosszú volt, de végre eljött az ebédszünet. Dani kérdezi, hogy " +
                "jössz-e csocsózni Mikiék ellen.  Mit válaszolsz?\n" +
                "1. Persze, hogy megyek, sosem hagynám ki, hogy Mikit megalázzam!\n" +
                "2. Kösz, de most nem, nagyon éhes vagyok, majd utána csocsózunk.");
        int n = reader.nextInt();
        if (n == 1) {
            play();
            if (balint.canplay) {
                lunch();
            }
        }
        else if (n == 2) {
            lunch();
            if (balint.canplay) {
                balint.canplay = false;
                System.out.println("\nAz ebédből visszaérve azt tapasztalod, hogy a csocsóasztal több darabban van, " +
                        "Mikit pedig fehérruhás emberek kényszerzubbonyban kísérik ki az ajtón.\nKérdezned sem kell, " +
                        "kitalálod, mi történt. Sajnos így lőttek a bajnokságnak is :(");
            }
        }
        else {
            balint.canplay = false;
        }
    }

    private static void play(){
        Scanner reader = new Scanner(System.in);
        System.out.println("\nNagyon szoros a meccs, 5-5 az állás, kezedben a meccslabda. Mit teszel?\n" +
                "1. Egyenest kapura kúrod, lesz, ami lesz.\n2. Falra pattintós lövéssel próbálkozol.");
        int n = reader.nextInt();
        if (n == 1) {
            System.out.println("Ez nem volt jó döntés. Miki megszerezte a labdát, és belőtte a győztes gólt " +
                    "és válogatott sértések közepette röhög a pofádba.\nNem baj. Majd délután törlesztesz ezért.");
        }
        else if (n == 2) {
            balint.canplay = false;
            System.out.println("GÓÓÓÓL! Megnyertétek a meccset.\nBálint bazmeg, ezért egy jobb kocsmában rád " +
                    "borítanák az asztalt. - mondta Miki, majd rád borította az asztalt.\nNéma csend lett, " +
                    "mindenki megleppetten néz, kivéve Mikit, aki csak vigyorog rád.\n" +
                    "Hát ebből így nem lesz délután bajnokság :(");
        }
        else {
            balint.canplay = false;
        }

    }

    private static void lunch(){
        Scanner reader = new Scanner(System.in);
        System.out.println("\nMivel otthon felejtetted a kajádat, el kell menned venni, de nem akarsz messzire menni, " +
                "hogy még legyen időd csocsózni is. Hol eszel?\n" +
                "1. A gyrososnál.\n2. A csirkésnél.");
        int n = reader.nextInt();
        if (n == 1) {
            balint.canplay = false;
            System.out.println("Sajnos a gyros sugárfertőzött zombipatkányok húsából készült. Ételmérgezéssel " +
                    "kórházba vittek. Az orvos azt mondja, kizárt, hogy délután csocsózni fogsz :(");
        }
        else if (n == 2) {
            System.out.println("Jót ettél a csirkésnél, de azért furcsaságokat is láttál " +
                    "https://www.youtube.com/watch?v=aOjfVkeOUG0 \nDe ez mindegy is. Fejben már ott vagy a " +
                    "csocsóbajnokságon. Délután már csak nem jön közbe semmi.");
        }
        else {
            balint.canplay = false;
        }

    }

    static void afternon(){
        System.out.println("\nDélután már tényleg nem történt semmi érdekes.\nElérted a célodat, elindulhatsz " +
                "Danival a bajnokságon.\nA sorsolás úgy hozta, hogy Patrik és Ádám ellen játszotok az első" +
                "meccsen a továbbjutásért.\nAz eredmény végig nagyon szoros volt. 5-5-ös állásnál aranygól " +
                "következik. A végkifejletért nyisd megg a linket:\nhttps://www.youtube.com/watch?v=L1QvtFmI8_U");
    }

    static void randomDestroy(){
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;
        if (n >= 93) {
            balint.canplay = false;
            System.out.println("\nVáratlanul megjelenik régen látott barátod András, és közli, hogy egy " +
                    "csitrilliárdot nyert tippmixen, és megvette a codecoolt.\nElrendeli, hogy nem lesz itt " +
                    "semmiféle bajnokság, ugyanis egész nap ő fog játszani :D");
        }
        else if (n <= 93 && n >= 85) {
            balint.canplay = false;
            System.out.println("\nBecsapódott egy meteor az irodaházba. Hát így nem lesz bajnokság :P");
        }
    }
}
