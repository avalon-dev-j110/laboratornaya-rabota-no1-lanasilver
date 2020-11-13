package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport { 
    //1. Объявить атрибуты класса.
    private int PassSeries;//Серия паспорта
    private int PassNumber;//Номер паспорта
    private String FirstName;//Имя 
    private String LastName;//Фамилия
    private String FathersName; //Отчество
    private String MiddleName; //Второе имя
    private String Birthday; //день рождения
    private String IssueDate;//дату выдачи
    private String GovermentIssueAgency;//орган, выдавший документ
    private Address registrationAddress;
    private Address residentialAddress;
    
    
    //3. Создайте все необходимые конструкторы класса.
   
    //
    public Passport (String lastName, String firstName, String fathersName){
        this.LastName = lastName;
        this.FirstName = firstName;
        this.FathersName = fathersName;
    }
    //
    public Passport (String firstName, String middleName, String fathersName, String lastName){
        this.FirstName = firstName;
        this.MiddleName = middleName;
        this.FathersName = fathersName;
        this.LastName = lastName;
        
    }
    public Passport (int series, int number) {
        this.PassSeries = series;
        this.PassNumber = number;
    }
    
    public Passport (int series, int number,String FirstName, String LastName, 
            String FathersName, String MiddleName, String Birthday, 
            String IssueDate, String IssueAgency, Address registrationAddress, 
            Address residentialAddress){
        
        this(series, number);
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.FathersName = FathersName;
        this.MiddleName = MiddleName; 
        this.Birthday = Birthday;
        this.IssueDate = IssueDate;
        this.GovermentIssueAgency = IssueAgency;
        this.registrationAddress = registrationAddress;
        this.residentialAddress = residentialAddress;
    }
    
    /*2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?*/
    
    //get PassNumber - может одной цифрой и то и другое?
    public int getPassSeries() {
        return PassSeries;
    }

    /*public void setPassSeries(int PassSeries) {
        this.PassSeries = PassSeries;
    }*/
    
    public int getPassNumber() {
        return PassNumber;
    }

    /*public void setPassNumber(int PassNumber) {
        this.PassNumber = PassNumber;
    }*/
    
    public String getFirstName() {
        return FirstName;
    }
    /*
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }*/
    
    public String getLastName() {
        return LastName;
    }

    /*public void setLastName(String LastName) {
        this.LastName = LastName;
    }*/
    
    public String getFathersName() {
        return FathersName;
    }

    /*public void setFathersName(String FathersName) {
        this.FathersName = FathersName;
    }*/
    
    public String getMiddleName() {
        return MiddleName;
    }

    /*public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }*/
    
    public String getBirthday() {
        return Birthday;
    }

    /*public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }*/
    
    public String getIssueDate() {
        return IssueDate;
    }

    /*public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }*/
    
    public String getGovermentIssueAgency() {
        return GovermentIssueAgency;
    }

    /*public void setGovermentIssueAgency(String GovermentIssueAgency) {
        this.GovermentIssueAgency = GovermentIssueAgency;
    }*/
    
    public Address getRegistrationAddress() {
        return registrationAddress;
    }
    
    

    /*public void setRegistrationAddress(Address registrationAddress) {
        this.registrationAddress = registrationAddress;
    }*/
    
    public Address getResidentialAddress() {
        return residentialAddress;
    }

    /*public void setResidentialAddress(Address residentialAddress) {
        this.residentialAddress = residentialAddress;
    }*/

    /*
     * TODO(Студент): Закончить определение класса. 
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета => Public, в любом месте программы можем получить доступ
     *    к данному классу
     */  
   
}