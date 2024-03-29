# Java-Programmierung-I-WS-2023-24
[Kurzgesagt über Java - einfach erklärt mit Video Beispielen](https://studyflix.de/informatik/einfuhrung-in-die-java-grundlagen-213)

## Übung 12 : Sitzung 13 am 25.01.2024 (16:00 - 17:30) per Zoom
### Aufgabe
1. Schreib ein Programm wo die Inhalt diese Datei (`Ich bin eine/r Programmier/in und üben wir heute zusammen`) wird als `ASCII` gelesen. Da muss das `try-catch` block für Ausnahmebehandlung benutzt werden bsw. `FileNotFoundException` und `IOException`. Hinweis : nutzt diese `File`, `FileInputStream` und `InputStreamReader` das Code zu erzeugen.
2. Wie kann die bestehende Programm ändern damit die Datei deutlich auf eure Rechner gelesebar sein wird.
3. Schreib ein Programm wo die Zeichenkette (`Heute haben wir Java Programmierung zusammen geübt`) wird in eine Datei gespeichert. Da muss das `try-catch` block für Ausnahmebehandlung benutzt werden bsw. `UnsupportedEncodingException` und `IOException`. Hinweis : nutzt diese `FileOutputStream` und `OutputStreamWriter` das Code zu erzeugen.

## Übung 11 : Sitzung 12 am 18.01.2024 (16:00 - 17:30) im 103 Seminarraum S83 (103/EG/0.220)
### Aufgabe
1. Erstell die Klassen `Circle` und `Square` mit eigene Konstruktor und die entsprechende Methoden `void setSize(double radius)`, `public void getArea()`, `public double[] getSides()` und `public double getSize()` umgesetzt.
2. Umbau die existierende Klassen, damit die beiden Klassen `Circle` und `Square` denen `Interface` bzw. `Line` und `Polygon` umsetzen werden.
3. Erstell die Methoden, wo die Ausnahmebehandlung möglichkeiten z.B. `try-catch` und `throws` werden umgesetzt. Nimm die Beispiel öffne eine Datei.

## Übung Jan16 : am 16.01.2024 (10:00 - 11:30) per Zoom
### Aufgabe
1. Erstell 3 `Klasse` nämliche `Mann`, `Frau`, `NonBinary` im eine Person Package, die eine `de.uzk.java.kurs.Human` Klasse vererbt. Die `de.uzk.java.kurs.Human` Klasse hat 3 Eigenschaften - **_age_**, **_name_**, **_gender_** und auf die vererbte Klasse es gibt **_inUnionOrAPair_**, **_numberOfChildren_** Eigenschaften. Notizen die nötige Eigenschaften müssen initialisiert werden.
2. Schreib auf die erbte Klassen die Methode - `inAUnionOrAPair(boolean setAsPair)`, `beingParent()`, `boolean isParent()` geeignet für die obenstehende Eigenschaften.
3. Erstell die `setFrau(Human h)`, `setMann(Human h)`, `setNonBinary(Human h)` Methode, die statische Instanz mit die erbte Klasse verbinden wäre.
4. Schreib eine Method `foundMate(Human h1, Human h2)`, wo die sie sich paaren und eine Method `havingBaby(Human h1, Human h2)` wo die paarchen eine Kind bekommen.
5. Was müssen im Code geändert werden, damit diese Zuweisung `Human h = new Human()` verhindert wird.
6. Wie kann man eine `findJob(Human h)` Method in erbte Klasse deklarieren.
7. Zeig eine `interface` Beispiel mit eine neue `Person` Klasse

## Übung 10 : Sitzung 11 am 11.01.2024 (16:00 - 17:30) per Zoom
### Aufgabe
1. Erstell 3 `Klasse` nämliche `Mann`, `Frau`, `NonBinary` im eine Person Package, die eine `de.uzk.java.kurs.Human` Klasse vererbt. Die `de.uzk.java.kurs.Human` Klasse hat 3 Eigenschaften - **_age_**, **_name_**, **_gender_** und auf die vererbte Klasse es gibt **_inUnionOrAPair_**, **_numberOfChildren_** Eigenschaften. Notizen die nötige Eigenschaften müssen initialisiert werden.
2. Schreib auf die erbte Klassen die Methode - `inAUnionOrAPair(boolean setAsPair)`, `beingParent()`, `boolean isParent()` geeignet für die obenstehende Eigenschaften.
3. Erstell die `setFrau(Human h)`, `setMann(Human h)`, `setNonBinary(Human h)` Methode, die statische Instanz mit die erbte Klasse verbinden wäre.
4. Schreib eine Method `foundMate(Human h1, Human h2)`, wo die sie sich paaren und eine Method `havingBaby(Human h1, Human h2)` wo die paarchen eine Kind bekommen.
5. Was müssen im Code geändert werden, damit diese Zuweisung `Human h = new Human()` verhindert wird.
6. Wie kann man eine `findJob(Human h)` Method in erbte Klasse deklarieren.
7. Zeig eine `interface` Beispiel mit eine neue `Person` Klasse

## Übung 8 : Sitzung 9 am 14.12.2023 (16:00 - 17:30) per Zoom
### Aufgabe
1. Finde die Charakter am Position 10, 20, 30, 40, 50, 60, 70, 80, 90 innerhalb das `längste` deutsche Wort ohne Absturz der Programm
2. Erstell die Methode `static int search(char[] array, String toFind)`, die uns die erste Position der `toFind` Zeichenkette zurück gibt
3. Javadoc Möglichkeiten für `java.lang.String` Zeigen - `charAt` , `compareTo`, `indexOf`, `startsWith`, `endsWith` , `substring`
4. Erstell eine Klasse `Stadt`, wo der Name der Stadt mit `this` referenz benutzt wird. Dazu erstellen die Methode `wieHeisstDieStadt()` (Ausgibt Name der Stadt im Konsole) und `wieGrossIstDieStadt(int einwohner)` (Ausgibt abhängig von Anzahl der Bevölkerung ob die Stadt klein, mittlegroß, groß, sehr-groß ist)

## Übung Dez5 : am 05.12.2023 (10:00 - 11:30) per Zoom
### Aufgabe
1. Erstell ein Integer array der größe 100 ist und fülle jeden Wert von 100 (Anfang) bis 1 (Ende) auf
2. Schreib Programme, die der `Multiplizieren Tabelle` für 5 mit 3 Schleifen-formen anzeigt
3. Schreib ein Methode, wo alle Elemente in eine Integer Array wird addiert oder multipliziert abhängig von die Eingabe   
> Hinweis : wenn ihr mit `Switch-Case` möglichkeiten versucht 
>	`Name_der_Methode (Integer_Array , "String");`

> Hinweis : wenn ihr mit `If-Else` möglichekeiten versucht
>	`Name_der_Methode (Integer_Array , 'Char');`
4. Schreib ein Programm, wo diese Konsole Output generiert wird :
   Hinweis : benutze mit 2 `Schleifen`

## Übung 6 : Sitzung 7 am 30.11.2023 (16:00 - 17:30) per Zoom
### Aufgabe
1. Erstell ein Integer array der größe 100 ist und fülle jeden Wert von 100 (Anfang) bis 1 (Ende) auf
2. Erstell ein Integer array der größe 10 ist und fülle jeden Wert zufällig mit 0 und 1 auf
    Hinweis : 
   	`Math.random()` gibt einen zufälligen `double` Wert zurück
   	`Math.round()` kann einen `float` oder `double` runden gibt jedoch einen `long` zurück
3. Schreib ein Methode, die eine Zeichenkette einnimmt und umgekehrter Reihe der Zeichenkette in der Konsole ausgibt.
    Hinweis : nutze die `Zeichenkette.toCharArray()` Aufruf
4. Schreib ein Methode, wo alle Elemente in eine Integer Array wird `addiert` oder `multipliziert`
5. Schreib ein Programm, wo diese Konsole Output generiert wird :
    Hinweis : benutze mit 2 `Schleifen`

## Übung 5 : Sitzung 6 am 16.11.2023 (16:00 - 17:30) per Zoom
### Aufgabe
1. Schrieb eine `Programme`, die alles `gerade` und `ungerade` Zahlen von 0 bis 99 (beide einschließlich) als Separat Serien drückt : `for` schleife
2. Schrieb eine `Programme`, alles positiv `ganz` Zahlen von -1 bis 50 drückt : `do-while` schleife
3. Beispiel von `Fibonacciserien` : wie drückt man diese Nummerserien 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 : `while` schleife
4. Beispiel von `Scanner` Methode für `Eingabe` des Benutzers
5. Schrieb eine `Programme`, die uns die Multiplizieren tabelle für 5 im Konsole drückt

## Übung 4 : Sitzung 5 am 09.11.2023 (16:00 - 17:30) im 103 Seminarraum S83 (103/EG/0.220)
1. Schrieb eine `Funktion` / `Method` die uns liefert ob ein Nummer oder Zeichnenketten Nummern ein ganz Zahl ist
2. Schrieb eine `Funktion` / `Method` die uns liefert ein fließkommaZahl zwischen 0 und 1 für Eingabe
3. `Anwendung` : Wenn man 2 Zeichnen Namens des Tages eingibt (z.B. Sonntag als So), dann liefert uns zurück was ich heute machen muss

## Übung 3 : Sitzung 4 am 02.11.2023 (16:00 - 17:30) im 103 Seminarraum S83 (103/EG/0.220)
### Aufgaben
1. `Wiederholung` der paar wichtigen Themen
2. `Rückgabewert` Übung
3. `Nummernserien` Beispiele, die im Console Fenster gedruckt werden soll


## Übung 2 : Sitzung 3 am 26.10.2023 (16:00 - 17:30) im 103 Seminarraum S83 (103/EG/0.220)
### Aufgaben
1. `Importieren` dieses `git-repository` in eurer Entwicklungsumgebung - [GitHub Projekte in Eclipse importieren](https://drive.google.com/file/d/1IpwHADmwViEGQ7Pf4BgybUYpz7WBoMe5/view)
2. `Exportieren` das Projekt, damit es in einer anderen Entwicklungsumgebung geöffnet werden kann
3. `Short-Cuts` im `Eclipse`, wie die müssen verwendt werden
4. Verschieben Nutzung von `Kommentaren`
5. `Methoden` mit mehreren `Argumente` und mit `Rückgabewert` üben
6. Zeig Datentypen Beispiele und wie kann man die `Fehler | Warnung` aufheben während Nutzungen den komplexen `Ausdrücken`
7. Zeig anderen Formen der `Default Package` wie könnte man das nutzen
8. Zeig vergleich zwischen `Eclipse` und `Terminal | Command-line` tool für Auführung der Java Programme 


## Übung 1 : Sitzung 2 am 19.10.2023 (16:00 - 17:30) im 103 Seminarraum S83 (103/EG/0.220)
### Aufgaben
1. Schreib eine Programm wo zwei Zahlen werden `addieren`
2. Zeig wie die oben stehenden Programm kann als einem `Method` laufen lassen
3. Schreib eine Programm wo zwei Zahlen werden `multiplizieren`, `dividieren` und `substrahieren` in eigenen `Methoden`
4. Schreib eine Programm wo zwei Zahlen werden `gleich als einander`, `großer als einander`, `kleiner als einander` vergleichen
5. Zeig paar Methoden bpsw. `valueOf()` und `toUpperCase()` und wie die funktionieren soll
6. Zeig wie oben stehenden `Methoden` (im `3. Aufgabe` und `4. Aufgabe`) können raus den Haupt Datei/File auf eine neue Datei/File (Klasse ebene) geschneidet und geschoben werden


## Sitzung 1 am 12.10.2023 (16:00 - 17:30) per Zoom
- Eclipse installieren : https://www.eclipse.org/downloads/packages/installer
- Eine "Hello World" Programm
  ```
    public class Demo {
      public static void main(String[] args) {
          System.out.println("Willkommen an Universität zu Köln!");
      }
    }
  ```
