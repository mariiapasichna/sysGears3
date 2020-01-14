package com.mariiapasichna;

public class Main {

    /*
    Задача:
Вы участвуете в рыцарском поединке по стрельбе из лука. Поединок начинается с того, что оба соперника располагаются на
расстоянии двадцати шагов друг от друга, и каждому дается только одна стрела и, соответственно, только один шанс на
выстрел. В течение поединка соперники ходят по очереди, каждый ход участник может либо сделать шаг вперед, либо
произвести выстрел. Чем ближе находятся соперники друг к другу, тем выше шанс попадания. При этом шанс попадания
увеличивается линейно, начиная с определенного значения в начале поединка до 100% при полном сближении.
Сложность состоит в том, что если вы сделаете выстрел и промахнетесь, соперник будет иметь право сделать необходимое
количество шагов, подойти к вам вплотную, и выстрелить с гарантированным попаданием, что обеспечит ему победу.
Создайте алгоритм, который, отталкиваясь от заданных значений шансов попадания для вас и соперника в начале поединка,
будет определять номер шага когда вам нужно произвести выстрел для получения наиболее высоких шансов на победу.
Входящие параметры:
Значения шансов попадания в начале поединка (разные для вас и соперника, и оба в диапазоне от 0.1 до 0.3), а также номер
участника, который ходит первым.
Выходные данные:
Наиболее оптимальный шаг для произведения выстрела (в диапазоне от 1 до 10).
*/

    public static void main(String[] args) {
        Archer archer1 = new Archer(1, 0.1);
        Archer archer2 = new Archer(2, 0.3);

        if (archer1.getPriority() == 1) {
            for (int i = 0; i <= 10; i++) {
                if (archer1.probabilityByStep(i) > archer2.probabilityByStep(i + 1) && archer1.probabilityByStep(i) > 0.5) {
                    System.out.println("The most optimal step for firing a shot: " + i);
                    break;
                } else if (archer1.probabilityByStep(i) > 0.5) {
                    System.out.println("The most optimal step for firing a shot: " + i);
                    break;
                }
            }
        } else {
            for (int i = 0; i <= 10; i++) {
                if (archer2.probabilityByStep(i) > archer1.probabilityByStep(i + 1) && archer2.probabilityByStep(i) > 0.5) {
                    System.out.println("The most optimal step for firing a shot: " + i);
                    break;
                } else if (archer2.probabilityByStep(i) > 0.5) {
                    System.out.println("The most optimal step for firing a shot: " + i);
                    break;
                }
            }
        }
    }
}