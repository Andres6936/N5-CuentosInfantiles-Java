#!/usr/bin/env bash

# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
# Universidad Santiago de Cali (Santiago de Cali - Colombia)
# Departamento de Ingeniería de Sistemas y Computación
# Licenciado bajo el esquema Academic Free License version 2.1
#
# Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
# Ejercicio: N5-CuentosInfantiles-Java
# Autor: Joan Andrés Buriticá Salazar
# ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

stty -echo

# ---------------------------------------------------------
# Ejecución del programa
# ---------------------------------------------------------

cd ../..
java -ea -classpath ./lib/cuentos Infantiles.jar edu.jabs.cuentosInfantiles.interfaz.InterfazCuentosInfantiles
cd bin/mac

stty echo