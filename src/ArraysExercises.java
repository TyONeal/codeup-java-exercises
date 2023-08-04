import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        Person[] people = {person1, person2, person3};
        System.out.println(people);


            for(Person person : people) {
                person.getName();
            }
    }

    public static Person[] addPerson(Person[] array, Person person) {
        Person[] newArray = new Person[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = person;
        return newArray;
    }
}
