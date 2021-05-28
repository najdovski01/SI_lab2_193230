# Втора лабораториска вежба по Софтверско инженерство
## Трајче Најдовски, 193230

### 1. Control Flow Graph


![image](https://user-images.githubusercontent.com/79813808/120023357-f4ca8700-bfed-11eb-8f1b-b2630371c0af.png)

### 2. Цикломатска комплексност
Цикломатската комплексност на мојот граф изнесува 4 со броењето на региони. Истото може да се пресмета и со броење на ребра - број на јазли +2.

### 3. Multiple conditions
If(h1<0 || hr>24) <br />
T X <br />
F T <br />
if (min < 0 || min > 59) <br />
T X  
F T  
F F  

else if (hr == 24 && min == 0 && sec == 0) <br />
T T T <br />
T T F <br />
T F X <br />
F X X <br />


 @Test
 
    void multipleCondition() {
    
        RuntimeException ex;
	
        //Hours - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-5, 57, 30))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(28, 2, 31))));
        
	//Minutes - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, -52, 3))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 81, 30))));
        
	//Seconds - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, 109))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, -109))));
        
	//Time - not valid
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 2, 20))));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(26, 10, 55))));

        assertEquals(returnList(36315), SILab2.function(createList(new Time(10, 5, 15))));

    }

###Тест случаи според критериумот -Multiple condition
Овие тестови ги правиме со цел да опфатиме повеќе од еден услов кој е зададен во задачата. Соодветно ги користам методите како assertThrows и assertEquals


