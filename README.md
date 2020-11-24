# Examen - Generador de placas
## Reglas:
1. Existen 5 regiones Norte, Sur, Este, Oeste y centro
1. Region Norte (Sonora, Chihuahua, Coahuila, Nuevo León y Tamaulipas)
   1. son de 6 caracteres
   1. empiezan con 1
   1. le sigue la abreviatura del estado 
   1. el resto son números aleatorios   
1. Región Oeste  (Sinaloa, Nayarit, Jalisco y Colima)
   1. son de 5 caracteres
   1. empiezan con 2
   1. terminan con la abreviatura del estado
   1. el resto son números aleatorios   
1. Región Este (Veracruz, Tabasco, Campeche, Yucatán y Quintana Roo)
   1. son de 4 caracteres
   1. empiezan con 3 
   1. terminan con Z
   1. el resto son números aleatorios  
1. Región Sur (Michoacán, Guerrero, Oaxaca, Chiapas)
   1. son de 7 caracteres
   1. empiezan con 4
   1. en alguna parte contienen la abreviatura del estado  
1. Región centro
   1. Son de 8 caracteres
   1. empiezan con 5
   1. el resto son solo números aleatorios  
1. Se pueden generar hasta 5 placas por región
1. Al generar más de 5 placas para una región se lanza una excepción con el mensaje "No hay más placas disponibles"
1. Se utilizan abreviaturas de 3 dígitos (ISO 3166-2) para referirse a los estados