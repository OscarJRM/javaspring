<?php
class crudC{
    public static function getAll(){
        include_once "conexion.php";
        header('Content-Type: application/json');
        $objeto= new conexion();
        $conectar = $objeto->conectar();
        $sql = "SELECT * FROM transacciones";
        $resultado= $conectar->prepare($sql);
        $resultado->execute();
        $data=$resultado->fetchAll(PDO::FETCH_ASSOC);
        $dataJs = json_encode($data);
        print_r($dataJs);

    }

}




?>