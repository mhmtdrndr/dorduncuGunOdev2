public class PlayerManager implements PlayerService{

    private PlayerCheckService playerCheckService;

    public PlayerManager(PlayerCheckService playerCheckService){
        this.playerCheckService = playerCheckService;
    }

    @Override
    public void playerAdd(Player player) {
        if(playerCheckService.checkIfRealPerson(player)){
            System.out.println("Kullanıcı eklendi. Eklenen Kullanıcı  : " +player.getFirstName() + " " + player.getLastName());
        } else {
            System.out.println("Kullanıcı eklenemedi.");
        }
    }

    @Override
    public void playerUpdate(Player player) {
        if(playerCheckService.checkIfRealPerson(player)){
            System.out.println("Kullanıcı Güncellendi. Güncellenen Kullanıcı  : " +player.getFirstName() + " " + player.getLastName());
        } else {
            System.out.println("Kullanıcı Güncellenemedi.");
        }
    }

    @Override
    public void playerDelete(Player player) {
        if(playerCheckService.checkIfRealPerson(player)){
            System.out.println("Kullanıcı silindi. Silinen Kullanıcı  : " +player.getFirstName() + " " + player.getLastName());
        } else {
            System.out.println("Kullanıcı silinemedi.");
        }
    }
}