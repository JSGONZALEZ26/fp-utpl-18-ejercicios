print("Estamos relizando una prueba para el ciclo while")

# Comentarios de una línea

contador = 1
limite = 3
cadena = "{2}{1:>15}{0:>15}\n".format("Nombres", "Apellidos", "Edad")
while contador<=limite:
    nombre = input("Ingrese su nombre: \n")
    apellido = input("Ingrese su apellido: \n")
    edad = input("Ingrese su edad: \n")
    cadena = "{0}{3}{2:>10}{1:>15}\n".format(cadena, nombre, apellido, int(edad))
    
    contador = contador + 1 # incremento contador

print(cadena)