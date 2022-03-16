/*
Напишете програма, която:
1. Извежда името ви в конзолата.
2. Сравнява го с име на приятел/ка, като използвате equals(),
equalsIgnoreCase(), compareTo(), резултатите да излизат на отделни редове.
3. Долепя до името ви вашата фамилия, на нов ред.
4. Извежда на нов ред вашата възраст.
5. Извежда името фамилията и годините ви на един ред.
6. Извежда името фамилията и годините на приятелят/ката ви на нов ред.
**/

package homework;


public class ex4 {
    public static void main(String[] args){
        String name = "Elena";
        System.out.println("My name is: ".concat(name));
        String friendsName = "Emilia";
        System.out.println("My friend's name is: ".concat(friendsName));

        System.out.println("Compare two names with compareTo:");
        System.out.println("The result is: " + name.compareTo(friendsName)+"\n");

        System.out.println("Compare two names with equals:");
        System.out.println("The result is: " + name.equals(friendsName)+"\n");

        System.out.println("Compare two names with equalsIgnoreCase:");
        System.out.println("The result is: " + name.equalsIgnoreCase(friendsName)+"\n");


        String mySurname = "Karakasheva";
        System.out.println("My full name is: \n".concat(name).concat("\n").concat(mySurname));

        int age = 19;
        System.out.println("\nMy age is: " + age );

        System.out.println("\nMy full name and age are: \n"+ name+ " " + mySurname +" "+age);

        int friendsAge = 18;
        String friendSurname = "Ivanova";
        System.out.println("\nMy friend's full name and age are: \n"+ friendsName +" "+friendSurname+" "+friendsAge);



    }
}
