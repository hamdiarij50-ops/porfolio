public class AssietteRonde extends Assiette {
        private double rayon;

        public AssietteRonde(int anneeFabrication, double rayon) {
            super(anneeFabrication);
            this.rayon = rayon;
        }

        public double getRayon() {
            return rayon;
        }

        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        @Override
        public double calculerSurface() {
            return 3.14 * rayon * rayon;
        }
    }
}
