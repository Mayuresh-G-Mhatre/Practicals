import hashlib
from pyfingerprint.pyfingerprint 
import PyFingerprint import time
from Adafruit_CharLCD 
import Adafruit_CharLCD

# instantiate lcd and specify pins
lcd = Adafruit_CharLCD(rs=26, en=19, d4=13, d5=6, d6=5, d7=11, cols=16, lines=2)
lcd.clear() 
lcd.message("MSD Gurukul") 
time.sleep(2)

## Search for a finger 
##

## Tries to initialize the sensor 
try:
f = PyFingerprint('/dev/ttyUSB0', 57600, 0xFFFFFFFF, 0x00000000)

if ( f.verifyPassword() == False ):
raise ValueError('The given fingerprint sensor password is wrong!')

except Exception as e:
print('The fingerprint sensor could not be initialized!') 
print('Exception message: ' + str(e))
exit(1)

## Gets some sensor information
print('Currently used templates: ' + str(f.getTemplateCount()) +'/'+ str(f.getStorageCapacity()))

def searchfinger():
## Tries to search the finger and calculate hash try:
print('Waiting for finger...') 
#lcd.clear() 
#lcd.message('Place finger..')

## Wait that finger is read 
while ( f.readImage() == False ):
time.sleep(.5) 
return
#pass

## Converts read image to characteristics and stores it in charbuffer 1 
f.convertImage(0x01)
## Searchs template
result = f.searchTemplate()

positionNumber = result[0] 
accuracyScore = result[1]

if ( positionNumber == -1 ):
print('No match found!') 
lcd.clear()
lcd.message('Access Denied!!') 
time.sleep(2)
return #
exit(0)
else:
lcd.clear()
lcd.message('Access Granted!!') 
time.sleep(2)
print('Found template at position #' + str(positionNumber)) 
print('The accuracy score is: ' + str(accuracyScore))

## OPTIONAL stuff
##

## Loads the found template to charbuffer 1 
f.loadTemplate(positionNumber, 0x01)

## Downloads the characteristics of template loaded in charbuffer 1 characterics = str(f.downloadCharacteristics(0x01)).encode('utf-8')

## Hashes characteristics of template
print('SHA-2 hash of template: ' + hashlib.sha256(characterics).hexdigest())

except Exception as e: 
print('Operation failed!') 
print('Exception message: ' + str(e)) exit(1)

try:
while 1: 
lcd.clear()
lcd.message('Place Finger') 
searchfinger()
except KeyboardInterrupt:
lcd.clear()
lcd.message("Thank You \nVisit Again!!") 
time.sleep(4)
lcd.clear()
exit(2)
