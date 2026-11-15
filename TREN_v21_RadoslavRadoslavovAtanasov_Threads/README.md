# Proyecto ferroviario v2.1

Alumno: **Radoslav Radoslavov Atanasov**. Modulo: **Programacion de Servicios y Procesos**, 2 DAM semipresencial, curso 2026/27.

## Contenido

La opcion 14 inicia dos compradores antes de esperar con join(). El teclado utiliza un unico Scanner y preguntas con prefijo del hilo; intentaReservar() comprueba y reserva el mismo asiento de forma atomica. El pago de tres segundos se ejecuta fuera de los bloqueos.

Proyecto y paquete Java: `TREN_v21_RadoslavRadoslavovAtanasov_Threads`. Se utiliza la denominacion indicada en la tarea de entrega de Aules.

## Abrir y ejecutar en Eclipse

1. Descomprimir el ZIP conservando la carpeta del proyecto.
2. Elegir **File > Import > General > Existing Projects into Workspace** y seleccionar esa carpeta.
3. Seleccionar una instalacion de **JDK 17 o superior**. No se requieren bibliotecas externas, base de datos ni servidor.
4. Abrir `src/TREN_v21_RadoslavRadoslavovAtanasov_Threads/CompanyiaFerroviaria.java` y ejecutar **Run As > Java Application**. Tambien se incluye `Ejecutar_v21.launch`.
5. Escribir las respuestas en **Console**. La opcion **14** compra un billete; **0** cancela donde se ofrece y sale desde el menu; **S/N** confirma o rechaza el pago.

Los datos se cargan de nuevo al iniciar y se mantienen solo en memoria. El mapa utiliza **O** (libre), **?** (reservado) y **X** (ocupado).

## Prueba de referencia

Trayecto **1** (VLC-MAD), categoria **1** (Turista), vagon **1** (vago02), asiento **7A**: precio **16 euros**. Tras confirmar, el asiento 07A queda ocupado y el vagon pasa de 48 a 47 plazas libres.

En esta version hay dos compradores. Responder a la pregunta cuyo prefijo se muestra (`Comprador-1` o `Comprador-2`); el orden puede variar. Si ambos intentan 7A, uno consigue reservar y el otro debe elegir otra plaza o cancelar con 0. El principal vuelve al menu cuando ambos han terminado.

## Verificacion

10 escenarios de compra correctos y 4 comprobaciones aisladas. Incluyen 6.400 intentos de reserva (200 rondas de 32 hilos, un ganador por ronda), pagos simultaneos y conservacion de la entrada compartida.

## Atribucion

Codigo base de **Enrique Niclos Camarasa**, IES Lluis Simarro. Vease `ATRIBUCION_Y_LICENCIA.txt` para la autoria y las condiciones BY-NC-SA indicadas en el enunciado.
