# Übung

## Handler erstellen

Schreiben Sie einen `NoOpHandler`, der alle Aufrufe ignoriert und einfach nur eine Meldung ausgibt.

ACHTUNG -- Sie müssen ja irgendeinen Wert in der `invoke()` Methode zurückgeben. In diesem Fall können Sie
einfach ein `return 0;` machen. Eine allgemeingültige Lösung finden Sie im "solution" Branch.

## Handler nutzen

Lassen Sie sich einen Proxy vom `MathService` erstellen, der diesen Handler benutzt.
