Втора лабораториска вежба по Софтверско Инженерство
Давид Милановски, број на индекс - 171275

Група на код

Ја добив групата на код 6.


Control Flow Graph
![171275](https://github.com/њанн4бе/SI_lab2_171275/blob/master/CFG.png)

Цикломатска комплексност

Цикломатската комплексност на овој код изнесува 7. Истата ја добив со помош на формулата P+1, каде P е бројот на предикатни јазли. Во овој случај P=6, па следува дека цикломатската комплексност е 7.
Предикатни јазли: 3.2, 7, 8, 10,11, 16, 17.

### Тест случаи според критериумот Multiple condtition 

	       @Test
    void multipleConditionsTest() {
        // if (deg >= 0 && deg < 360) 
        assertEquals(false, SILab2.function([Angle(-1,2,6)]); //(False) AND (X)
        assertEquals(false, SILab2.function([Angle(2,361,56)]); //(True) AND (False)
        //if (min < 0 || min > 59)
        assertEquals(true, SILab2.function([Angle(5,-60,57)]); //(True) OR (X)
        assertEquals(true, SILab2.function([Angle(5,61,57)]); //(False) OR (True)
        
        //if (sec < 0 || sec > 59)
        assertEquals(true, SILab2.function([Angle(5,57,-60)]); //(True) OR (X)
        assertEquals(true, SILab2.function([Angle(5,57,61)]); //(False) OR (True)
        //if (min == 0 && sec == 0)
        assertEquals(false, SILab2.function([Angle(-1,2,6)]); //(False) AND (X)
        assertEquals(false, SILab2.function([Angle(2,0,56)]); //(True) AND (False)
        
    }   
### Објаснување на напишаните unit tests
#### Објаснување на тестовите од multipleConditions:
Имаме 4 Multi Conditions:
првиот се состои од 2 дела те. 1 AND логички оператор
 * (False) AND (X)- Ако првиот дел условот не е исполнет ( deg<0), другиот не е битен и не се проверува.
 * (True) AND (False) - Првиот дел е исполнет (дег >=0), вториот не е (deg>=360) 

Вториот се состои од 2 дела и 1 OR логички оператор
 * (True) OR (X) - Првиот услов е задоволен (min < 0), вториот услов не го проверува.
 * (False) OR (True) - Првиот услов не е задоволен(min >=0), но вториот услов е (min>59)
 
Третиот се состои од 2 дела и 1 OR логички оператор
 * (True) OR (X) - Првиот услов е задоволен (sec < 0), вториот услов не го проверува.
 * (False) OR (True) - Првиот услов не е задоволен(sec >=0), но вториот услов е (sec>59)
 
 Четвртиот се состои од 2 дела те. 1 AND логички оператор
 * (False) AND (X)- Ако првиот дел условот не е исполнет ( min!=0), другиот не е битен и не се проверува.
 * (True) AND (False) - Првиот дел е исполнет (min==0), вториот не е (sec!=0) 

 
