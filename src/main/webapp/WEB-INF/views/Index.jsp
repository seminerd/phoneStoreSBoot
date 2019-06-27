<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href ="resources/css/style.css"></link>
<meta charset="ISO-8859-1">
<title >${location} Phone Store</title>
</head>
<h1 >Welcome to our store !</h1>
<body class="body">
	<form action = "greeting" method ="post" class= "form">
		<table>
			<tr>
				<td class="location">Enter your location :</td>
				<td class="inputfield"><input name = "location" ></input></td>
				<td><button>Confirm</button></td>
				

			</tr>
		</table>
	</form>
</body>
</html>