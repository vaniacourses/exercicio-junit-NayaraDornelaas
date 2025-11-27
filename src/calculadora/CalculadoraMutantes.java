package calculadora;


public class CalculadoraMutantes {


    // ----------------------------------------------
    public static class Original {
        public int soma(int a, int b) { return a + b; }
        public int divisao(int a, int b) { return a / b; }
        public int subtracao(int a, int b) { return a - b; }
        public int multiplicacao(int a, int b) { return a * b; }

        public int somatoria(int n) {
            int total = 0;
            for(int i = 1; i <= n; i++) total += i;
            return total;
        }

        public int compara(int a, int b) {
            if (a == b) return 0;
            if (a > b) return 1;
            return -1;
        }
    }

    // ----------------------------------------------
    public static class Mutante1 {
        public int soma(int a, int b) { return a - b; }
        public int divisao(int a, int b) { return a / b; }
        public int subtracao(int a, int b) { return a - b; }
        public int multiplicacao(int a, int b) { return a * b; }

        public int somatoria(int n) {
            int total = 0;
            for(int i = 1; i <= n; i++) total += i;
            return total;
        }

        public int compara(int a, int b) {
            if (a == b) return 0;
            if (a > b) return 1;
            return -1;
        }
    }

    // ----------------------------------------------
    public static class Mutante2 {
        public int soma(int a, int b) { return a + b; }
        public int divisao(int a, int b) { return a * b; }
        public int subtracao(int a, int b) { return a - b; }
        public int multiplicacao(int a, int b) { return a * b; }

        public int somatoria(int n) {
            int total = 0;
            for(int i = 1; i <= n; i++) total += i;
            return total;
        }

        public int compara(int a, int b) {
            if (a == b) return 0;
            if (a > b) return 1;
            return -1;
        }
    }

   
    public static class Mutante3 {
        public int soma(int a, int b) { return a + b; }
        public int divisao(int a, int b) { return a / b; }
        public int subtracao(int a, int b) { return a + b; }
        public int multiplicacao(int a, int b) { return a * b; }

        public int somatoria(int n) {
            int total = 0;
            for(int i = 1; i <= n; i++) total += i;
            return total;
        }

        public int compara(int a, int b) {
            if (a == b) return 0;
            if (a > b) return 1;
            return -1;
        }
    }

    // ----------------------------------------------
    public static class Mutante4 {
        public int soma(int a, int b) { return a + b; }
        public int divisao(int a, int b) { return a / b; }
        public int subtracao(int a, int b) { return a - b; }
        public int multiplicacao(int a, int b) { return a / b; }

        public int somatoria(int n) {
            int total = 0;
            for(int i = 1; i <= n; i++) total += i;
            return total;
        }

        public int compara(int a, int b) {
            if (a == b) return 0;
            if (a > b) return 1;
            return -1;
        }
    }


    public static class Mutante5 {
        public int soma(int a, int b) { return a + b; }
        public int divisao(int a, int b) { return a / b; }
        public int subtracao(int a, int b) { return a - b; }
        public int multiplicacao(int a, int b) { return a * b; }
        public int somatoria(int n) { return 0; }

        public int compara(int a, int b) {
            if (a == b) return 0;
            if (a > b) return 1;
            return -1;
        }
    }


    // ----------------------------------------------
    public static class Mutante6 {
        public int soma(int a, int b) { return a + b; }
        public int divisao(int a, int b) { return a / b; }
        public int subtracao(int a, int b) { return a - b; }
        public int multiplicacao(int a, int b) { return a * b; }

        public int somatoria(int n) {
            int total = 0;
            for(int i = 1; i <= n; i++) total += i;
            return total;
        }

        public int compara(int a, int b) {
            if (a != b) return 0;
            if (a < b) return 1;
            return -1;
        }
    }
}
