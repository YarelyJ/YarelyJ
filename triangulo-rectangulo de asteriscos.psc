Algoritmo pitasteriscos
	Imprimir "dime un numero" 
	leer x
	q=1
	w="* "
	e="  "
	Imprimir w
	t=1
	Mientras (t<(x-1))
		m=m+w
		s=1
		si x>2 y s<=(x-2)
			b=b+e
		FinSi
		s=s+1
		p=m+b+w
		imprimir p
		t=t+1
		m=""
		b=b+e
	FinMientras
	si x>1
		l=1
		mientras (l<=x) Hacer
			c=c+w+e
			l=l+1
		FinMientras
		imprimir c
	FinSi
FinAlgoritmo
