package sealed;
non-sealed interface EquitySecurity extends Instrument{}
non-sealed interface DebtSecurity extends Instrument{}
//class Deal extends Instrument{} /*Compile Time Error: Deal is not allowed in sealed hierarchy*/
public sealed interface Instrument permits EquitySecurity, DebtSecurity{}
