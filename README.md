# Databázová aplikace pro malou spediční společnost

projekt ze semináře DBS2

Pracovní tým: Baier, Milenkovič, Sládeček

Název týmu: BAMIS

Instalace prostředí

MAVEN

vytvoření maven configurace s goals:
1) install:install-file -Dfile=ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
	- instalace jar knihovny pro oracla databázi
2) spring-boot:run / Spustit BamisApplication
	- instalace dependencies a spuštění aplikace

Spuštěná aplikace je k vidění na localhost:8085

