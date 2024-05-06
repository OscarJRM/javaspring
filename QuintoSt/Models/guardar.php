<?php
class crudG{
    public static function GuardarEstudiantes(){
        include_once ('conexion.php');
        header('Content-Type: application/json');
        $data = json_decode(file_get_contents('php://input'), true);
        $cedula = $data['CED_EST'];
        $nombre = $data['NOM_EST'];
        $apellido = $data["APE_EST"];
        $direccion = $data["DIR_EST"];
        $telefono = $data["TEL_EST"];
        $objeto = new conexion();
        $conectar = $objeto -> conectar();
        $insertSql="INSERT INTO estudiantes (CED_EST, NOM_EST, APE_EST, DIR_EST, TEL_EST) VALUES ('$cedula','$nombre','$apellido','$direccion','$telefono')";
        $resultado = $conectar->prepare($insertSql);
        $resultado->execute();
        echo json_encode($resultado);
        $conectar->commit();
    }
}