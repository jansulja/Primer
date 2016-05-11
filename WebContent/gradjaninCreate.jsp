<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>


<fmt:setBundle basename="messages.messages"/>

<html>
	<head>
		<title><fmt:message key="dodavanjeVozila"/></title>
		<meta HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<meta HTTP-EQUIV="Expires" CONTENT="-1">
		<link href="./theme.css" rel="stylesheet" type="text/css" />
	</head>
	
	<body>
		<form action="./CreateGradjaninController" method="post" class="dodavanjeVozilaForma" accept-charset="ISO-8859-1">
			<table class="dodavanjeVozilaTabela">
				<tr>
					<td>Ime:</td>
					<td><input type="text" name="ime" ></td>			
				</tr>
				<tr>
					<td>Prezime:</td>
					<td><input type="text" name="prezime" ></td>				
				</tr>
				<tr>
					<td>Broj Licne Karte:</td>
					<td><input type="text" name="brojLicne" style="width: 161px; "></td>				
				</tr>
				<tr>
					<td>Datum Rodjenja:</td>
					<td><input type="text" name="datumrodjenja" ></td>				
				</tr>
				<tr>
					<td>Pol:</td>
					<td><input type="text" name="pol" ></td>				
				</tr>
				<tr>
					<td>JMBG:</td>
					<td><input type="text" name="JMBG" ></td>				
				</tr>
				<tr>
					<td>Mesto Rodjenja:</td>
					<td><input type="text" name="mestoRodjenja" ></td>				
				</tr>
				<tr>
					<td>Opstina Rodjenja:</td>
					<td><input type="text" name="opstinaRodjenja" ></td>				
				</tr>
				<tr>
					<td>Drzava:</td>
					<td><input type="text" name="drzava" ></td>				
				</tr>
				<tr>
					<td>Broj telefona:</td>
					<td><input type="text" name="brojTelefona" ></td>				
				</tr>	
				<tr>
					<td>E-mail :</td>
					<td><input type="text" name="email" ></td>				
				</tr>
							
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" name="submit" value="Dodaj"></td>				
				</tr>
			</table>							
		</form>
		[<a href="./ReadController"><fmt:message key="listaVozila"/></a>]<br/>
		[<a href="./LogoutController"><fmt:message key="odjava"/></a>]<br/>
	<body>
</html>