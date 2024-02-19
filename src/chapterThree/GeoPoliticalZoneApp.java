package chapterThree;


public class GeoPoliticalZoneApp {

    enum GeoPoliticalZone{
        NORTH_CENTRAL, NORTH_EAST, NORTH_WEST, SOUTH_EAST, SOUTH_SOUTH, SOUTH_WEST;

    }

    public static boolean containsIgnoreCase(String[] array, String state) {
        for (String s : array) {
            if (s.equalsIgnoreCase(state)) {
                return true;
            }
        }
        return false;
    }


    public static GeoPoliticalZone getGeoPoliticalZone(String state) {

        String[] northCentralStates = {"Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau", "FCT"};
        String[] northEastStates = {"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"};
        String[] northWestStates = {"Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Zamfara"};
        String[] southEastStates = {"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"};
        String[] southSouthStates = {"Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"};
        String[] southWestStates = {"Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"};

        if (containsIgnoreCase(northCentralStates, state)) {
            return GeoPoliticalZone.NORTH_CENTRAL;
        } else if (containsIgnoreCase(northEastStates,state)) {
            return GeoPoliticalZone.NORTH_EAST;
        } else if (containsIgnoreCase(northWestStates,state)) {
            return GeoPoliticalZone.NORTH_WEST;
        } else if (containsIgnoreCase(southEastStates,state)) {
            return GeoPoliticalZone.SOUTH_EAST;
        } else if (containsIgnoreCase(southSouthStates,state)) {
            return GeoPoliticalZone.SOUTH_SOUTH;
        } else if (containsIgnoreCase(southWestStates,state)) {
            return GeoPoliticalZone.SOUTH_WEST;
        } else {
            return null;
        }
    }
}
