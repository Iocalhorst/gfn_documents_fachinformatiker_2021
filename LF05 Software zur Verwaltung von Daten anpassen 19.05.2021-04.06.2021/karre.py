alter=int(input("wie alt > "))
jahreskm=int(input("wie weit >"))
garage=input("garage? (leer lassen für nein)")
grundbetrag=int(input("was letzte preis? "))


def rec
if  alter>25 :
	altersaufschlag=grundbetrag*0.4
else :
	altersaufschlag=-grundbetrag*0.1

if jahreskm>15000 :
	kmaufschlag=0.20*grundbetrag
else :
	kmaufschlag=-0.1*grundbetrag

if garage : 
	garagenauschlage=grundbetrag*0.05*-1
else :
	garagenaufschlag=grundbetrag*0.05

summe=grundbetrag+altersaufschlag+kmaufschlag+garagenaufschlag

print("neue preis : ", round(summe,2)," Taler")