<?php
require_once('conexion.php');

class TransaccionesService {
    
    public static function obtenerTransacciones($numeroCuenta, $fechaInicio, $fechaFin) {
        $conexion = new Conexion();
        $con = $conexion->conectar();
        header('Content-Type: application/json');

        $sql = "SELECT * FROM Transacciones WHERE NumeroCuenta = :numeroCuenta AND FechaTransaccion BETWEEN :fechaInicio AND :fechaFin";
        $stmt = $con->prepare($sql);
        $stmt->bindParam(':numeroCuenta', $numeroCuenta, PDO::PARAM_INT);
        $stmt->bindParam(':fechaInicio', $fechaInicio);
        $stmt->bindParam(':fechaFin', $fechaFin);
        
        $stmt->execute();
        $transacciones = $stmt->fetchAll(PDO::FETCH_ASSOC);
        
        return $transacciones;
    }
}

class crudT {
    public static function transaccion() {
        if ($_SERVER["REQUEST_METHOD"] == "GET") {
            // Obtener los datos de la URL
            $numeroCuenta = $_GET['numero_cuenta'];
            $fechaInicio = $_GET['fecha_inicio'];
            $fechaFin = $_GET['fecha_fin'];

            // Ejecutar la consulta para obtener las transacciones
            $transaccionesService = new TransaccionesService();
            $transacciones = $transaccionesService->obtenerTransacciones($numeroCuenta, $fechaInicio, $fechaFin);

            // Mostrar el resultado (puedes modificar esto según tus necesidades)
            echo json_encode($transacciones);
        }
    }
}

// Llamar a la función para manejar la transacción

?>
