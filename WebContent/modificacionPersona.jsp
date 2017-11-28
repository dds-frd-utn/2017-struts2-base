<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>modificacion</title>
</head>
<body>
	<h3>Persona a Modificar</h3>
	<s:property value="perMod.id" />
	<s:property value="perMod.name"/>
	<s:property value="perMod.age"/>
	<s:property value="perMod.gender"/>
	<s:form action="modificar">
		<s:textfield label="Nombre" name="name"></s:textfield>
		<s:textfield label="Edad" name="age"></s:textfield>
		<s:radio label="Genero" name="gender" list="#{'Femenino':'Femenino','Masculino':'Masculino'}" />
		<s:submit></s:submit>
		<s:actionerror/>
	</s:form>
</body>
</html>