# Comparador de Signos en Java

Este proyecto implementa un programa en Java para verificar la correcta correspondencia de signos "({})" ingresados por el usuario. Utiliza una pila personalizada para realizar la validación y organiza el código siguiendo una estructura modular con las clases `Menu`, `Pila` e `Inicio`.

## Estructura del Código

### 1. **Clase `Pila`**
- Implementa una pila utilizando un `ArrayList<String>` en lugar de `Stack`.
- Métodos principales:
  - **`push(String elemento)`**: Agrega un elemento a la pila.
  - **`pop()`**: Elimina y retorna el elemento en la cima de la pila.
  - **`peek()`**: Devuelve el elemento en la cima sin eliminarlo.
  - **`isEmpty()`**: Comprueba si la pila está vacía.
- Se utiliza para manejar los signos y validar su correspondencia.

### 2. **Clase `Menu`**
- Gestiona la interacción con el usuario.
- Permite ingresar los signos a evaluar y muestra los resultados de la validación.
- Invoca a la clase `Inicio` para procesar la entrada.

### 3. **Clase `Inicio`**
- Contiene el método principal (`main`) del programa.
- Coordina las clases `Menu` y `Pila` para realizar la validación de los signos ingresados.
- Implementa la lógica de correspondencia de los signos:
  - Por cada carácter de la entrada:
    - Si es un signo de apertura (`(`, `{`), se agrega a la pila.
    - Si es un signo de cierre (`)`, `}`), verifica que coincida con el signo en la cima de la pila.
  - Si la pila está vacía al final del procesamiento, los signos están correctamente balanceados.

## Ejecución

1. Asegúrate de tener instalado el JDK.
2. Compila el proyecto desde la terminal o consola:
   ```bash
   javac Inicio.java
Ejecuta el programa:

java Inicio
Ingresa la secuencia de signos cuando se solicite y verifica el resultado.
Ejemplo de Uso
Entrada:

{[()]}
Salida:

Los signos están correctamente balanceados.
Entrada:

{[(])}
Salida:

Los signos no están balanceados.
Personalización
Puedes modificar la lógica para incluir otros tipos de símbolos o cambiar la implementación de la pila si es necesario.

Este README explica claramente la funcionalidad de las clases y proporciona ejemplos prácticos para que otros usuarios puedan entender el propósito