public class Even {
    private String firstName;

    public Even(String firstName) {
        this.firstName=firstName;
    }


    public boolean checkIfEven(){



        if(firstName.length() % 2 ==0){
            return true;
        } else {
           return false;
                    }
    }
}
