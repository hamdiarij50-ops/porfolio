public class AssietteCarree extends Assiette {
        private double cote;

        public AssietteCarree(int anneeFabrication, double cote) {
            super(anneeFabrication);
            this.cote = cote;
        }

        public double getCote() {
            return cote;
        }

        public void setCote(double cote) {
            this.cote = cote;
        }

        @Override
        public double calculerSurface() {
            return cote * cote;
        }
    }
}
