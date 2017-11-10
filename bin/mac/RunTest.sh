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
# Ejecución de las pruebas
# ---------------------------------------------------------

cd ../..

java -ea -classpath lib/cuentosInfantiles.jar:test/lib/junit.jar:test/lib/cuentos InfantilesTest.jar junit.swingui.TestRunner edu.jabs.cuentos Infantiles.test.CuentosInfantilesTest

java -ea -classpath lib/cuentosInfantiles.jar:test/lib/junit.jar:test/lib/cuentos InfantilesTest.jar junit.swingui.TestRunner edu.jabs.cuentos Infantiles.test.LibroTest
cd bin/mac

stty echo