public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(1,"Şahin","Kartal","mehmet@mehmet.com","11223344550");
        PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
        playerManager.playerAdd(player1);

        System.out.println(" - - - - - - - - - - - - - - - - - ");

        Campaing goldCampaing = new Campaing(1, "Gold Paket", "1 Yıl geçerli %25 indirim");
        Campaing silverCampaing = new Campaing(2, "Gümüş Paket", "6 ay geçerli %12 indirim");
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.campaingAdd(goldCampaing);
        campaignManager.campaingAdd(silverCampaing);

        System.out.println(" - - - - - - - - - - - - - - - - - ");

        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.gameSale(player1, goldCampaing);
    }
}
