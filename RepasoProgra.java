import java.util.Scanner;
public class RepasoProgra{
    
    static int posicionX, posicionY;
    public static void main(String[] args){
        
        int[][] unMapa = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,1,1,0,1},
            {1,0,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,1},
            {1,0,1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,1},
            {1,0,1,0,4,0,1,0,0,0,0,1,0,0,0,1,1,0,0,0,4,0,1,0,1,1},
            {1,0,1,0,0,0,1,0,0,0,1,1,1,1,1,1,1,0,1,0,0,0,1,0,1,1},
            {1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1},
            {1,0,0,0,0,0,0,0,1,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,1},
            {1,1,0,0,1,1,0,0,0,10,10,10,10,10,10,10,10,10,0,0,0,0,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
            {1,0,1,0,0,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1,0,1},
            {1,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1},
            {1,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,0,1,1,0,0,0,0,0,0,0,1,1,1,0,1,0,0,0,0,1},
            {1,0,1,0,1,0,0,0,1,0,1,1,3,1,1,0,0,0,0,0,1,0,1,1,0,1},
            {6,0,1,0,0,14,0,0,0,0,1,3,3,3,1,0,0,0,0,0,1,0,1,1,0,8},
            {6,0,1,0,0,14,0,0,0,0,1,3,3,3,1,0,0,0,0,0,1,0,1,0,0,8},
            {6,0,1,0,0,14,1,1,0,0,1,3,3,3,1,0,0,1,1,1,1,0,1,0,0,8},
            {1,0,1,0,0,14,0,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,1},
            {1,0,1,0,0,14,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1},
            {1,0,1,1,1,14,0,1,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
            {1,0,0,0,0,14,0,0,0,0,0,1,0,1,1,1,1,0,0,0,0,1,1,1,0,1},
            {1,0,0,0,0,14,0,0,0,0,0,1,0,1,0,0,0,0,0,16,0,1,1,1,0,1},
            {1,1,0,0,0,14,0,0,0,0,0,0,0,1,0,0,0,1,0,16,0,0,0,0,0,1},
            {1,1,0,0,1,0,1,1,1,1,1,1,0,1,0,0,0,1,0,16,1,0,0,0,1,1},
            {1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,0,0,1,0,16,1,0,0,0,1,1},
            {1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,16,1,0,0,0,0,1},
            {1,0,1,1,1,0,1,1,1,0,0,1,0,1,0,0,0,0,0,16,1,1,1,1,0,1},
            {1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1},
            {1,0,1,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1},
            {1,0,1,0,0,0,0,0,0,0,12,12,12,12,12,12,0,1,1,1,1,1,0,1,0,1},
            {1,0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,1},
            {1,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,4,0,0,1},
            {1,0,0,0,0,0,0,1,0,1,0,0,0,1,1,0,0,1,0,1,0,0,0,0,0,1},
            {1,0,0,4,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };
        
        posicionX = 1;
        posicionY = 1;

        do{
            ImprimeMapa(unMapa);
        }while (Movimiento(unMapa));
    }

    static boolean Movimiento(int[][] elMapa){
        
        Scanner entrada = new Scanner(System.in);
        String inputUsuario;
        inputUsuario = entrada.nextLine();

        if(inputUsuario.equals("a") && (elMapa[posicionY][posicionX-1]%2==0)) {posicionX = posicionX - 1;} else
        if(inputUsuario.equals("d") && (elMapa[posicionY][posicionX+1]%2==0)) {posicionX = posicionX + 1;} else
        if(inputUsuario.equals("w") && (elMapa[posicionY-1][posicionX]%2==0)) {posicionY = posicionY - 1;} else
        if(inputUsuario.equals("s") && (elMapa[posicionY+1][posicionX]%2==0)) {posicionY = posicionY + 1;} else
        if(inputUsuario.equals("f")){return false;}

        if(inputUsuario.equals("e") && elMapa[posicionY][posicionX]==8){posicionX=0;posicionY=19;}else
        if(inputUsuario.equals("e") && elMapa[posicionY][posicionX]==6){posicionX=25;posicionY=19;}
        
        if(elMapa[posicionY][posicionX]==10){posicionX=posicionX+1;}else
        if(elMapa[posicionY][posicionX]==12){posicionX=posicionX-1;}else
        if(elMapa[posicionY][posicionX]==14){posicionY=posicionY-1;}else
        if(elMapa[posicionY][posicionX]==16){posicionY=posicionY+1;}
        

        if(elMapa[posicionY][posicionX]==0){
            elMapa[posicionY][posicionX]=2;
        }
        
        return true;
    }
    
    static void ImprimePersonaje(){
        System.out.print("\\0/");
    }
    
    static void ImprimeBorde(int LongitudH){
        for(int j=0;j<LongitudH;j++){
            System.out.print("---");
        }
        System.out.println();
    }

    static void ImprimeMapa(int[][] MapaPorImprimir){

        LimpiarPantalla();
        ImprimeBorde(MapaPorImprimir[0].length);

        for(int i=0;i<MapaPorImprimir.length;i++){
            for(int j=0;j<MapaPorImprimir[i].length;j++){
                if(Visibilidad(i,j,4)){
                    if(i==posicionY && j==posicionX){
                        ImprimePersonaje();
                    }
                    else {
                        ImprimeElemento(MapaPorImprimir[i][j]);
                    } 
                }
                else{
                    System.out.print("   ");
                } 
            }
            System.out.println();
        }
        ImprimeBorde(MapaPorImprimir[0].length);
        System.out.println("El personaje esta en: " + "X: " + "["+posicionX+"]" + " Y: " + "["+posicionY+"]");
    }

    static void ImprimeElemento(int i){
        String[] Elementos = {
            " * ",
            "[=]",
            " . ",
            "~~~",
            "(0)",
            "",
            "@@@",
            "",
            "@@@",
            "",
            ">>>",
            "",
            "<<<",
            "",
            "^^^",
            "",
            "vvv",
        };
        System.out.print(Elementos[i]);
    }

    static boolean Visibilidad(int i, int j, int AlcancedeVision){
        return true;
        // return Math.pow(posicionX-j,2) + Math.pow(posicionY-i,2)<=Math.pow(AlcancedeVision,2);
    }

    static void LimpiarPantalla(){
		System.out.flush();
    }
}

//Extender el programa para que hay:    Agua, Bosque, Pared, y suelo
//  El personaje sólo podrá ir por el suelo y el bosque
//  El personaje no podrá ir por el agua o por la pared
//un objeto es algo que une elementos y datos en un mismo lugar