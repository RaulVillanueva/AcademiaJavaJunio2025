package Semana02.ClaseInmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Se declara la clase como final
public final class ImmutableExample {

    //Las variables de instancia se declaran como private final
    private final String stringValue;
    private final int intValue;
    private final List<String> stringList;
    private final Date dateValue;

    // Se inicializan las variables de instancia en el constructor
    public ImmutableExample(String stringValue, int intValue, List<String> stringList, Date dateValue) {
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.stringList = new ArrayList<>(stringList); // Se crea una copia profunda para objetos mutables
        this.dateValue = new Date(dateValue.getTime()); // Se crea una copia profunda para objetos mutables
    }

    //Se colocan los métodos get(). Los set() no se colocan
    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    // Se regresa una vista no modificable de la lista
    public List<String> getStringList() {
        return Collections.unmodifiableList(stringList);
    }

    // Se regresa una copia profunda de la fecha
    public Date getDateValue() {
        return new Date(dateValue.getTime());
    }
}