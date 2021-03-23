listeneinkaufspreis=40.00
lieferrabatt=0.2
lieferskonto=0.02
frachtkosten=7.00
handlungskostenzuschlagsatz=0.75
gewinnaufschlag=0.1
kundenskonto=0.03
kundenrabatt=0.2

zwischenergebnis=listeneinkaufspreis-(lieferrabatt*listeneinkaufspreis)
zwischenergebnis=zwischenergebnis-(zwischenergebnis*lieferskonto)
zwischenergebnis=zwischenergebnis+(frachtkosten)
zwischenergebnis=zwischenergebnis+(zwischenergebnis*handlungskostenzuschlagsatz)
zwischenergebnis=zwischenergebnis+(zwischenergebnis*gewinnaufschlag)
zwischenergebnis=zwischenergebnis+(zwischenergebnis*kundenrabatt)
zwischenergebnis=zwischenergebnis+(zwischenergebnis*kundenskonto)

listenverkaufspreis=zwischenergebnis

print("listenverkaufspreis : ",round(listenverkaufspreis,2)," Eur")