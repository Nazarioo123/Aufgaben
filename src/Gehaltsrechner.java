public class Gehaltsrechner {
    public static void main(String[] args) {

        Angestellter[] team = {
                new Sekretaerin(2500),
                new Verkaeufer(2000, 450),
                new Manager(5000, true, true, false),
                new Sekretaerin(2300),
                new Verkaeufer(1800, 300)

        };

        System.out.println("Monatlicher Gehaltsabrechnungsbericht");

        for (Angestellter mitarbeiter : team) {
            String position = mitarbeiter.getClass().getSimpleName();
            System.out.printf("%s - Monatsgehalt: %.2f€ | Jahresgehalt: %.2f€%n",
                    position, mitarbeiter.getMonatsgehalt(), mitarbeiter.getJahresgehalt());
        }
    }
}

    abstract class Angestellter {
        public abstract double getMonatsgehalt();

        public double getJahresgehalt() {
            return getMonatsgehalt() * 12;
        }
    }

    class Sekretaerin extends Angestellter {
        private double grundgehalt;

        public Sekretaerin(double grundgehalt) {
            this.grundgehalt = grundgehalt;

        }

        @Override
        public double getMonatsgehalt() {
            return grundgehalt;

        } // Продавец - оклад + проценты от продаж
    }
        class Verkaeufer extends Angestellter {
            private double grundgehalt;
            private double provision;

            public Verkaeufer(double grundgehalt, double provision) {
                this.grundgehalt = grundgehalt;
                this.provision = provision;
            }

            @Override
            public double getMonatsgehalt() {
                return grundgehalt + provision;
            }


        }

        class Manager extends Angestellter {
            private double grundgehalt;
            private boolean istGeschaeftsfuehrer;
            private boolean hatMitarbeiterVerantwortung;
            private boolean istLangjaehrig;


            // Конструктор с параметрами
            public Manager(double grundgehalt, boolean gf,
                            boolean verantwortung, boolean erfahrung) {
                this.grundgehalt = grundgehalt;
                this.istGeschaeftsfuehrer = gf;
                this.hatMitarbeiterVerantwortung = verantwortung;
                this.istLangjaehrig = erfahrung;
            }

            @Override
            public double getMonatsgehalt() {
                double gesamt = grundgehalt;

                if (istGeschaeftsfuehrer) gesamt += 1000;
                if (hatMitarbeiterVerantwortung) gesamt += 800;
                if (istLangjaehrig) gesamt += 500;

                return gesamt;
            }
        }

