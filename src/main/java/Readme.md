Урок 5. Тонкости работы

 Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5, отсортированных по убыванию среднего балла.
В решении не использовать циклы! Только StreamAPI
    

class Student { 
    private String name;
    private List<Double> grades;
    private String specialty;
    
    public double getAverageGrade() {...}

}

### Решение (структура-шаблон).

1. Создание класса `Student` с полями `name`, `grades` и `specialty`.
   Класс содержит метод `getAvgGrade()`, который вычисляет средний балл студента.

class Student { ... }

2. Создание списка студентов

List<Student> students = new ArrayList<>();
	
        // заполнение списка студентов
students.add(new Student(...), "..."));

	
3. Использование StreamAPI для выполнения задачи

    List<Student> result = students.stream()
4.     // фильтрация по специальности

        .filter(student -> student.getSpecialty().equals("Computer science"))

       // фильтрация по среднему баллу

        .filter(student -> student.getAvgGrade() > 4.5)

       // сортировка по убыванию среднего балла

        .sorted(Comparator.comparingDouble(Student::getAvgGrade).reversed())

       // ограничение выборки первыми 5 студентами

        .limit(5)

       // сбор результатов в список

        .collect(Collectors.toList());

5. Вывод результатов

for (Student student : result) {

    System.out.println(student.getName() + " - " + student.getAvgGrade());

}

### Описание.
1. `List<Student> result = students.stream()` 
   - создаем поток из списка студентов.

2. `.filter(student -> student.getSpecialty().equals("Информатика"))`
   - фильтруем студентов, оставляя только тех, у которых специальность равна "Информатика".

3. `.filter(student -> student.getAvgGrade() > 4.5)`
   - фильтруем студентов, оставляя только тех, у которых средний балл выше 4.5.

4. `.sorted(Comparator.comparingDouble(Student::getAvgGrade).reversed())`
   - сортируем студентов по убыванию среднего балла.
   - Создаем компаратор, который сравнивает студентов по их среднему баллу, и затем используем метод `reversed()`, чтобы сортировать в обратном порядке.

5. `.limit(5)`
   - ограничиваем выборку первыми 5 студентами.

6. `.collect(Collectors.toList())`
   - собираем отфильтрованных и отсортированных студентов в новый список.

7. `System.out.println("Первые 5 студентов специальности Информатика с средним баллом выше 4.5:");`
   - выводим заголовок для результата.

8. `for (Student student : result) {`
   - итерируемся по каждому студенту в результирующем списке `result`.
   - Для каждого студента выполняется код внутри цикла.
   - В данном случае, мы выводим имя и средний балл каждого студента на экран с помощью
      `System.out.println(student.getName() + " - " + student.getAvgGrade());`.
   - Таким образом, цикл позволяет обработать каждого студента из списка `result` и выполнить необходимые действия для каждого из них.

9. `System.out.println(student.getName() + " - " + student.getAvgGrade());`
   - выводим имя и средний балл каждого студента из результата.

В итоге, данный код найдет первых 5 студентов специальности "Информатика" с средним баллом выше 4.5,
отсортирует их по убыванию среднего балла и выведет их имена и средние баллы на экран.