package banks.banks_dependecies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StructureExchange {
        public String ccy;
        public String base_ccy;
        public double buy;
        public double sale;
}
