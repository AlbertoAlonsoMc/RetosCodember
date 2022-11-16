import java.io.*;

//RETO 1: ¡ARREGLA TWITTER!

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        BufferedReader br = null;
        try {
            File file = new File("Usuarios.txt");
            br = new BufferedReader(new FileReader(file));
            String linea;
            StringBuilder oneLineUser = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                if (!linea.equals("")) {
                    oneLineUser.append(linea);
                } else {
                    if (oneLineUser.toString().contains("usr") && oneLineUser.toString().contains("eme")
                            && oneLineUser.toString().contains("psw") && oneLineUser.toString().contains("age")
                            && oneLineUser.toString().contains("loc") && oneLineUser.toString().contains("fll")) {
                        contador++;
                        System.out.println(oneLineUser);
                    }
                    oneLineUser.setLength(0);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("EL NÚMERO DE USUARIOS VÁLIDOS ES: " + contador);
    }
}
