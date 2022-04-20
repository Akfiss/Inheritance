public class Game extends Apps {
    String type;

    Game(String appName, String category, String type){
        super(appName, category);
        this.type = type;
    }

    public void thisGame(){
        System.out.println("Ini adalah Sub Class dari | Super Class Apps | bernama Game");
    }

    public void gameApps(){
        super.showApps();
        System.out.println("Type: " + this.type);
    }
}