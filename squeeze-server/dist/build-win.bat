ECHO ON
REM set MAVEN_OPTS=-Xms512m -Xmx1024m
set SMI_SS_VERSION_NUMBER=1.7
IF "%1"=="" GOTO Continue
set SMI_SS_VERSION_NUMBER=%1
IF "%2"=="" GOTO Continue
set INSTALLER_VERSION=%2

rem :Continue
echo Building Squeeze Server %SMI_SS_VERSION_NUMBER%

C:\Windows\system32\cmd.exe /c "mvn clean package -P create-dist-win"
IF %ERRORLEVEL% NEQ 0 echo "mvn clean exit code: " %ERRORLEVEL%
echo "DONE: mvn clean package -P create-dist-win"
echo unzip smicomp for installer

cd ..\..\smicomp\
rmdir /Q /S windows
mkdir windows
cd windows
%JAVA_HOME%bin\jar.exe -xf ..\sswinsmicomp.zip 

echo unzip squeeze server distribution

cd ..\..\squeeze-server\dist\target-win

%JAVA_HOME%bin\jar.exe -xf squeeze-server-dist-1.7.0.zip

"C:\Program Files (x86)\InstallShield\2012 SAB\System\IsCmdBld.exe" -p ..\..\installer\windows\web-installer\SqueezeServerInstall.ism -b "%~dp0target-win\Installer" -y %INSTALLER_VERSION%
