/*TODO(Студент): Создайте класс Address.
1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.*/

package ru.avalon.java.dev.j10.labs.commons; 

/*2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.*/

public class Address {
    
/*3. Подумайте над тем, какие переменные должены быть
 *    определены в классе. Предположительно те, которые понадобятся нам в 
    Person (по заданию). => Возвращает адрес, по которому проживает человек.
     * => Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным*/
    

 
 /* 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

    private String registrationAddress;
    private String residentialAddress;
    
    /*public Address (String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }*/
    /*
    public Address (String residentialAddress){
        this.residentialAddress = residentialAddress;
    }*/

    public Address(String residentialAddress, String registrationAddress) {
        this.registrationAddress = registrationAddress;
        this.residentialAddress = residentialAddress;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }
    
    

}