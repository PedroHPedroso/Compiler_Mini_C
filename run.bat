@echo off
setlocal enabledelayedexpansion

:: Definir o caminho do ANTLR
set ANTLR_JAR=C:\Users\pedro\Downloads\antlr-4.13.2-complete.jar

:: Linha divisória para melhorar a visualização
echo ==========================================================
echo [INFO] Compilando arquivos Java...
echo ==========================================================

:: Compilar os arquivos Java
javac -cp .;%ANTLR_JAR% ^
  Grammar\*.java ^
  Lang\*.java ^
  Main.java

:: Verifica erro na compilação
if errorlevel 1 (
    echo [ERRO] Falha na compilação.
    pause
    goto fim
)

:: Linha divisória para indicar início da execução
echo.
echo ==========================================================
echo [INFO] Executando o interpretador...
echo ==========================================================

:: Executar o interpretador e exibir toda a saída corretamente
java -cp .;%ANTLR_JAR% Main

:: Linha divisória para indicar fim da execução
echo.
echo ==========================================================
echo [INFO] Execucao finalizada.
echo ==========================================================

:: Manter a janela aberta para ver a saída completa
pause

:fim
exit
