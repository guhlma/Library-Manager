# 📝 Projekt: Buchverwaltungssystem

# 📚 Beschreibung
Entwickle ein System zur Verwaltung einer Sammlung von Büchern für eine Bibliothek. Das System soll grundlegende Operationen wie das Hinzufügen, Entfernen und Suchen von Büchern sowie die Verwaltung von Mitgliedern ermöglichen. Ziel ist es, die Beziehungen zwischen den Klassen sinnvoll zu modellieren und eine strukturierte Lösung in Java zu implementieren.

# Anforderungen und Acceptance-Kriterien
## Klasse Book 📖

- Jedes Buch hat eine eindeutige ISBN, einen Titel, einen Autor, ein Veröffentlichungsdatum und ein Genre.
- Ein Buch kann auch Informationen über den aktuellen Status enthalten, z.B., ob es verfügbar oder ausgeliehen ist.
- ✅ Acceptance-Kriterium: Es ist möglich, Bücher hinzuzufügen, anzuzeigen und den Status eines Buches abzufragen.

## Klasse Member 👤

- Jedes Mitglied der Bibliothek hat eine eindeutige ID, einen Namen und ein Anmeldedatum.
- Mitglieder können Bücher ausleihen und zurückgeben.
- ✅ Acceptance-Kriterium: Es ist möglich, Mitglieder zu erstellen und ihnen Bücher zuzuordnen.

## Klasse Library 🏛️

- Die Bibliothek verwaltet eine Sammlung von Büchern und eine Liste von Mitgliedern.
- Die Bibliothek soll eine Methode zur Suche nach Büchern nach Titel, Autor oder Genre bereitstellen.
- Bücher können nur dann ausgeliehen werden, wenn sie verfügbar sind.
- ✅ Acceptance-Kriterium: Es ist möglich, Bücher nach verschiedenen Kriterien zu durchsuchen und Mitglieder zu verwalten.

## Klasse Loan 🔄

- Für jedes geliehene Buch soll ein Eintrag erstellt werden, der den Zeitraum der Ausleihe und das verantwortliche Mitglied festhält.
- Ein geliehenes Buch wird als "nicht verfügbar" markiert.
- Die Leihdauer kann begrenzt sein (z.B. auf zwei Wochen), und ein Buch sollte nach Ablauf zurückgegeben oder erneut ausgeliehen werden können.
- ✅ Acceptance-Kriterium: Es ist möglich, ein Buch auszuleihen und dessen Rückgabestatus zu überprüfen.

## Funktionen und Methoden ⚙️

- Die Library-Klasse sollte über Methoden verfügen, die das Hinzufügen und Entfernen von Büchern und Mitgliedern ermöglichen.
- Eine Ausleih- und Rückgabefunktionalität für Bücher soll implementiert werden.
- ✅ Acceptance-Kriterium: Es ist möglich, Bücher und Mitglieder in der Bibliothek hinzuzufügen und zu entfernen sowie den Status von Ausleihen zu verwalten.

## Benutzeroberfläche (optional) 💻

- Optional kann eine einfache textbasierte Benutzeroberfläche implementiert werden, um den Nutzern Interaktionen mit dem System zu ermöglichen.
- Die Oberfläche sollte grundlegende Anweisungen und Auswahlmöglichkeiten bieten.
- ✅ Acceptance-Kriterium: Die Benutzeroberfläche ermöglicht es Nutzern, mit dem System zu interagieren, z.B. durch Eingabe von Befehlen für Ausleihe, Rückgabe oder die Suche nach Büchern.