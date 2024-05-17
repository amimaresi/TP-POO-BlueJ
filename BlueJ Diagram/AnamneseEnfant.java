import java.util.EnumMap;

public class AnamneseEnfant implements Anamnese{
    enum TypesEnfant{
        StructureF,
        DynamiqueF,
        AntecedentsF,
        ConditionsNatales,
        DevPsychomoteur,
        DevLangagier,
        CaractereComportement
    };
    EnumMap<TypesEnfant, QL> QuestionTypes = new EnumMap<TypesEnfant, QL>(TypesEnfant.class);
}
