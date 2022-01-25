package Practica4;

public class ej6 {
    public static void main(String[] args) {
        ochoReinas();
    }

    public static void ochoReinas() {
        int[] filas = new int[8];
        for (int i = 0; i<filas.length;i++){
            filas[i] = i+1;
        }
        ochoReinas(filas, "");
    }

    private static boolean esCorrecta(String solución){
        for (int i=0;i<solución.length()-1;i++){
            for (int j=0;j<solución.length();j++){
                if (Math.abs(i-(j))==Math.abs((int)solución.charAt(i)-(int)solución.charAt(j))&&solución.charAt(i)!=solución.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static void ochoReinas(int[] disponibles, String prefijo) {
        if (disponibles.length == 0) {
            if (esCorrecta(prefijo))
                System.out.println(prefijo);
        }
        else{
            int[] auxiliar = new int[disponibles.length-1];
            for (int e: disponibles) {
                int j = 0;
                for (int i=0;i<disponibles.length;i++){
                    if (disponibles[i]!= e)
                        auxiliar[j++] = disponibles[i];
                }
                ochoReinas(auxiliar,prefijo+e);
            }
        }
    }
}
