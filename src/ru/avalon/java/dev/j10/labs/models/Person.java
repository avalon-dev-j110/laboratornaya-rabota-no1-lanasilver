package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    private Passport passport;
    private Address address;

    public Person(Passport passport) {
        this.passport = passport;
    }
    
    public Person(Address address) {
        this.address = address;
    }
    
    public Person (Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }
    

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    
    public String getFullName() {
        if (passport.getFirstName() != null & passport.getLastName() != null & 
                passport.getFathersName() != null) {
            return String.format("%s %s %s", passport.getFirstName(), 
                    passport.getLastName(), passport.getFathersName());
        }
        else if (passport.getFathersName() == null & passport.getMiddleName() != null) {
            return String.format("%s %s. %s", passport.getFirstName(), 
                    passport.getMiddleName().substring(0, 1), passport.getLastName());
        }
        else if (passport.getFathersName() == null & passport.getMiddleName() == null 
                & passport.getFirstName() != null & passport.getLastName() != null) {
            return String.format("%s %s", passport.getFirstName(), passport.getLastName());
        }
        return String.format("%s %s %s %s", passport.getLastName(), passport.getFirstName(), 
                passport.getMiddleName(), passport.getFathersName());
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует == месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        if (address.getResidentialAddress().equals(address.getRegistrationAddress())) {
        return address.getRegistrationAddress();
        } 
    return address.getResidentialAddress();
    }
    
}