@echo

REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad Santiago de Cali (Santiago de Cali - Colombia)
REM Departamento de Ingeniería de Sistemas y Computación
REM Licenciado bajo el esquema Academic Free License version 2.1
REM
REM Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
REM Ejercicio: N5-CuentosInfantiles-Java
REM Autor: Joan Andrés Buriticá Salazar
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

SET CLASSPATH=

REM ---------------------------------------------------------
REM Ejecucion de las pruebas
REM ---------------------------------------------------------

cd ../..

java -ea -classpath lib/cuentos Infantiles.jar;test/lib/junit.jar;test/lib/cuentos InfantilesTest.jar junit.swingui.TestRunner uniandes.cupi2.cuentos Infantiles.test.CuentosInfantilesTest

java -ea -classpath lib/cuentos Infantiles.jar;test/lib/junit.jar;test/lib/cuentos InfantilesTest.jar junit.swingui.TestRunner uniandes.cupi2.cuentos Infantiles.test.LibroTest
cd bin/win