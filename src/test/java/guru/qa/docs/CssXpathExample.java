package guru.qa.docs;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExample {
    void cssXpathExamples() {
        // <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="email">
        $("[data-testid=email]"); // в конце при необходимости добавить .click()
        $(by("data-testid", "email")); // или так

        // <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("#email"); // или так
        $(byId("email"));  // это для селенида
        $(By.id("email")); // это селениум
        $("[id=email]");
        $("input[id=email]"); // указываем тип элемента
        $("input#email"); // либо так
        $("[id='email gff']"); //Если email содержит пробелы, то эта модель селектора
        $("[id=\"email\"]"); // если имейл в кавычках
        $(by("id", "email]"));

        // Если нужен Xpath
        $x("//*[@id='email']");

        // <input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]");
        $(byName("email"));

        // <input type="email" class="inputtext login_form_input_box">
        $(byClassName("login_form_input_box"));
        // ИЛИ
        $(".login_form_input_box");
        //ИЛИ
        $(".inputtext.login_form_input_box");
        //xPath
        $x("//*[@class='login_form_input_box']");

        // <div>Hello world</div>
        $(byText("Hello world"));
        $(withText("Hello world"));

        // если представим по блокам
        // <div type=”email” class=”inputtext”>
        // <input class=”login_form_input_box”>
        // </div>
        $(".inputtext .login_form_input_box"); //ставим пробел после инпута


    }
}
