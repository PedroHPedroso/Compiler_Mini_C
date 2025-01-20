@echo off

rem Ajuste o caminho do JAR aqui, se necessário:
set ANTLR_JAR=C:\Users\pedro\Downloads\antlr-4.13.2-complete.jar

echo Compilando arquivos Java...
javac -cp .;%ANTLR_JAR% ^
  Grammar\*.java ^
  Lang\*.java ^
  Main.java

if errorlevel 1 (
    echo [Erro] Falha na compilacao.
    pause
    goto fim
)

echo Executando...
java -cp .;%ANTLR_JAR% Main
pause

:fim
