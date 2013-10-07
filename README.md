### Introduksjon til Java 8, funksjonell og asynkron programmering med Future/Promise

Med Java 8 kommer det mye ny funksjonalitet; Lambda-funksjoner er kanskje den mest interessante.

Futures & Promises er asynkrone primitiver for å uttrykke parallellitet.

Denne workshopen vil gi en introduksjon til Java 8 via noen slides og hands-on oppgaver, før Futures & Promises introduseres.

Før kurset må du ha satt opp:

1. Installerer maven
2. Last ned JDK8 med Lambda-støtte her: https://jdk8.java.net/lambda/
3. Putt JDK-filene i mappa 'jdk1.8.0'. Hvis de ligger riktig, så skal filstrukturen se ca. slik ut:
<pre>java8-workshop/jdk1.8.0/bin/
java8-workshop/jdk1.8.0/lib/
java8-workshop/jdk1.8.0/jre/
(...)
</pre>

4. Aktiver Java-8-støtte i editoren din. (F.eks. for IntelliJ IDEA, sett opp en SDK-konfigurasjon for Java 8 med Lambda-støtte.
Du trenger versjon 12 eller nyere for å få lambda-støtte.
5. Se at tester kjører: kjør `mvn test` fra mappen 'java8-workshop'.

Ved problemer med oppsettet, send en mail til eirik.sletteberg (at) gmail.com.

Dette prosjektet er en fork av https://github.com/arild/fagdag_mar2013.
Takk til @arild, @mariatsji og @SjurMillidahl for Scala-presentasjon og original kode!
