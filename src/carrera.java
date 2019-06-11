
import java.util.Random;

public class carrera {

    static caballo[] losCaballos;
    static Random rnd;
    static int[] vel;

    static public void reiniciar() {
        int[] vel = {240, 250, 255, 245, 250, 255, 245, 250, 255, 245};
        int[] ava = {13, 15, 16, 14, 15, 16, 14, 15, 16, 14};
        //Vel
        losCaballos[0].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[1].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[2].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[3].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[4].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[5].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[6].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[7].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[8].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[9].setVelocidad(vel[rnd.nextInt(4)]);
        //avances
        losCaballos[0].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[1].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[2].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[3].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[4].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[5].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[6].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[7].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[8].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[9].setAvance(ava[rnd.nextInt(4)]);

    }//

    static public void registrarCaballos() {
        rnd = new Random();

        int[] vel = {240, 250, 255, 245};
        int[] ava = {13, 15, 16, 14};
        losCaballos = new caballo[4];

        losCaballos[0] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[1] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[2] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[3] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[4] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[5] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[6] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[7] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[8] = new caballo(0, 0, 0, 0, 0, "-");
        losCaballos[9] = new caballo(0, 0, 0, 0, 0, "-");
        //ingreso de datos
        //codigos
        losCaballos[0].setCodigo(101);
        losCaballos[1].setCodigo(102);
        losCaballos[2].setCodigo(103);
        losCaballos[3].setCodigo(104);
        losCaballos[4].setCodigo(105);
        losCaballos[5].setCodigo(106);
        losCaballos[6].setCodigo(107);
        losCaballos[7].setCodigo(108);
        losCaballos[8].setCodigo(109);
        losCaballos[9].setCodigo(110);
//nombres
        losCaballos[0].setNombre("1");
        losCaballos[1].setNombre("2");
        losCaballos[2].setNombre("3");
        losCaballos[3].setNombre("4");
        losCaballos[4].setNombre("5");
        losCaballos[5].setNombre("6");
        losCaballos[6].setNombre("7");
        losCaballos[7].setNombre("8");
        losCaballos[8].setNombre("9");
        losCaballos[9].setNombre("10");
        //CoordX
        losCaballos[0].setCoorX(frmInicio.lblCaballo1.getLocation().x);
        losCaballos[1].setCoorX(frmInicio.lblCaballo2.getLocation().x);
        losCaballos[2].setCoorX(frmInicio.lblCaballo3.getLocation().x);
        losCaballos[3].setCoorX(frmInicio.lblCaballo4.getLocation().x);
        losCaballos[4].setCoorX(frmInicio.lblCaballo5.getLocation().x);
        losCaballos[5].setCoorX(frmInicio.lblCaballo6.getLocation().x);
        losCaballos[6].setCoorX(frmInicio.lblCaballo7.getLocation().x);
        losCaballos[7].setCoorX(frmInicio.lblCaballo8.getLocation().x);
        losCaballos[8].setCoorX(frmInicio.lblCaballo9.getLocation().x);
        losCaballos[9].setCoorX(frmInicio.lblCaballo10.getLocation().x);
        //CoordX
        losCaballos[0].setCoorY(frmInicio.lblCaballo1.getLocation().y);
        losCaballos[1].setCoorY(frmInicio.lblCaballo2.getLocation().y);
        losCaballos[2].setCoorY(frmInicio.lblCaballo3.getLocation().y);
        losCaballos[3].setCoorY(frmInicio.lblCaballo4.getLocation().y);
        losCaballos[4].setCoorY(frmInicio.lblCaballo5.getLocation().y);
        losCaballos[5].setCoorY(frmInicio.lblCaballo6.getLocation().y);
        losCaballos[6].setCoorY(frmInicio.lblCaballo7.getLocation().y);
        losCaballos[7].setCoorY(frmInicio.lblCaballo8.getLocation().y);
        losCaballos[8].setCoorY(frmInicio.lblCaballo9.getLocation().y);
        losCaballos[9].setCoorY(frmInicio.lblCaballo10.getLocation().y);
        //Vel
        losCaballos[0].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[1].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[2].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[3].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[4].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[5].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[6].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[7].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[8].setVelocidad(vel[rnd.nextInt(4)]);
        losCaballos[9].setVelocidad(vel[rnd.nextInt(4)]);
        //avances
        losCaballos[0].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[1].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[2].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[3].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[4].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[5].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[6].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[7].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[8].setAvance(ava[rnd.nextInt(4)]);
        losCaballos[9].setAvance(ava[rnd.nextInt(4)]);
        //
        losCaballos[0].setTiempo(0);
        losCaballos[1].setTiempo(0);
        losCaballos[2].setTiempo(0);
        losCaballos[3].setTiempo(0);
        losCaballos[4].setTiempo(0);
        losCaballos[5].setTiempo(0);
        losCaballos[6].setTiempo(0);
        losCaballos[7].setTiempo(0);
        losCaballos[8].setTiempo(0);
        losCaballos[9].setTiempo(0);

        //
    }//

    static void iniciar() {

        hiloUno h1 = new hiloUno(losCaballos[0].getNombre());
        h1.start();

        hiloUno h2 = new hiloUno(losCaballos[1].getNombre());
        h2.start();

        hiloUno h3 = new hiloUno(losCaballos[2].getNombre());
        h3.start();

        hiloUno h4 = new hiloUno(losCaballos[3].getNombre());
        h4.start();
        
        hiloUno h5 = new hiloUno(losCaballos[4].getNombre());
        h4.start();
        
        hiloUno h6 = new hiloUno(losCaballos[5].getNombre());
        h4.start();
        
        hiloUno h7 = new hiloUno(losCaballos[6].getNombre());
        h4.start();
        
        hiloUno h8 = new hiloUno(losCaballos[7].getNombre());
        h4.start();
        
        hiloUno h9 = new hiloUno(losCaballos[8].getNombre());
        h4.start();
        
        hiloUno h10 = new hiloUno(losCaballos[9].getNombre());
        h4.start();
    }//iniciar           

}//class
