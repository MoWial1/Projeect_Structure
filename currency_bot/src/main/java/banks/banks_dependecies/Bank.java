package banks.banks_dependecies;

import java.util.List;

public abstract class Bank {
    public String name;
    public abstract List<StructureExchange> getExchangeList();
}
