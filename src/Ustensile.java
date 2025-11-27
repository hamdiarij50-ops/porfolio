public abstract class Ustensile {
        private int anneeFabrication;

        public Ustensile(int anneeFabrication) {
            this.anneeFabrication = anneeFabrication;
        }

        public int getAnneeFabrication() {
            return anneeFabrication;
        }

        public void setAnneeFabrication(int anneeFabrication) {
            this.anneeFabrication = anneeFabrication;
        }

        public double calculerValeur() {
            int age = 2024 - anneeFabrication;

            if (this instanceof Cuillere || this instanceof AssietteRonde) {
                if (age < 50) return 0;
                return age - 50;
            }

            if (this instanceof AssietteCarree) {
                if (age < 50) return 0;
                return 5 * (age - 50);
            }

            return 0;
        }
    }
}
