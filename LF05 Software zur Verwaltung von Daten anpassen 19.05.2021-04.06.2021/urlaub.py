def berechneUrlaubsanspruch():
    if alter   <18:
       urlaubsanspruch=30
    elif alter <55:
       urlaubsanspruch=26
    else:
         urlaubsanspruch=28


    if behinderung==1:
       urlaubsanspruch=urlaubsanspruch+5
    else:
       urlaubsanspruch=urlaubsanspruch

    if beschäftigungsläner<=10:
        
       urlaubsanspruch=urlaubsanspruch
       
    else:
        
       urlaubsanspruch=urlaubsanspruch+2
       
    return urlaubsanspruch

def main():

    alter = int(input("Alter: "))
    behinderung = int(input("Behinderung 0/nein,1/ja"))
    beschäftigungslänge = int(input("Beschäftigungslänge:"))

    urlaubsanspruch = berechneUrlaubsanspruch(alter, behinderung, beschäftigungslänge)
    print(urlaubsanspruch)    

main()

