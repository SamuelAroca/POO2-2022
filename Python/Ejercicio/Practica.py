class Cuenta:
    
    nombre = input("Digite su nombre: ")
    nCuenta =  int(input("Digite el número de su cuenta: "))
    saldo = float(input("Digite el saldo de apertura: "))
    opcion = 1

    while opcion != 0:

        print("1 Para deposito, 2 Para retiro, 3 Para Consulta, 0 para salir")
        opc = int(input("Digite la opcion: "))
    

        if opc == 1:
            cantidad = float(input("Ingrese la cantidad a depositar: "))

            if cantidad <= 0:
                print("Dede ingresar una cantidad mayor a 0")
            else:
                saldo += cantidad
                #saldoActual = saldo + cantidad 
                print("Su saldo actual es: ", saldo)
        
        elif opc == 2:
            cantidad2 = float(input("Ingrese la cantidad a retirar: "))

            if cantidad2 > saldo:
                print("No puede retirar una cantidad mayor a su saldo")
            else:
                saldo -= cantidad2
                print("Retiro con exito de: ", cantidad2)
                print("Su saldo quedó en: ", saldo)

        elif opc == 3:
            print("Consultas: 1 para Nombre de usuario, 2 para número de cuenta, 3 para saldo")
            opc2 = int(input("Digite la opcion: "))

            if opc2 == 1:
                print(nombre)
            elif opc2 == 2:
                print(nCuenta)
            elif opc2 == 3:
                print(saldo)
            else:
                print("Digito una opcion mal")

        elif opc == 0:
            break

        else:
                print("Digito una opcion mal")

        opcion = int(input("¿Quiere salir del programa? 0 para salir, otro numero para seguir: "))
        
    

