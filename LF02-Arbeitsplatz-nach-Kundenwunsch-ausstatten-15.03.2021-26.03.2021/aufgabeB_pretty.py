listeneinkaufspreis=40.00
lieferrabatt=0.2
lieferskonto=0.02
frachtkosten=7.00
handlungskostenzuschlagsatz=0.75
gewinnaufschlag=0.1
kundenskonto=0.03
kundenrabatt=0.2

print("Listeneinkaufspreis : ",round(listeneinkaufspreis,2)," Eur")
zwischenergebnis=listeneinkaufspreis-(lieferrabatt*listeneinkaufspreis)
print ("abzügl. Lieferrabatt(",round(100*(lieferrabatt),2),"% =", round(listeneinkaufspreis*lieferrabatt)," Eur = ", round(zwischenergebnis,2)," Eur")

lieferskonto_eur=zwischenergebnis*lieferskonto
zwischenergebnis=zwischenergebnis-(zwischenergebnis*lieferskonto)
print("zuzügl. lieferskonto (",round(100*lieferskonto,2),"% =", round(lieferskonto_eur,2)," Eur = ",round(zwischenergebnis,2)," Eur")

zwischenergebnis=zwischenergebnis+(frachtkosten)
print("zuzügl. frachtkosten (" ,round(frachtkosten,2)," Eur) = ",round(zwischenergebnis,2)," Eur")

handlungskostenzuschlag=zwischenergebnis*handlungskostenzuschlagsatz
zwischenergebnis=zwischenergebnis+(zwischenergebnis*handlungskostenzuschlagsatz)
print("zuzügl. handlungskostenzuschlagsatz (",round(100*handlungskostenzuschlagsatz,2),"% = ",round(handlungskostenzuschlag,2)," Eur) = ",round(zwischenergebnis,2)," Eur")

gewinnaufschlag_eur=zwischenergebnis*gewinnaufschlag
zwischenergebnis+=gewinnaufschlag_eur
print("zuzügl. gewinnaufschlag (",round(100*gewinnaufschlag,2),"% = ",round(gewinnaufschlag_eur,2)," Eur) = ",round(zwischenergebnis,2)," Eur")

kundenrabatt_eur=zwischenergebnis*kundenrabatt
zwischenergebnis=zwischenergebnis+(zwischenergebnis*kundenrabatt)
print("abzügl. kundensrabatt (",round(100*kundenrabatt,2),"% = ",round(kundenrabatt_eur,2)," Eur) = ",round(zwischenergebnis,2)," Eur")

kundenskonto_eur=zwischenergebnis*kundenskonto
zwischenergebnis=zwischenergebnis+(zwischenergebnis*kundenskonto)
print("abzügl. kundenskonto (",round(100*kundenskonto,2),"% = ",round(kundenskonto_eur,2)," Eur) = ",round(zwischenergebnis,2)," Eur")

listenverkaufspreis=zwischenergebnis

print("listenverkaufspreis : ",round(listenverkaufspreis,2)," Eur")