package Model;

import javax.persistence.Entity;

/**
 * @change 1110186
 * @author i100905
 */
@Entity
public class IncomeType extends BaseType {

    private String type;

    protected IncomeType() {
    }

    public IncomeType(String type, String description) {
        this.type = type;
        this.description = description;
    }

    /**
     * Comparação de objectos
     *
     * @autor 1110186 & 1110590
     * @param other - Objecto a comparar
     * @return True -> Objectos iguais | False -> Objectos diferentes
     */
    @Override
    public boolean equals(Object other) {

        boolean result = false;
        if (other instanceof IncomeType) {
            IncomeType that = (IncomeType) other;
            result = (this.description.equalsIgnoreCase(that.description)
                    && this.getType().equalsIgnoreCase(that.getType()));
        }

        return result;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.getType() != null ? this.getType().hashCode() : 0);
        hash = 59 * hash + (this.description != null ? this.description.hashCode() : 0);
        return hash;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
}
