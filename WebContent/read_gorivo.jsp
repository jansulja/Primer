<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<jsp:useBean id="vozila" type="java.util.List" scope="request"/>

<fmt:setBundle basename="messages.messages"/>

<html>
	<head>
		<title><fmt:message key="listaVozila"/></title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<meta HTTP-EQUIV="Expires" CONTENT="-1">
		<link href="./theme.css" rel="stylesheet" type="text/css" />
	</head>
	<c:if test="${sessionScope.admin==null}">
		<c:redirect url="./login.jsp" />
	</c:if>
	<body>
		<table class="listaVozilaTabela">
			<thead>
				<tr>
					<th>Tip goriva</th>
				
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${goriva}" var="gorivo">
				<tr>
					<td>${gorivo.tipGoriva}</td>
					
					
				</tr>
				</c:forEach>
			</tbody>
		</table>
		[<a href="./PrepareCreateController"><fmt:message key="dodavanjeNovogVozila"/></a>]<br/>
		[<a href="./LogoutController"><fmt:message key="odjava"/></a>]<br/>
		
	</body>	
</html>