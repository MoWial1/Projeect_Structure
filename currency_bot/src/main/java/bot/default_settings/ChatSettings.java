package bot.default_settings;

import banks.banks_dependecies.Bank;
import lombok.Data;

public class ChatSettings {
    // Тут зрозуміло
    private long chatID;

    // кількість знаків після коми, або якось по іншому
    private int roundDigit;

    // вибираємо банк
    private Bank bank;

    // Година, о котрій буде оповіщення, або якось по іншому
    private int reminderTime;

    // У кнопки получити інформацію, якщо ChatSettings == null
    // то отримати дефолтні настройки
    public static ChatSettings getDefaultSettings(long chatID)
    {
        // TODO:
        throw new IllegalArgumentException();
    }
}
