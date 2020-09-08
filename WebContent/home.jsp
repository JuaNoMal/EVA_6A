<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<% 
request.getSession(false);
if (session == null) { %>


<% response.sendRedirect("login.jsp");
} else {
    // Already created.
    %>
  <a href="logout.jsp">Salir</a><% 
}
String name = request.getParameter("name");
%>
<br><br>
<%
out.println("Bienvenido: "+name);
%>

<c:if test="${not empty sessionScope.persona.listaPersona}">
            <table name="tablaDatos" align="left" border="1" cellpadding="3">
                <tr>
                    <td>Rut</td>
                    <td>Nombre</td>
                    <td>Apellido</td>
                    <td>Telefono</td>
                    <td>Fecha Ingreso</td>
                </tr>
                <c:forEach var="r" items="${sessionScope.persona.listaPersona}">
                    <tr>
                        <td><c:out value="${p.rut}" /></td>
                        <td><c:out value="${p.nombre}" /></td>
                        <td><c:out value="${p.apellido}" /></td>
                        <td><c:out value="${p.telefono}" /></td>
                        <td><fmt:formatDate value="${p.fechaIngreso}" pattern="dd/MM/yy HH:mm:ss"/></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <br/><br/><br/>
        <c:if test="${not empty mensaje}">
            <h2><c:out value="${mensaje}"/></h2>
        </c:if>

</body>
</html>