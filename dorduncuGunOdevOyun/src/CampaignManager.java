public class CampaignManager implements CampaingService{
    @Override
    public void campaingAdd(Campaing campaing) {
        System.out.println("Eklenen Kapmanya : " + campaing.getCampaingName());
    }

    @Override
    public void campaingUpdate(Campaing campaing) {
        System.out.println("Güncellenen Kapmanya : " + campaing.getCampaingName());
    }

    @Override
    public void campaingDelete(Campaing campaing) {
        System.out.println("Siilinen Kapmanya : " + campaing.getCampaingName());
    }
}
