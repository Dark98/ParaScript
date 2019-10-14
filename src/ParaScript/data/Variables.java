package ParaScript.data;

import ParaScript.data.variables.Trees;
import ParaScript.data.variables.Zone;
import org.rev317.min.api.wrappers.Tile;
import org.rev317.min.api.wrappers.TilePath;

import java.util.List;

public class Variables {
    public static boolean running = false;
    private static String currentStatus = "none";

    // Login Panel
    private static String username = "";
    private static String password = "";
    // Settings Panel
    public static String skill_to_train = "Woodcutting";

    // Used to walk places
    public static TilePath pathToWalk;

    public static String getStatus() {
        return currentStatus;
    }

    public static void setStatus(String i) {
        currentStatus = i;
    }

    public final static Zone LUMBRIDGE_NORMAL_TREE_ZONE = new Zone(new Tile(3140, 3260), new Tile(3206, 3206));

    // Mining Varrock

    public final static Zone VARROCK_EAST_BANK_ZONE = new Zone(new Tile(3250, 3424), new Tile(3257, 3416));
    public final static Zone VARROCK_EAST_MINE_ZONE = new Zone(new Tile(3278, 3372), new Tile(3295, 3358));

    public final static Tile[] VARROCK_EAST_MINE_PATH_TO_BANK = new Tile[]{
        new Tile(3289, 3373),
        new Tile(3289, 3373),
        new Tile(3290, 3384),
        new Tile(3290, 3395),
        new Tile(3289, 3406),
        new Tile(3281, 3416),
        new Tile(3275, 3425),
        new Tile(3264, 3426),
        new Tile(3253, 3425),
        new Tile(3253, 3420),
    };

    public final static Tile[] VARROCK_EAST_BANK_PATH_TO_MINE = new Tile[] {
        new Tile(3253, 3423),
        new Tile(3253, 3423),
        new Tile(3262, 3427),
        new Tile(3273, 3427),
        new Tile(3280, 3418),
        new Tile(3288, 3408),
        new Tile(3290, 3397),
        new Tile(3290, 3386),
        new Tile(3288, 3375),
        new Tile(3287, 3371),
    };



    public static String getAccountUsername() { return username; }
    public static void setAccountUsername(String i) { username = i; }

    public static String getAccountPassword() { return password; }
    public static void setAccountPassword(String i) { password = i; }
}
