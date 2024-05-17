import java.util.EnumMap;

public class AnamneseAdulte implements Anamnese{
    enum TypesAdulte{
        HistoireMaladie,
        SuiviMedical};
    EnumMap<TypesAdulte, QL> QuestionTypes = new EnumMap<TypesAdulte, QL>(TypesAdulte.class);
}
