package test.udemy.javacertification;

class Direction{

    enum Side {

        NORTH, SOUTH, EAST, WEST

    }

}



class Test{

    public static void main(String[] args){

        Direction.Side side = Direction.Side.EAST;
        // access EAST Here

    }

}
