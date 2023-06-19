# Ejercicios-Basicos-Interfaz-Grafica-Java

En este proyecto encontraras ejercicios basicos de Java Swing usando WBuilder. Los enunciados de los problemas estan en este documento y la solucion en el codigo fuente.

Ejercicio 1. Ocultar y Visualizar componentes gráficos.

    Realice un programa en java con las siguientes características:

    La ventana principal tendrá los siguientes elementos:

    -	Una etiqueta que contenga su nombre. 
    Nombre de la etiqueta: etiNombre
    -	Una etiqueta que contenga su ciudad. 
    Nombre de la etiqueta: etiCiudad
    -	Un botón con el texto “Ocultar Nombre”. 
    Nombre del botón: btnOcultarNombre
    -	Un botón con el texto “Visualizar Nombre”. 
    Nombre del botón: btnVisuNombre
    -	Un botón con el texto “Ocultar Ciudad”.
    Nombre del botón: btnOcultarNombre
    -	Un botón con el texto “Visualizar Ciudad”.
    Nombre del botón: btnVisuCiudad

    El funcionamiento del programa será el siguiente:

    -	Cuando se pulse el botón btnOcultarNombre, se debe ocultar la etiqueta etiNombre.
    -	Cuando se pulse el botón btnVisuNombre, se debe visualizar la etiqueta etiNombre.
    -	Cuando se pulse el botón btnOcultarCiudad, se debe ocultar la etiqueta etiCiudad.
    -	Cuando se pulse el botón btnVisuCiudad, se debe visualizar la etiqueta etiCiudad.

    Para hacer esto debe programar el evento actionPerformed de cada botón.

    Usará el método setVisible() de cada etiqueta para visualizarlas u ocultarlas.
    
Ejercicio 2. Pasar información entre componentes gráficos.

    Creará un programa java cuya ventana principal contenga los siguientes componentes:

    -	Un cuadro de texto. El nombre será txtTexto.
    -	Una etiqueta vacía (sin texto dentro). El nombre será etiTexto1.
    -	Otra etiqueta vacía (sin texto dentro). El nombre será etiTexto2.
    -	Un botón con el texto “Traspasa 1”. El nombre será btnTraspasa1.
    -	Un botón con el texto “Traspasa 2”. El nombre será btnTraspasa2.

    El programa funcionará de la siguiente forma:

    -	Cuando el usuario pulse el botón “Traspasa 1”, lo que se haya escrito dentro del cuadro de texto se copiará dentro de la etiqueta 1.
    -	Cuando el usuario pulse el botón “Traspasa 2”, lo que se haya escrito dentro del cuadro de texto se copiará dentro de la etiqueta 2.

    Para hacer esto programará el evento actionPerformed de cada botón.

    Usará el método setText para situar el texto en la etiqueta, y getText para recoger el texto del cuadro de texto.


Ejercicio 3. Eventos del teclado.

    Se pide que realice un programa en java cuya ventana principal incluya los siguientes componentes:

    -	Un cuadro de texto llamado txtTexto.
    -	Una etiqueta vacía llamada etiTexto.
    -	Un botón con el texto “Vaciar” llamado btnVaciar.


    El programa funcionará de la siguiente forma:

    -	Cuando el usuario escriba en el cuadro de texto txtTexto, lo que escriba pasará inmediatamente a la etiqueta etiTexto. (Tendrá que programar el evento keyPressed del cuadro de texto)

    -	Cuando el usuario pulse el botón “Vaciar” el texto contenido en el cuadro de texto y en la etiqueta se borrará. (Tendrá que programar el evento actionPerformed)


    Tendrá que usar el método setText para colocar texto en la etiqueta y usar el método getText para recoger el texto escrito en el cuadro de texto.




