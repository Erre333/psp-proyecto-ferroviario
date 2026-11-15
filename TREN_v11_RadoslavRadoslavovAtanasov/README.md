# Proyecto ferroviario v1.1

Alumno: **Radoslav Radoslavov Atanasov**. Modulo: **Programacion de Servicios y Procesos**, 2 DAM semipresencial, curso 2026/27.

## Contenido

La opcion 14 realiza una compra secuencial: seleccion del trayecto, categoria, vagon y asiento; reserva, pago simulado de tres segundos y confirmacion o liberacion.

Proyecto y paquete Java: `TREN_v11_RadoslavRadoslavovAtanasov`. Se utiliza la denominacion indicada en la tarea de entrega de Aules.

## Abrir y ejecutar en Eclipse

1. Descomprimir el ZIP conservando la carpeta del proyecto.
2. Elegir **File > Import > General > Existing Projects into Workspace** y seleccionar esa carpeta.
3. Seleccionar una instalacion de **JDK 17 o superior**. No se requieren bibliotecas externas, base de datos ni servidor.
4. Abrir `src/TREN_v11_RadoslavRadoslavovAtanasov/CompanyiaFerroviaria.java` y ejecutar **Run As > Java Application**. Tambien se incluye `Ejecutar_v11.launch`.
5. Escribir las respuestas en **Console**. La opcion **14** compra un billete; **0** cancela donde se ofrece y sale desde el menu; **S/N** confirma o rechaza el pago.

Los datos se cargan de nuevo al iniciar y se mantienen solo en memoria. El mapa utiliza **O** (libre), **?** (reservado) y **X** (ocupado).

## Prueba de referencia

Trayecto **1** (VLC-MAD), categoria **1** (Turista), vagon **1** (vago02), asiento **7A**: precio **16 euros**. Tras confirmar, el asiento 07A queda ocupado y el vagon pasa de 48 a 47 plazas libres.

## Verificacion

19 comprobaciones correctas: compra confirmada, pago rechazado, cancelacion en cada paso, asiento invalido/ocupado/reservado, ausencia de datos, otro trayecto e interrupcion del pago.

## Atribucion

Codigo base de **Enrique Niclos Camarasa**, IES Lluis Simarro. Vease `ATRIBUCION_Y_LICENCIA.txt` para la autoria y las condiciones BY-NC-SA indicadas en el enunciado.
