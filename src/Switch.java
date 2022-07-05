public class Switch {

    public static void main(String[] args) {


        // para el Switch, deberás crear la variable estacion, y distintos case para las
        // cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje
        //por consola informando de la estación en la que está. También habrá que poner un default para cuando el
        //valor de la variable no sea una estación.

        var estacion = "primavera";

            switch (estacion){
                case "verano":
                   System.out.println("Es verano");
                    break;
                case "otoño":
                    System.out.println("Es otoño");
                    break;
                case "primavera":
                    System.out.println("Es primavera");
                    break;
                case "invierno":
                    System.out.println("Es invierno");
                    break;
                default: System.out.println("No es una estación");
            }
        }

    }