<!DOCUMENT HTML>
<HTML>
<HEAD>
    <meta http-equiv="content-type" content="text/html; charset=UTF8" >
    <title>Feldolgozó</title>
    <link rel="stylesheet" href="css/main.css" id="form_login">
</HEAD>
<BODY>
<h2>Kitöltött Űrlap</h2>
 	<?php

        echo ("<strong>Név:</strong> " . $_POST["nev"] . "<br></br>");
        echo ("<strong>Pin kód:</strong> " . $_POST["pin"] . "<br></br>");
        echo ("<strong>Gyümölcs:</strong> " . $_POST["gyum"] . "<br></br>");
        echo ("<strong>Életkor:</strong> " . $_POST["kor"] . "<br></br>");
        echo ("<strong>Lábméret:</strong> " . $_POST["lab"] . "<br></br>");
        echo ("<strong>Önbizalom:</strong> " . $_POST["bizalom"] . "<br></br>");


    ?>
        <a href="urlap.html">Vissza az előző oldalra</a>
</BODY>
</HTML>
