<%-- 
    Document   : agecalculator
    Created on : 21-Sep-2022, 11:43:02 AM
    Author     : mhame
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age"  method="post">
            Enter your age: <input type="number" name="age" value="${ageVal}">
            <input type="submit" value="Submit">
        </form>
        <div> ${ageMessage}</div> <br>
        <a href="arithmetic">
            Arithmetic Calculator
        </a>
    </body>
</html>
