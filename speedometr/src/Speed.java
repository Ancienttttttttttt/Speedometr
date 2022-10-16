import java.util.Random;

public class Speed extends Thread {
    int avgSP;
    Random random = new Random();

    public void run (int km) throws InterruptedException {
        int p = 0, t = 0, time;
        float sp = 1, r;

        for (int dist = km * 10; dist > 0; dist -= r) {
            sp += random.nextInt(10);

            while (sp > 50) {
                sp -= 1;
            }
            p += sp;
            t++;
            avgSP = p / t;

            r = (float) (sp * 0.14);
            time = (int) (dist / (sp * 0.14));

            System.out.println("Скорость: " + sp + " км/ч");
            System.out.println("Средняя скорость: " + avgSP + " км/ч");
            System.out.println("Осталось: " + dist / 10 + " км");
            System.out.println("Время прибытия: " + time + " сек");
            System.out.println(t);
            System.out.println();

            Thread.sleep(10);

        }
    }

}
