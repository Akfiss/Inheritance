public class Platform extends Game {
    String special;

    Platform(String appName, String category, String type, String special){
        super(appName, category, type);
        this.special = special;
    }

    public void thisPlatform(){
        System.out.println("Ini adalah Sub Class dari | Super Class Game | bernama Platform");
    }

    public void platformApps(){
        super.gameApps();
        System.out.println("Special: " + this.special);
    }
}
