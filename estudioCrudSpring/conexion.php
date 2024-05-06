<?php
class conexion {

    public function conectar(){
        define("server","localhost");
        define("user","root");
        define("db","banco");
        define("psw","");

        $opc=array(PDO::MYSQL_ATTR_INIT_COMMAND > 'SET NAMES utf8');
        try {
            $con= new PDO("mysql: host=".server.";dbname=".db,user,psw,$opc);
            $con->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION); 
            return $con;
        } catch (Exception $e) {
            die("error  conexion".$e->getMessage());
        }
    }
}


?>