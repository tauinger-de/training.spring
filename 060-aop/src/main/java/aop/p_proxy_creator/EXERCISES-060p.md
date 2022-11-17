# Übungen

## neue Beans

Fügen Sie dem Kontext zwei neue Bean Instanzen folgenden Typs hinzu:

- `LocalDate`
- `ZonedDateTime`

## Profiling der toString() Methode

Definieren Sie einen neuen Pointcut-Advisor, der dafür sorgt, dass nur die `toString()`
Methoden dieser beiden Beans profiliert werden.

Zeigen Sie, dass der Aufruf anderer Methoden dieser Beans -- oder der `toString()`
anderer Beans -- nicht den Profiling-Aspect triggert.