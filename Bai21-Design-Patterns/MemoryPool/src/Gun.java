import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;

    public void fireInPool(){
        BulletPool Pool = new BulletPool();
        List<Bullet> pList = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = Pool.newItem();
            p.setPosition(0);
            pList.add(p);
            for(int j=0; j<pList.size();j++){
                Bullet pp = pList.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition()==10) {
                    Pool.freeItems(pp);
                    pList.remove(pp);
                }
            }
            System.out.println();
        }
    }

    public void fire(){
        List<Bullet> pList = new ArrayList<>();
        for(int i = 0; i<bulletCount; i++){
            Bullet p = new Bullet();
            p.setPosition(0);
            pList.add(p);
            for(int j=0; j<pList.size();j++){
                Bullet pp = pList.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition()==10) {
                    pList.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
