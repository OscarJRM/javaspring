<?php
class crudB{
    public static function BorrarEstudiantes($cedula){
        include_once('conexion.php');
        $objeto = new conexion();
        $conectar = $objeto ->conectar();
        $cedula=$_GET["CED_EST"];
        $borrarSql = "DELETE FROM estudiantes WHERE CED_EST='$cedula'";
        $resultado = $conectar -> prepare($borrarSql);
        $resultado->execute();
        echo json_encode($resultado);
        $conectar->commit();
    }
}