public class GameSaleManager {
    public void gameSale(Player player, Campaing campaing){
        System.out.println(player.getFirstName() + " " +
                player.getLastName() + " için " +
                campaing.getCampaingName() + " kampanyasından tanımlanmıştır.");
    }
}
