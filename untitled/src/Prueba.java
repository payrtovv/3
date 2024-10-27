
public class Prueba {
    public static void main(String[] args) {



        Auto bmw = new Auto();
        bmw.setMarca("BMW");
        bmw.setModelo("1537");
        bmw.setColor("Negro");
        bmw.setCilindraje(1234);

        System.out.println("La marca es: " + bmw.getMarca());

        System.out.println("bmw.verdetalle = \n" + bmw.verDetalle());

        System.out.println("bmw.acelerar = " + bmw.acelerar());
        System.out.println("bmw.frenar = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTamque = " + bmw.capacidadTanque(40, 0.7f));
        System.out.println("bmw:capacidadtanque = " + bmw.capacidadTanque(40, 70) );
    }


}
