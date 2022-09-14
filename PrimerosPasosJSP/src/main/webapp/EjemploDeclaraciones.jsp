<html>

<body>

<h1 style="text-align:center">

Ejemplo Declaraciones

</h1>

<%!
	private int resultado;

	public int metodoSuma(int num1, int num2){
		return num1+num2;
	}
	
	public int metodoResta(int num1, int num2){
		return num1-num2;
	}
	
	public int metodoMultiplica(int num1, int num2){
		return num1*num2;
	}

%>

El resultado de la suma es: <%= metodoSuma(7,5) %>

<br>

El resultado de la resta es: <%= metodoResta(7,5) %>

<br>

El resultado de la multiplicación es: <%= metodoMultiplica(7,5) %>

</body>


</html>