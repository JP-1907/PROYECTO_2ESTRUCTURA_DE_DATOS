-Sistema de Gestión de Impresión - Montículo Binario
Este proyecto consiste en un Gestor de Impresión que organiza documentos en una cola de prioridad utilizando un Montículo Binario (Min-Heap). 
El sistema calcula la prioridad de cada documento basándose en el tipo de usuario (VIP o Normal), el tamaño del archivo y el tiempo de llegada.


-FuncionalidadesGestión de Prioridades: 
1)Los documentos no se imprimen por orden de llegada simple, sino por una jerarquía de importancia calculada.

2)Visualización en Tiempo Real: Interfaz gráfica que dibuja el árbol binario (Heap) conforme se agregan o eliminan 

3)documentos.Carga Masiva: Soporte para importar listas de documentos desde archivos CSV.

4)Identificación por Hash: Uso de tablas hash para la verificación rápida de usuarios y sus niveles de prioridad.

-Tecnologías UtilizadasLenguaje: 
Java 17 o superior.Entorno: NetBeans IDE / IntelliJ IDEA.Librerías: * javax.swing y java.awt para la interfaz gráfica y el motor de dibujo.java.util.logging para el rastreo de eventos (Logger).

1)Estructura de DatosEl núcleo del proyecto utiliza un Min-Heap. 

2)En este árbol:El nodo raíz siempre contiene el documento con la etiqueta de tiempo más baja (mayor prioridad).

3)Al imprimir, el sistema extrae la raíz y reordena el árbol automáticamente para mantener la eficiencia O(\log n).

Colaboradores:
-Daniel Angulo
-Juan Rojas
