# Übungen

In diesem Modul ist eine einfache Blockchain implementiert.

Es können Transaction registriert und in der Blockchain verewigt werden.

Die Länge des Mining-Prozesses kann über einen Difficulty-Wert kontrolliert werden.

## 1) Kennenlernen

Führen Sie die Anwendung aus und machen Sie sich mit dem Code vertraut.

## 2) Spring

Nutzen Sie Spring, um aus den Kernbestandteilen Beans zu machen und diese von Spring verdrahten lassen.

In dem Zuge können Sie die Hash-Berechnung in eine `HashCalculator` Helferklasse auslagern.

## 3) Transaction API

Erstellen Sie ein neues Interface `TransactionApi` mit folgenden Methoden:

````java
void registerTransaction(Transaction transaction);
        void persistTransactions();
````

## 4) Blockchain Adapter

Erstellen Sie eine neue Klasse `BlockchainAdapter`, welches das `TransactionApi` Interface implementiert und
die Aufrufe an die `Blockchain` Instanz weitergibt.

## 5) Lazy Start

Damit die Anwendung möglichst schnell nach Start Transaktionen empfangen kann, soll die `Blockchain` Instanz
erst instanziiert werden, wenn zum ersten Mal Transaktionen persistiert werden.

## 6) Miner

Eine neue Miner Instanz soll über eine Factory von Spring erzeugt werden.

## 7) Difficulty Property

Legen Sie eine `blockchain.propeties` Datei an. In dieser soll der Wert der Difficulty konfiguriert werden können.