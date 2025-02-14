public class ZombiePlantSim {
    public static class ZombiePlant {
        private int potency;
        private int treatmentsNeeded;
        public ZombiePlant(int potency, int treatmentsNeeded) {
            this.potency = potency;
            this.treatmentsNeeded = treatmentsNeeded;
        }
        public int getPotency() {
            return potency;
        }
        public int treatmentsNeeded() {
            return treatmentsNeeded;
        }
        public boolean isDangerous() {
            return treatmentsNeeded > 0;
        }
        public void treat(int treatment) {
            if (treatment > 0 {
                if (treatment <= potency) {
                    if (isDangerous()) {
                        treatmentsNeeded--;
                    }
                } else {
                    treatmentsNeeded++;
                }
            }
        }
    }
}
