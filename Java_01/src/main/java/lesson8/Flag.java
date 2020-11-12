package lesson8;

class Flag {

    private Matrix flagMap;
    private int countOfClosedBoxes;

    void start() {
        flagMap = new Matrix(Box.closed);
        countOfClosedBoxes = Ranges.getSize().x * Ranges.getSize().y;

    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }


    public void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.opened);
        countOfClosedBoxes--;
    }

    public void setFlagToBox(Coord coord) {
        flagMap.set(coord, Box.flaged);
    }

    public void toggleFlagedToBox(Coord coord) {
        switch (flagMap.get(coord)) {
            case flaged:
                setClosedToBox(coord);
                break;
            case closed:
                setFlagToBox(coord);
                break;

        }
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.closed);
    }

    public int getCountOfClosedBoxes() {
        return countOfClosedBoxes;
    }

    public void setBombedToBox(Coord coord) {
        flagMap.set(coord, Box.bombed);

    }

    public void setOpenedToClosedBombBox(Coord coord) {
        if (flagMap.get(coord) == Box.closed)
            flagMap.set(coord, Box.opened);
    }

    public void setNoBombToFlagedSafeBox(Coord coord) {
        if (flagMap.get(coord) == Box.flaged)
            flagMap.set(coord, Box.nobomb);
    }


    int getCountOfFlagedBoxesAround(Coord coord) {
        int count = 0;
        for (Coord around : Ranges.getCoordsAround(coord))
            if (flagMap.get(around) == Box.flaged)
                count++;
        return count;
    }
}
