<%-- 
    Document   : ArithmeticCalculator
    Created on : 23-Sep-2022, 12:34:03 PM
    Author     : mhame
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            First: <input type="number" name="first" value="${FirstNum}"><br>
            Second: <input type="number" name="second" value="${SecondNum}"><br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%"><br>
        </form>
        <br>
        <div>Result: ${result}</div>
        <a href="age">Age Calculator</a>
    </body>
</html>
