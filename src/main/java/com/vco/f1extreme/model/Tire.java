package main.java.com.vco.f1extreme.model;

public class Tire {
    private String soft{
        //Proveen mayor agarre, mayores velocidades, pero menor
        //durabilidad y mayor consumo. Son los neumáticos más rápidos
        //pero también los que se desgastan más rápidamente, lo que
        //probablemente obligue a realizar paradas técnicas para
        //reemplazarlos.
        public String getSoft() {
            return soft;
        }

        public void setSoft(String soft) {
            this.soft = soft;
        }
    }
    private String hard{
        //Ofrecen la mayor durabilidad, pero con menor agarre y, por ende,
        //es más difícil la maniobrabilidad a altas velocidades (es decir, el
        //auto no podrá alcanzar la máxima velocidad)
        public String getHard() {
            return hard;
        }

        public void setHard(String hard) {
            this.hard = hard;
        }
    }
    private String medium{
        //Son una combinación entre los neumáticos Soft y Hard
        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }
    private String wet{
        //Son los que mejor performance ofrecen en condiciones de lluvia.
        //Ofrecen gran durabilidad pero sólo si la pista está mojada, en pista
        //seca se rompen rápidamente.
        public String getWet() {
            return wet;
        }

        public void setWet(String wet) {
            this.wet = wet;
        }
    }
}
