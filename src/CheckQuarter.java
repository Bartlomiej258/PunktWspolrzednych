public class CheckQuarter {

    String getQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0)
            return "I";
        else if (point.getX() < 0 && point.getY() > 0)
            return "II";
        else if (point.getX() < 0 && point.getY() < 0)
            return "III";
        else if (point.getX() > 0 && point.getY() < 0)
            return "IV";
        else
            return null;
    }

}
