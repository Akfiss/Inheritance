public class Apps {
    String appName, category;

    Apps(String appName, String category){
        this.appName = appName;
        this.category = category;
    }

    public void thisApps(){
        System.out.println("Ini adalah Super Class bernama Apps");
    }

    public void showApps(){
        System.out.println("appName: " + this.appName + "\nCategory: "+ this.category);
    }
}
