<?php 
$databaseHost = '127.0.0.1';//or localhost
$databaseName = 'project'; // your db_name
$databaseUsername = 'root'; // root by default for localhost 
$databasePassword = '';  // by defualt empty for localhost

$mysqli = mysqli_connect($databaseHost, $databaseUsername, $databasePassword, $databaseName);
 
?>