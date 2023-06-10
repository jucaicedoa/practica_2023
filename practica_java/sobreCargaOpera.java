public class sobreCargaOpera {
    
        public int suma(int a, int b) {
            return a+b;
        }

        public float  suma(float a, float b) {
            return a+b;
        }

        public double suma(double a, double b) {
            return a+b;
        }

         //Sumar difente cantidad de números
          public int suma(int... numeros) {
            int suma=0;
            for (int numero : numeros) {
                suma += numero;
            }
            return suma;
        }


    }
