<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html> 
<html>

<head>
<meta charset ="ISO-8859-1">
<title>Joined strategy</title>
</head>

<body>

    <h1>Joined Strategy</h1>


    <div align="center">
    
        <table>
            <tr>
            	<td>Vehicle ID </td>
                <td>Vehicle name </td>
                <td>Steering Handle </td>
                <td>Steering Wheel </td>
            </tr>			
            <c:forEach items ="${vehiclesList}" var="vehiclesList" varStatus="tagStatus">
                <tr>
                	<td>${vehiclesList.vehicleId}</td>
                    <td>${vehiclesList.vehicleName}</td>

                </tr>
            </c:forEach>
                    
            <tr>
                <td><a href="/InheritanceHibernateDemo/">Get back to main page</a></td>
            </tr>
        </table>
        

 

    </div>

 

</body>
</html>