import RPi.GPIO as GPIO
import time

GPIO.setmode(GPIO.BOARD)
GPIO.setup(3, GPIO.OUT)
GPIO.setup(5, GPIO.OUT)
GPIO.setup(7, GPIO.OUT)
GPIO.setup(8, GPIO.OUT)

for i in range(3):
	GPIO.output(3, True)
	time.sleep(0.2)
	GPIO.output(5, True)
	time.sleep(0.2)
	GPIO.output(7, True)
	time.sleep(0.2)
	GPIO.output(8, True)
	time.sleep(0.2)

	time.sleep(1)
	GPIO.output(3, False)
	time.sleep(1)
	GPIO.output(5, False)
	time.sleep(1)
	GPIO.output(7, False)
	time.sleep(1)
	GPIO.output(8, False)
	time.sleep(1)	