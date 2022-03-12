import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        String userName = "user", password = "user123";
        int right = 3, balance = 2000, select, deposit, withdrawal;
        while (right > 0) {

            Scanner data = new Scanner(System.in);

            System.out.print("\nKullanıcı adınız :");
            userName = data.nextLine();
            System.out.print("Parolanız :");
            password = data.nextLine();

            switch (userName) {
                case "user":
                    switch (password) {
                        case "user123":
                            System.out.println("BankPatika'ya hoşgeldin " + userName);
                            do {
                                System.out.println("\n1-Para Yatırma\n" + "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                                System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz : ");
                                select = data.nextInt();

                                switch (select) {
                                    case 1:
                                        System.out.print("\nYatıracağınız para miktarını giriniz :");
                                        deposit = data.nextInt();
                                        balance += deposit;
                                        System.out.println("Para yatırma işleminiz başarı ile gerçekleşmiştir.");
                                        break;
                                    case 2:
                                        System.out.print("\nÇekeceğiniz para miktarını giriniz :");
                                        withdrawal = data.nextInt();
                                        if (withdrawal <= balance && withdrawal > 0) {
                                            balance -= withdrawal;
                                            System.out.println("Güle güle harcayın.");
                                        } else {
                                            System.out.println("\nBakiyeniz bu işlemi yapmak için yetersiz.");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("\nBakiye miktarınız " + balance + " TL'dir.");
                                        break;
                                    case 4:
                                        System.out.println("\nTekrar görüşmek üzere sayın " + userName);
                                        break;
                                }
                            } while (select != 4);
                            break;
                        default:
                            right--;
                            System.out.println("\nHatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                            System.out.println("Kalan hakkınız :" + right);
                            break;
                    }
                    break;
                default:
                    right--;
                    System.out.println("\nHatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız :" + right);
            }
            switch (right) {
                case 0:
                    System.out.println("\nÇok fazla hatalı giriş. Hesap bloke edildi. Bankanızla görüşün");
                    break;
            }
        }
    }
}
