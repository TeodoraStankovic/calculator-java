##  Izveštaj o statičkoj analizi i metrikama

### LOC (Lines of Code)

| Fajl           | LOC |
|----------------|-----|
| Calculator.java | 124 |
| Start.java      | 22  |
| **Ukupno**      | **146** |

---

###  Statička analiza

**calculator.java – linija 5 –** Globalna promenljiva `finalResult` nije thread-safe i mogla bi izazvati greške u konkurentnim okruženjima.

**calculator.java – linija 10 –** Klasa `Operations` koristi se samo za čuvanje konstanti; može biti zamenjena `enum`-om ili `interface`-om sa konstantama.

**calculator.java – linija 20 –** Metoda `Run()` nije jasno imenovana – bolje bi bilo `calculate()`.

**calculator.java – linija 38 –** Parsiranje operatora je ručno i može se optimizovati.

**calculator.java – linija 55 –** Vraćanje `"ERROR"` kao string nije preporučeno – bolje koristiti Exception za konkretniju grešku.

**calculator.java – linije 66-134 –** Metoda `Calculate()` je preduga i sadrži mnogo dupliranog koda; preporučuje se refaktorisanje.

**calculator.java – linija 82 –** `result +=` je nepotreban – promenljiva se svakako inicijalizuje sa 0.

---

**start.java – linija 9 –** `Scanner` se instancira unutar petlje – bolja praksa je napraviti ga jednom i koristiti unutar petlje.

**start.java – linija 13 –** Poređenje sa `"exit"` može biti fleksibilnije korišćenjem `equalsIgnoreCase()`.

---

 **Preporuka:** Refaktorisati `Calculate()` u više manjih metoda radi čitljivosti i održavanja. Ukloniti globalnu promenljivu `finalResult`. Poboljšati rukovanje greškama i unosom korisnika.

 
