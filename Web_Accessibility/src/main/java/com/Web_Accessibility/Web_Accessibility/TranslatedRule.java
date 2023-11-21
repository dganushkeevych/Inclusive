package com.Web_Accessibility.Web_Accessibility;

import com.deque.html.axecore.results.Rule;

import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;

public class TranslatedRule {

    private String translatedId;
    private String translatedHelp;
    private String translatedImpact;

    public TranslatedRule(Rule r)
    {
        translatedImpact=translateImpact(r.getImpact());
        translatedHelp=translateHelp(r.getId());
        if(translatedHelp==null)translatedHelp=r.getHelp();
        translatedId=r.getId();
    }
    private String translateId(String id)
    {
        return id;
    }
    private String translateHelp(String id)
    {
        return switch (id) {
            //WCAG 2.0 Level A & AA Rules
            case ("area-alt") -> "Переконайтеся, що елементи <area> мап зображень мають альтернативний текст";
            case ("aria-allowed-attr") -> "Переконайтеся, що роль елемента підтримує його атрибути ARIA";
            case ("aria-braille-equivalent") ->
                    "Переконайтеся, що aria-braillelabel і aria-brailleroledescription мають небрайлівський еквівалент";
            case ("aria-command-name") ->
                    "Переконайтеся, що кожна кнопка ARIA, посилання та пункт меню мають доступну назву";
            case ("aria-conditional-attr") ->
                    "Переконайтеся у використанні атрибутів ARIA, як описано в специфікації ролі елемента";
            case ("aria-deprecated-role") -> "Переконайтеся, що елементи не використовують застарілі ролі";
            case ("aria-hidden-body") -> "Переконайтеся у відсутністі aria-hidden=\"true\" у тілі документа.";
            case ("aria-hidden-focus") ->
                    "Переконайтеся, що приховані ARIA елементи не можна фокусувати та вони не містять елементів, які можна фокусувати";
            case ("aria-input-field-name") -> "Переконайтеся, що кожне поле введення ARIA має доступну назву";
            case ("aria-meter-name") -> "Переконайтеся, що кожен вузол вимірювача ARIA має доступне ім’я";
            case ("aria-progressbar-name") -> "Переконайтеся, що кожен вузол прогресу ARIA має доступне ім’я";
            case ("aria-prohibited-attr") -> "Переконайтеся, що атрибути ARIA не заборонені для ролі елемента";
            case ("aria-required-attr") -> "Переконайтеся, що елементи з ролями ARIA мають усі необхідні атрибути ARIA";
            case ("aria-required-children") ->
                    "Переконайтеся, що елементи з роллю ARIA, які потребують дочірніх ролей, містяться в них";
            case ("aria-required-parent") ->
                    "Переконайтеся, що елементи з роллю ARIA, які потребують батьківських ролей, містяться в них";
            case ("aria-roles") -> "Переконайтеся, що всі елементи з атрибутом role використовують дійсне значення";
            case ("aria-toggle-field-name") -> "Переконайтеся, що кожне поле перемикання ARIA має доступну назву";
            case ("aria-tooltip-name") -> "Переконайтеся, що кожен вузол підказки ARIA має доступне ім’я";
            case ("aria-valid-attr-value") -> "Переконайтеся, що всі атрибути ARIA мають дійсні значення";
            case ("aria-valid-attr") ->
                    "Переконується, що атрибути, які починаються з aria-, є дійсними атрибутами ARIA";
            case ("blink") -> "Переконайтеся, що елементи <blink> не використовуються";
            case ("button-name") -> "Переконайтеся, що кнопки мають помітний текст";
            case ("bypass") ->
                    "Переконайтеся, що кожна сторінка має принаймні один механізм, за допомогою якого користувач може обійти навігацію та перейти безпосередньо до вмісту";
            case ("color-contrast") ->
                    "Переконайтеся, що контраст між кольорами переднього плану та фону відповідає мінімальним порогам коефіцієнта контрастності WCAG 2 AA";
            case ("definition-list") -> "Переконайтеся у правильності структури елементів <dl>";
            case ("dlitem") -> "Переконайтеся, що елементи <dt> і <dd> містяться в <dl>";
            case ("document-title") -> "Переконайтеся, що кожен документ HTML містить непорожній елемент <title>";
            case ("duplicate-id-aria") ->
                    "Переконайтеся в унікальності кожного значення атрибута ідентифікатора, що використовується в ARIA та в мітках";
            case ("form-field-multiple-labels") -> "Переконайтеся, що поле форми не має кількох елементів label";
            case ("frame-focusable-content") ->
                    "Переконайтеся, що елементи <frame> і <iframe> із вмістом, який можна сфокусувати, не мають tabindex=-1";
            case ("frame-title-unique") ->
                    "Переконайтеся, що елементи <iframe> і <frame> містять унікальний атрибут title";
            case ("frame-title") -> "Переконайтеся, що елементи <iframe> і <frame> мають доступне ім’я";
            case ("html-has-lang") -> "Переконайтеся, що кожен документ HTML має атрибут lang";
            case ("html-lang-valid") -> "Переконайтеся, що атрибут lang елемента <html> має дійсне значення";
            case ("html-xml-lang-mismatch") ->
                    "Переконайтеся, що елементи HTML з дійсними атрибутами lang і xml:lang узгоджуються з основною мовою сторінки";
            case ("image-alt") ->
                    "Переконайтеся, що елементи <img> мають альтернативний текст або роль \"none\" чи \"presentation\".";
            case ("input-button-name") -> "Переконайтеся, що кнопки введення мають помітний текст";
            case ("input-image-alt") -> "Переконайтеся, що елементи <input type=\"image\"> мають альтернативний текст";
            case ("label") -> "Переконайтеся, що кожен елемент форми має мітку";
            case ("link-in-text-block") ->
                    "Переконайтеся, що посилання виділяються з навколишнього тексту таким чином, щоб не залежати від кольору";
            case ("link-name") -> "Переконайтеся, що посилання мають помітний текст";
            case ("list") -> "Переконайтеся у правильності структури списків";
            case ("listitem") -> "Переконайтеся у семантичності використання елементів <li>";
            case ("marquee") -> "Переконайтеся, що елементи <marquee> не використовуються";
            case ("meta-refresh") ->
                    "Переконайтеся, що <meta http-equiv=\"refresh\"> не використовується для відкладеного оновлення";
            case ("meta-viewport") ->
                    "Переконайтеся, що <meta name=\"viewport\"> не вимикає масштабування та масштабування тексту";
            case ("nested-interactive") ->
                    "Переконайтеся, що інтерактивні елементи керування не є вкладеними, оскільки вони не завжди повідомляються програмами зчитування з екрана або можуть спричинити проблеми з фокусуванням для допоміжних технологій";
            case ("no-autoplay-audio") ->
                    "Переконайтеся, що елементи <video> або <audio> не відтворюють автоматично аудіо більше 3 секунд без механізму керування, щоб зупинити або вимкнути звук";
            case ("object-alt") -> "Переконайтеся, що елементи <object> мають альтернативний текст";
            case ("role-img-alt") -> "Переконайтеся, що елементи [role=\"img\"] мають альтернативний текст";
            case ("scrollable-region-focusable") ->
                    "Переконайтеся, що елементи, вміст яких можна прокручувати, доступні за допомогою клавіатури";
            case ("select-name") -> "Переконайтеся, що вибраний елемент має доступне ім’я";
            case ("server-side-image-map") -> "Переконайтеся, що мапи зображень на стороні сервера не використовуються";
            case ("svg-img-alt") ->
                    "Переконайтеся, що елементи <svg> із роллю img, graphics-document або graphics-symbol мають доступний текст";
            case ("td-headers-attr") ->
                    "Переконайтеся, що кожна клітинка в таблиці, яка використовує атрибут headers, посилається лише на інші клітинки в цій таблиці";
            case ("th-has-data-cells") ->
                    "Переконайтеся, що елементи <th> та елементи з role=columnheader/rowheader мають комірки даних, які вони описують";
            case ("valid-lang") -> "Переконайтеся у дійсності значення атрибутів lang";
            case ("video-caption") -> "Переконайтеся, що елементи <video> мають підписи";
            //WCAG 2.1 Level A & AA Rules
            case ("autocomplete-valid") -> "Переконайтеся, що атрибут автозаповнення правильний і підходить для поля форми";
            case ("avoid-inline-spacing") -> "Переконайтеся, що міжтекстовий інтервал, встановлений за допомогою атрибутів стилю, можна налаштувати за допомогою власних таблиць стилів";
            //WCAG 2.2 Level A & AA Rules
            case ("target-size") -> "Переконайтеся, що область кліку має достатній розмір і місце";
            //Best Practices Rules
            case ("accesskeys") -> "Переконайтеся в унікальності кожного значення атрибута accesskey";
            case ("aria-allowed-role") -> "Переконайтеся, що атрибут role має відповідне значення для кожного елемента";
            case ("aria-dialog-name") -> "Переконайтеся, що кожен вузол діалогового вікна ARIA та діалогового вікна попередження має доступне ім’я";
            case ("aria-text") -> "Переконайтеся у використанні role=\"text\" для елементів без нащадків, які можна сфокусувати";
            case ("aria-treeitem-name") -> "Переконайтеся, що кожен вузол дерева ARIA має доступне ім’я";
            case ("empty-heading") -> "Переконайтеся у чіткості текстів заголовків";
            case ("empty-table-header") -> "Переконайтеся, що заголовки таблиць мають помітний текст";
            case ("frame-tested") -> "Переконайтеся, що елементи <iframe> і <frame> містять сценарій axe-core";
            case ("heading-order") -> "Переконайтеся у семантичній правильності порядку заголовків";
            case ("image-redundant-alt") -> "Переконайтеся, що трибув alt зображення не повторюється як текст";
            case ("label-title-only") -> "Переконайтеся, що кожен елемент форми має видиму мітку, а не лише помічений за допомогою прихованих міток або атрибутів title або aria-describedby";
            case ("landmark-banner-is-top-level") -> "Переконайтеся, що орієнтир банера знаходиться на верхньому шарі сторінки";
            case ("landmark-complementary-is-top-level") -> "Переконайтеся, що додатковий орієнтир знаходяться на верхньому шарі сторінки";
            case ("landmark-contentinfo-is-top-level") -> "Переконайтеся, що орієнтир contentinfo знаходиться на верхньому шарі сторінки";
            case ("landmark-main-is-top-level") -> "Переконайтеся, що головний орієнтир знаходиться на верхньому шарі сторінки";
            case ("landmark-no-duplicate-banner") -> "Переконайтеся, що документ має щонайбільше один банерний орієнтир";
            case ("landmark-no-duplicate-contentinfo") -> "Переконайтеся, що документ має щонайбільше один орієнтир contentinfo";
            case ("landmark-no-duplicate-main") -> "Переконайтеся, що документ має щонайбільше один основний орієнтир";
            case ("landmark-one-main") -> "Переконайтеся, що документ має основний орієнтир";
            case ("landmark-unique") -> "Орієнтири повинні мати унікальну роль або комбінацію роль/мітка/назва (тобто доступна назва).";
            case ("meta-viewport-large") -> "Переконайтеся у можливості значного масштабування <meta name=\"viewport\">";
            case ("page-has-heading-one") -> "Переконайтеся, що сторінка або принаймні один із її фреймів містить заголовок першого рівня";
            case ("presentation-role-conflict") -> "Елементи, позначені як презентаційні не повинні мати глобального ARIA або індексу табуляції, щоб усі програми зчитування з екрана їх ігнорували";
            case ("region") -> "Переконайтеся, що весь вміст сторінки містить орієнтири";
            case ("scope-attr-valid") -> "Переконайтеся у правильності використання атрибута scope в таблицях";
            case ("skip-link") -> "Переконайтеся, що всі пропускаючі посилання мають область кліку, яку можна сфокусувати";
            case ("tabindex") -> "Переконайтеся, що значення атрибута tabindex не перевищують 0";
            case ("table-duplicate-name") -> "Переконайтеся, що елемент <caption> не містить той самий текст, що й атрибут summary";
            //WCAG 2.x level AAA rules
            case ("color-contrast-enhanced") -> "Переконайтеся, що контраст між кольорами переднього плану та фону відповідає пороговим значенням покращеного коефіцієнта контрастності WCAG 2 AAA";
            case ("identical-links-same-purpose") -> "Переконайтеся, що посилання з однаковою доступною назвою служать однаковій меті меті";
            case ("meta-refresh-no-exceptions") -> "Переконайтеся, що <meta http-equiv=\"refresh\"> не використовується для відкладеного оновлення";
            //Experimental Rules
            case ("css-orientation-lock") -> "Переконайтеся, що вміст не прив’язаний до певної орієнтації дисплея";
            case ("focus-order-semantics") -> "Переконайтеся, що елементи в порядку фокусування мають відповідну роль для інтерактивного вмісту";
            case ("hidden-content") -> "Переконайтеся, що користувачі проінформовані про прихований вміст.";
            case ("label-content-name-mismatch") -> "Переконайтеся, що елементи, які помічені через їхній вміст, мають видимий текст як частину їхнього доступного імені";
            case ("p-as-heading") -> "Переконайтеся, що жирний та курсивний текст і розмір шрифту не використовуються для стилізації елементів <p> як заголовка";
            case ("table-fake-caption") -> "Переконайтеся, що таблиці з підписом використовують елемент <caption>.";
            case ("td-has-header") -> "Переконайтеся, що кожна непорожня клітинка даних у <таблиці> розміром більше ніж 3 на 3 має один або кілька заголовків таблиці";
            //Deprecated Rules
            case ("aria-roledescription") -> "Переконайтеся, що aria-roledescription використовується лише для елементів із неявною чи явною роллю";
            case ("audio-caption") -> "Переконайтеся, що елементи <audio> мають підписи";
            case ("duplicate-id-active") -> "Переконайтеся у унікальності кожного значення атрибута ідентифікатора активних елементів";
            case ("duplicate-id") -> "Переконайтеся у унікальності кожного значення атрибута ідентифікатора";
            default -> null;
        };
    }
    private String translateImpact(String impact)
    {
        return switch (impact) {
            case ("critical") -> "Критичний";
            case ("serious") -> "Серйозний";
            case ("minor") -> "Незначний";
            case ("moderate") -> "Помірний";
            default -> impact;
        };
    }
    public String getId() {
        return translatedId;
    }

    public String getHelp() {
        return translatedHelp;
    }

    public String getImpact() {
        return translatedImpact;
    }
}
