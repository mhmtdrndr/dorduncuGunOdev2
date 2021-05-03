public class PlayerCheckManager implements PlayerCheckService{
    @Override
    public boolean checkIfRealPerson(Player player) {
        if (player.getNationalityId() == null || player.getNationalityId().length() < 11) {
            return false;
        } else {
            return true;
        }
    }
}
