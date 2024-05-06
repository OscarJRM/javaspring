<?php
class crudA
{
    public static function ActualizarEstudiantes()
    {
        include_once ('conexion.php');
        header('Content-Type: application/json');
        $objeto = new conexion();
        $conectar = $objeto->conectar();
        $cedula = $_GET["CED_EST"];
        $nombre = $_GET["NOM_EST"];
        $apellido = $_GET["APE_EST"];
        $direccion = $_GET["DIR_EST"];
        $telefono = $_GET["TEL_EST"];
        $actualizarSql = "UPDATE estudiantes SET NOM_EST='$nombre', APE_EST='$apellido', DIR_EST='$direccion', TEL_EST='$telefono' WHERE CED_EST = '$cedula' ";
        $resultado = $conectar->prepare($actualizarSql);
        $resultado->execute();
        echo json_encode($resultado);
        $conectar->commit();
    }
}