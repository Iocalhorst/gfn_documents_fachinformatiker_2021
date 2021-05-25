# funktion mit mehreren zweiseitigen entscheidungen

def berechneBetrag(grundbetrag,alter,kilometer, garage):
    quote=1
    
#Verarbeitung

    if alter>25:
        quote-=0.4
        
    else:
        quote+=0.1

    if kilometer>15000:
        quote-=0.2
                
    else:
        quote+=0.1

    if garage==1:
        quote-=0.05
    else:
        quote+=0.05
    return grundbetrag*quote



def main():
#Eingabe
    
    grundbetrag=int(input("Grundbetrag:"))
    alter=int(input("Alter:"))
    kilometer=int(input("Kilometer:"))
    garage=int(input("Garage:"))
#Verarbeitung
    endergebnis=berechneBetrag(grundbetrag,alter,kilometer, garage)
#Ausgabe
    print(round(endergebnis,2))
    
#Start
main()
        
                    
