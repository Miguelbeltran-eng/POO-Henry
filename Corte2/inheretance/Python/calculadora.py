# Clase Operaciones
class Operaciones:
    def sumar(self, a, b):
        return a + b

    def restar(self, a, b):
        return a - b

    def multiplicar(self, a, b):
        return a * b

# Clase principal (Calculadora)
class CalculadoraApp:
    def __init__(self):
        self.operaciones = Operaciones()

    def iniciar(self):
        while True:
            try:
                a = int(input("Ingresa el primer número: "))
                b = int(input("Ingresa el segundo número: "))
                operacion = input("¿Qué operación deseas realizar? (+, -, *): ")

                if operacion == '+':
                    resultado = self.operaciones.sumar(a, b)
                elif operacion == '-':
                    resultado = self.operaciones.restar(a, b)
                elif operacion == '*':
                    resultado = self.operaciones.multiplicar(a, b)
                else:
                    print("Operación no válida.")
                    continue  # vuelve al inicio del ciclo

                print("El resultado es:", resultado)

            except ValueError:
                print("Entrada no válida. Asegúrate de ingresar números.")
                continue  # vuelve al inicio del ciclo

            # Preguntar si desea continuar
            continuar = input("¿Deseas hacer otra operación? (s/n): ").lower()
            if continuar != 's':
                print("Gracias por usar la calculadora. ¡Hasta luego!")
                break  # salir del ciclo

# Ejecutar la calculadora
if __name__ == "__main__":
    app = CalculadoraApp()
    app.iniciar()
