package test;
class Acting{

    protected String actorName = "John";

}

    class Actor extends Acting{

    public static void main(String[] args) {
        Actor actor = new Actor();
        System.out.println(actor.actorName);
    }

}



