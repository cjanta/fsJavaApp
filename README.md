# fsJavaApp
finale App des Kurses FaÜ-II (Dozent: T.Schott)

# Schritt 1: Grundlegende Swing-App erstellen

1.	Erstelle ein Java-Projekt.
2.	Lege eine Klasse AppWidget an, die von JFrame erbt:
    -	Diese Klasse ist das Hauptfenster der App.
    -	Richte ein JFrame ein, das folgende Komponenten enthält:
    -	Ein Eingabefeld (JTextField).
    -	Einen Button (JButton).
    -	Einen Bereich für Aufgaben (JPanel), der scrollfähig ist.
3.	Ergebnis:
    -	Das Fenster zeigt ein Eingabefeld, einen Button und einen Aufgabenbereich ohne Funktionalität.


# Schritt 2: Aufgaben als Widgets anzeigen
1.	Erstelle die Klasse TaskWidget, die von JPanel erbt:
    -	Dieses Widget repräsentiert eine einzelne Aufgabe.
    -	Es enthält:
        -	Eine Checkbox (JCheckBox) zum Markieren als erledigt.
        -	Ein Label (JLabel) für den Namen der Aufgabe.
        -	Einen Löschen-Button (JButton).
    -	Schreibe Funktionen, die:
    -	Den Aufgabenstatus aktualisieren (Checkbox-Status speichern).
    -	Die Aufgabe aus dem UI entfernen (Löschen-Button).
2.	Verbinde TaskWidget mit AppWidget:
    -	Beim Klick auf "Add Task" in AppWidget wird ein neues TaskWidget im Aufgabenbereich angezeigt.
3.	Ergebnis:
    -	Aufgaben können hinzugefügt, angezeigt und aus der Liste entfernt werden.

# Schritt 3: Datenbank-Service einrichten
1.	Erstelle die Klasse DBService:
    -	Implementiere die Datenbanklogik mit SQLite.
    -	Schreibe Methoden, um Aufgaben zu:
        -	Speichern (addTask).
        -	Lesen (getAllTasks).
        -	Aktualisieren (updateTask).
        -	Löschen (deleteTask).
2.	Erstelle eine Datenklasse Task:
    -	Die Klasse enthält:
        -	int id (Primärschlüssel, automatisch von der DB verwaltet).
        -	String text (Beschreibung der Aufgabe).
        -	boolean done (Status: erledigt/nicht erledigt).
3.	Ergebnis:
    -	Die Datenbank kann Aufgaben speichern, lesen, aktualisieren und löschen.

# Schritt 4: App mit Datenbank verbinden

1.	Erweitere AppWidget:
    -	Lade beim Start der App alle Aufgaben aus der Datenbank und zeige sie im Aufgabenbereich an.
    -	Speichere neue Aufgaben in der Datenbank, wenn sie hinzugefügt werden.
    -	Aktualisiere die Datenbank, wenn:
        -	Eine Aufgabe als erledigt markiert wird.
        -	Eine Aufgabe gelöscht wird.
2.	Passe TaskWidget an:
    -	Der Konstruktor von TaskWidget akzeptiert ein Task-Objekt.
    -	Bei Statusänderungen (Checkbox oder Löschen) wird die Datenbank aktualisiert.
3.	Ergebnis:
    -	Die App ist vollständig mit der Datenbank verknüpft. Änderungen in der GUI werden direkt in der Datenbank gespeichert.

# Bonus: Verbesserungen
1.	Zähle die offenen und erledigten Aufgaben:
    -	Aktualisiere bei jeder Änderung die Anzeige (z. B. "Offene Todos: X").
2.	Erstelle eine glatte Scroll-Funktionalität:
    -	Verwende einen JScrollPane, um eine bessere Benutzererfahrung zu gewährleisten.

