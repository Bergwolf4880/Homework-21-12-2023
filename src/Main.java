//        Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
//        Person имеет следующие поля: String firstName, String lastName.
//        Вам дан массив из Account. Вам необходимо реализовать метод findAccountsByPerson,
//        который принимает объект Person и выводит на экран все Account принадлежащие данному пользователю.

public class Main {

    public static void main(String[] args) {

        Account client1 = new Account("DE14231231131213112", 4500.0, new Person("Joe", "Bidet"));
        Account client2 = new Account("PL46446536345633453", 2500.0, new Person("Joe", "Bidet"));
        Account client3 = new Account("AT142131213112", 4500.0, new Person("Jorje", "Bush"));
        Account client4 = new Account("FR142299831231131213112", 4500.0, new Person("Michael", "O'Baba"));

        Account[] array = {client1, client2, client3, client4};

        Person searchedName = new Person("Joe", "Bidet");

        findAccountByPerson(array, searchedName);


    }
    public static void findAccountByPerson(Account[] array, Person search) {
        for (Account arr : array) {
            if (arr.getClient().equals(search)) {
                System.out.println(arr);
            }
        }
    }


}