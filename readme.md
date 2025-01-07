### Ejercicio – VETERINARIA

### Analizar el texto

María, que es recepcionista, detalla cómo sería el proceso de un cliente en la veterinaria. Vamos a resaltar las palabras que nos ayudarán a sintetizar los requerimientos del sistema.

### Analizando un caso: Crear una clase en Java

María nos aclara que la forma de agendar citas todavía no la tiene definida. Le comentamos que el sistema pronto le va a mostrar el diseño para verificar si se entendió todo bien.

Para empezar con la actividad, tendrán **5 minutos** para analizar el texto del relato y tratar de identificar los ítems.

### Lectura rápida: Veterinaria

“Son las 11 a.m. y entra a la veterinaria por primera vez Juana con su mascota Pancha. Las registro a ambas, anotando el **nombre y apellido del cliente** y también qué **mascota** tiene. De la mascota voy a anotar la **raza**. Juana había pedido previamente una cita con uno de los **veterinarios**. Juana deja a la perra en la veterinaria para que sea atendida. El veterinario atiende a Pancha, le realiza un **diagnóstico** y lo guarda en el historial de diagnósticos. Más tarde, Juana pasa a buscar a Pancha. Los diagnósticos son guardados según la **fecha** con una **descripción** y la **mascota asociada**. De los **veterinarios** — empleados — se conoce el **nombre**, **apellido** y **matrícula**.”

### Extracción de palabras clave

- **Cliente:** 

  - Nombre

  - Apellido

  - Deja a la perra y pasa a retirarla.


- **Veterinario:** 

  - Realiza un diagnóstico y lo guarda en el historial.

  - Nombre, apellido y matrícula.


- **Mascota:** 

  - Raza.

- **Diagnósticos:** 

  - Fecha.

  - Descripción.

  - Mascota asociada.

### Preguntas para analizar desde el paradigma de objetos:

1. **¿Qué objetos participan?**

2. **¿Cuáles son sus atributos?**

3. **¿Qué responsabilidades tienen?**

### ¿Qué clases participan?

1. **Cliente**

2. **Mascota**

3. **Veterinario**

4. **Diagnóstico**

5. **Historial de diagnósticos**

### Atributos y responsabilidades por clase

### Clase: Veterinario

- **Atributos:**
 
  - Nombre

  - Apellido
 
  - Matrícula

- **Responsabilidad:**
 
  - Realiza diagnóstico de la mascota.

### Posible solución: Crear una clase en Java

Con base en los puntos analizados, podemos implementar las clases en el código de Java.
