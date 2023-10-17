package com.example.peluqueria2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Conexion {


    public static boolean conectar() throws ClassNotFoundException, IOException {

        boolean conexionBBDD=false;

        Properties properties= new Properties();

        String host="";

        String port="";

        String name="";

        String username="";

        String password="";


        try {

            properties.load(new FileInputStream(new File("C:/Users/DAM/IdeaProjects/Peluqueria2/src/main/resources/configuration/peluqueria.properties")));


        //System.out.println(properties.get("driver"));

            host=String.valueOf(properties.get("host"));

            port=String.valueOf(properties.get("port"));

            name=String.valueOf(properties.get("name"));

            username=String.valueOf(properties.get("username"));

            password=String.valueOf(properties.get("password"));

            System.out.println(host+" "+port+" "+name+" "+username+" "+password);


            if (name.equals("peluqueria") && username.equals("root") && password.equals("toor")){

                conexionBBDD=true;

            }



        } catch (FileNotFoundException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        } catch (IOException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }


        return conexionBBDD;

    }
    public static boolean estadoConexion() {
        boolean ok=false;
        try {
            if (Conexion.conectar()) {
                ok= true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return ok;
    }

}
