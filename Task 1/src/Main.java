import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount;          //Жабьи глаза
        int ghoulTearsCount;        //Слезы вурдалака
        int ravenBonesCount;        //Кости ворона
        int dumplingsCount;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите количество  жабьих глаз в наличии: ");
        toadEyesCount = scanner.nextInt();
        System.out.println("Введите количество  слез вурдалака в наличии: ");
        ghoulTearsCount = scanner.nextInt();
        System.out.println("Введите количество  костей ворона в наличии: ");
        ravenBonesCount = scanner.nextInt();
        System.out.println("Введите количество  пельменей в наличии: ");
        dumplingsCount = scanner.nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда

        int sharpVisionElixirCount=0;
        int resilienceElixirCount=0;
        int stealthElixirCount=0;
        int forbiddenElixirCount=0;

        int toadEyesSharpVision=toadEyesCount;
        int ravenBonesSharpVision=ravenBonesCount;
        int ravenBonesResilience = ravenBonesCount;
        int dumplingsResilience = dumplingsCount;
        int ghoulTearsStealth = ghoulTearsCount;
        int dumplingsStealth = dumplingsCount;
        int toadEyesStealth = toadEyesCount;
        int ghoulsTearsForbidden = ghoulTearsCount;
        int dumplingsForbidden = dumplingsCount;
        int toadEyesForbidden = toadEyesCount;
        int ravenBonesForbidden = ravenBonesCount;

        while (toadEyesSharpVision>=3 && ravenBonesSharpVision>=1){
            toadEyesSharpVision = toadEyesSharpVision-3;
            ravenBonesSharpVision--;
            sharpVisionElixirCount++;
        }

        while (ravenBonesResilience>=2 && dumplingsResilience>=4){
            ravenBonesResilience = ravenBonesResilience-2;
            dumplingsResilience = dumplingsResilience-4;
            resilienceElixirCount++;
        }

        while (ghoulTearsStealth>=7 && dumplingsStealth>=1 && toadEyesStealth>=2){
            ghoulTearsStealth = ghoulTearsStealth-7;
            dumplingsStealth--;
            toadEyesStealth = toadEyesStealth-2;
            stealthElixirCount++;
        }

        while (ghoulsTearsForbidden>=5 && dumplingsForbidden>=10
                && toadEyesForbidden>=4 && ravenBonesForbidden>=3){
            ghoulsTearsForbidden = ghoulTearsStealth-5;
            dumplingsForbidden = dumplingsForbidden-10;
            toadEyesForbidden = toadEyesForbidden-4;
            ravenBonesForbidden = ravenBonesForbidden-3;
            forbiddenElixirCount++;
        }

        String message = sharpVisionElixirCount>0 || resilienceElixirCount>0 ||
                stealthElixirCount>0 || forbiddenElixirCount>0 ? "Вы можете изготовить "
                + sharpVisionElixirCount + " единиц эликсира зоркости, " + resilienceElixirCount
                + " единиц эликсира стойкости, " + stealthElixirCount + " единиц эликсира скрытности, "
                + forbiddenElixirCount + " единиц запретного эликсира": "У вас не хватает ресурсов для изготовления эликсиров!";

        System.out.println (message);
    }
}
