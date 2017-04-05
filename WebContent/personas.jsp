<s:form action="save">
        <s:textfield label="Nombre" name="name"></s:textfield>
        <s:textfield label="Edad" name="age"></s:textfield>
        <s:radio label="Genero" name="gender" list="#{'Femenino':'Femenino','Masculino':'Masculino'}" />
        <s:submit></s:submit>	
        <s:actionerror/>
    </s:form>