package java_lesson_hw_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_star {
    /*Задача *:
Программа на вход получает произвольный текст. В этом тексте может быть номер
документа(один или несколько), емейл и номер телефона. Номер документа в формате:
xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
может содержать не всю информацию, т.е. например, может не содержать номер
телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
формате:
email: teachmeskills@gmail.com
document number: 1423-1512-51
и т.д*/

public static void main (String[] args){
    getPersonalData();
}
public static void getPersonalData(){
    StringBuilder text =new StringBuilder("Вчера мы наконец-то подписали все бумаги по новому договору аренды офиса.\n" +
            "    Основной номер документа 1234-4321-23, резервный — 0987-5678-34, а также дополнительный\n" +
            "    внутренний реестр под номером 3456-7675-98. Эти номера будут использоваться при любых запросах в \n" +
            "    бухгалтерию и отдел сопровождения клиентов.Если у вас возникнут вопросы по условиям договора, оплате\n" +
            "    или срокам, вы можете обратиться к нашему юристу по электронной почте: legal.support@company-example.ru.\n" +
            "    Для общих организационных вопросов предусмотрен контакт отдела администрации:\n" +
            "    office.manager@company-example.ru. Кроме того, вы всегда можете позвонить в наш центральный офис по телефону\n" +
            "    +7(495)123-45-67 или на мобильный номер дежурного специалиста +7(925)654-32-10. Пожалуйста, \n" +
            "    сохраните эти реквизиты — номера документов, емейлы и телефоны — так как они понадобятся для последующей\n" +
            "    регистрации, продления договора и возможных изменений условий сотрудничества.");


    Pattern patternDocument = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
    Matcher documentMtch = patternDocument.matcher(text);
    while(documentMtch.find()){
        System.out.println("document number: "+documentMtch.group());
    }
    Pattern patternEmail = Pattern.compile("\\w+\\.\\w+@\\w+-\\w+\\.\\w{2}");
    Matcher emailMtch = patternEmail.matcher(text);
    while(emailMtch.find()){
        System.out.println("email: "+emailMtch.group());
    }
    Pattern patternPhone = Pattern.compile("\\+\\d+\\(\\d+\\)\\d+-\\d+-\\d+");
    Matcher phoneMtch = patternPhone.matcher(text);
    while(phoneMtch.find()){
        System.out.println("phone number: "+phoneMtch.group());
    }

}

}
