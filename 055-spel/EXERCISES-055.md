# Übungen

## EvaluatingMathService

Implementieren Sie eine neue Klasse `EvaluatingMathService` -- dieser implementiert nicht das `MathService` Interface.

Dafür hat er eine Methode `int calculate(String formula)`, über den beliebige Formeln berechnet werden können.

Implementieren Sie diese Methode mithilfe von SpEL.

## Methodenaufrufe

Erstellen Sie eine Bean vom Typ `core.log.Dumper`. Das `lines` Property befüllen Sie mit einer Liste an
SpEL Ausdrücken.

Dies kann auch Aufrufe an den neuen `EvaluatingMathService` enthalten.

Wie müssen Sie die Bean konfigurieren, sodass auch eine Ausgabe erfolgt?