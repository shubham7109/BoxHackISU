//Created By Jacob Brown on 2/24/2017
//This code is to run a puzzle using potentiometers

#include <FileIO.h>
#include <stdio.h>
#include <math.h>
#include <Keypad.h>
#include <stdio.h>


char keys [4][4] = {
          {'1','2','3','A'},
          {'4','5','6','B'},
          {'7','8','9','C'},
          {'*','0','#','D'}
  };
byte rowPins[4] = {3,4,5,6};
byte colPins[4] = {7,8,9,10};
Keypad keypad = Keypad (makeKeymap(keys), rowPins, colPins, 4, 4);

void setup() {
int led_R = A0;   //variable assignments
int led_G = A1;
int led_B = A2;
int power = 11;
int start = 12;
int finish = 13;
int end = 0;
pinMode(led_R, INPUT);    //recieves voltage from Red LED
pinMode(led_G, INPUT);    //recieves voltage from Green LED
pinMode(led_B, INPUT);    //recieves voltage from Blue LED
pinMode(power, OUTPUT);
pinMode(start, OUTPUT);    //recieves a signal to tell when to start
pinMode(finish, OUTPUT);  // outputs a signal to tell when complete
Serial.begin(9600);
FileSystem.begin();
isSolved(false);
}

void loop() {
  
  float voltage_R = 5.0;
  float voltage_G = 0.0;    //starting with a value out of finish constraint
  float voltage_B = 5.0;
  int led_R = A0;   //variable assignments
  int led_G = A1;
  int led_B = A2;
  int power = 11;
  int start = 12;
  int finish = 13;
  int end;
  
 while (digitalRead(finish) == LOW && end < 1) { //to start or not to start??
 
 digitalWrite(power, HIGH);
 
   voltage_R = digitalRead(led_R);
   voltage_G = digitalRead(led_G); //Get the voltage amounts
   voltage_B = digitalRead(led_B);

   if (voltage_G >= 1.0 && voltage_R < 1.0 && voltage_B < 1.0) {
     digitalWrite(finish, HIGH);
     delay(300);
     digitalWrite(power, LOW);
   }
 }
 while (digitalRead(finish) == HIGH) {
 char code[8] = {'8', '7','2','9','0','7','1','9'};
  int i=0;
  while(i<8)
  {
  char key = keypad.getKey();
  
  if (key == code[i]){
    ++i;
      }      
    }
    digitalWrite(finish, LOW);
  
 }
 isSolved(true);
 digitalWrite(start, HIGH);
 delay(1000);
 end = 100; 
}

void isSolved(boolean check)
{
    if (check == true)
    {
        File script = FileSystem.open("checkSolve.txt", FILE_WRITE);
        script.print("1");
    }
}














