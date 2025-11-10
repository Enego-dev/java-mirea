package lab13;

public class Phone {
    public static String formatPhone(String phone){
        if(phone.startsWith("8") && phone.length() == 11)
            return formatRussianPhone(phone);

        var out = "+%s%s-%s-%s";
        var countryCode = phone.substring(1, phone.length() - 10);
        var number = phone.substring(phone.length()-10);
        var code = number.substring(0, 3);
        var threeNumbers = number.substring(3, 6);
        var fourNumbers = number.substring(6);

        return String.format(out, countryCode, code, threeNumbers, fourNumbers);
    }

    public static String formatRussianPhone(String phone){
        var out = "+7%s-%s-%s";
        var number = phone.substring(phone.length()-10);
        var code = number.substring(0, 3);
        var threeNumbers = number.substring(3, 6);
        var fourNumbers = number.substring(6);
        return String.format(out, code, threeNumbers, fourNumbers);
    }
}
