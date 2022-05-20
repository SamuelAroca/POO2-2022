salario = float(input("Digite su salario: "))

if salario < 5000000:
    print("No paga renta")

elif salario >= 5000000 and salario < 10000000:
    print("Su impuesto es del 5%")
    total = salario * 5 / 100
    print("El total a pagar es de: ", total)

elif salario >= 10000000 and salario < 15000000:
    print("Su impuesto es del 8%")
    total = salario * 8 / 100
    print("El total a pagar es de: ", total)

elif salario >= 15000000 and salario < 20000000:
    print("Su impuesto es del 12%")
    total = salario * 12 / 100
    print("El total a pagar es de: ", total)

else: 
    salario >= 20000000
    print("Su impuesto es del 15%")
    total = salario * 15 / 100
    print("El total a pagar es de: ",total)


