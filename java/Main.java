public class Main {
    public static void main(String[] args){

        Apps apps = new Apps("Genshin Impact","Hiburan");
        apps.thisApps();
        apps.showApps();

        System.out.println(" ");

        Game game = new Game("Honkai Impact", "Aksi", "Action MMORPG");
        game.thisGame();
        game.gameApps();

        System.out.println(" ");

        Platform platform = new Platform("GGZ", "Strategi", "Petualangan Open World", "Mobile");
        platform.thisPlatform();
        platform.platformApps();

        System.out.println(" ");

        platform.gameApps();
    }
}
