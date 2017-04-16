package Class.ModellVasut;

/**
 * Created by rolac on 2017. 04. 15..
 */
public class SzenesKocsi extends Kocsi {




    @Override
    protected void setLeszállhat(boolean leszállhat) {
        this.leszállhat = leszállhat;
        if (következő != null) {
            következő.setLeszállhat(leszállhat);
        }
    }


    /**
     * Hozzáköti a szeneskocsihoz a megadott kocsit, ez fog utána következni.
     * Beállítja a kocsinak a leszállhat jogosultságát a szeneskocsi leszállhat
     * jogosultságára.
     *
     * @param következő a kocsi, ami a szeneskocsihoz lesz kötve.
     */
    @Override
    public void setKövetkező(Kocsi következő) {
        this.következő = következő;
        következő.setLeszállhat(leszállhat);
    }
}
