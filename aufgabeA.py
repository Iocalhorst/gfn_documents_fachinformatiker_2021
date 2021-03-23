listeneinkaufspreis=30.00
lieferrabatt=0.2
lieferskonto=0.03
frachtkosten=3.00
handlungskostenzuschlagsatz=0.7
gewinnaufschlag=0.08

zwischenergebnis=listeneinkaufspreis-(listeneinkaufspreis*lieferrabatt)
zwischenergebnis=zwischenergebnis-(zwischenergebnis*lieferskonto)
zwischenergebnis=zwischenergebnis+frachtkosten
zwischenergebnis=zwischenergebnis+(zwischenergebnis*handlungskostenzuschlagsatz)
zwischenergebnis=zwischenergebnis+(zwischenergebnis*gewinnaufschlag)
barverkaufspreis=zwischenergebnis

print("Barverkaufspreis ist : ", round(barverkaufspreis,2), "Euro")