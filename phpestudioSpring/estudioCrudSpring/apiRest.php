<?php
include_once "transacciones.php";
include_once "consultar.php";
$opc=$_SERVER['REQUEST_METHOD'];
switch($opc){
    case "GET":
        $url=$_SERVER['REQUEST_URI'];
        if (strpos($url, '?') !== false) {
            // Si hay parámetros, ejecutar la función para manejar transacciones
            crudT::transaccion();
        } else {
            // Si no hay parámetros, obtener todos los registros
            crudC::getAll();
        }
        break;
}

?>