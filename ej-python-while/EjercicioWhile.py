print("Estamos relizando una prueba para el ciclo while")

# Comentarios de una línea

contador = True
cadena = "%s\t%s\t%s\n" % ("Nombres", "Apellidos", "Edad")
while contador:
    nombre = input("Ingrese su nombre: \n")
    apellido = input("Ingrese su apellido: \n")
    edad = input("Ingrese su edad: \n")
    cadena = "%s%s\t%s\t\t%d\n" % (cadena, nombre, apellido, int(edad))
    
    contador = contador + 1 # incremento contador
    conf = input("¿Desea ingresar un nuevo dato?(si para continuar): \n")
    if conf != "si":
    	contador= False
    

print(cadena)