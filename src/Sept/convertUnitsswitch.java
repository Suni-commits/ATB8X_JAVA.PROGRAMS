package Sept;

public class convertUnitsswitch {
    public static void main(String[] args){
        float km= 25.7f;
        float me= (km/1000);
        float FH = 54.5f;
        float Ce= ((FH-32)*5)/9;
        char conv='M';
        switch (conv){

            case 'M' :
                System.out.println("converted kilometers to meters: " + me);
                break;
            case 'C' :

                System.out.println("Temperature converted from  Fahrenheit to Celsius: " + Ce);
                break;
        }

    }
}
