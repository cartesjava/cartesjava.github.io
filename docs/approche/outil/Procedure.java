public class Procedure extends ProcedureDecaler<MonTableau> {

    public static void main(String[] args) {
        NtroClientFx.launch(args);
    }

    protected Class<MonTableau> classeMonTableau() {
        return MonTableau.class;
    }
}
