def berechneLagerkennzahl():
  anfangsbestand = float(input('Anfangsbestand:'))
  endbestand = float(input('Endbestand:' ))
  zugaenge = float(input( ' Zugänge:'))

  """Verarbeitung """
  wareneinsatz = anfangsbestand + zugaenge - endbestand
  dLagerbestand = ( anfangsbestand + endbestand) / 2
  dLagerdauer = 360 * dLagerbestand / wareneinsatz
  umschlaghaeufigkeit = 360 / dLagerdauer

  """" Ausgabe """
  print( " Umschlaghäufigkeit : " , umschlaghaeufigkeit)
  print( ' Lagerbestand: ', dLagerbestand)
  print( ' Wareneinsatz: ', wareneinsatz)
  print('Lagerdauer: ', dLagerdauer)


berechneLagerkennzahl()  
