package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler{
    Character delimiter;
    StringBuilder stringBuilder;
    public StringAssembler(Character delimeter) {
        this.delimiter=delimeter;
        stringBuilder = new StringBuilder();
    }

    public StringAssembler append(String str) {
        stringBuilder.append(str);
        stringBuilder.append(delimiter);
        return this;
    }

    public String assemble() {
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        return stringBuilder.toString();
    }
}
