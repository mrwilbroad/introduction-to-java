package FilesCreater.enums;

public enum Coding {
    ADDITION {
        @Override
        public double calculate(double a, double b) {
            return a+b;
        }
    },

    MULTIPLICATION{
        @Override
        public double calculate(double a, double b) {
            return a*b;
        }
    },


    SUBTRACTION{
        @Override
        public double calculate(double a, double b) {
            return a-b;
        }
    },

    DIVISION{
        @Override
        public double calculate(double a, double b) throws  ArithmeticException {
            if(b == 0)
                throw new ArithmeticException("Cannot divide by zero");
            return a/b;
        }
    };

    public  abstract  double calculate(double a , double b);
}
