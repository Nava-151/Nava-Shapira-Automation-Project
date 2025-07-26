package enums;
public enum TopMenuEnum {
    M_Z("מיצוי זכויות"),
    K_V("קצבאות והטבות"),
    Y_K("יצירת קשר"),
    D_B("דמי ביטוח");
    private final String selectedMenuItem;

    TopMenuEnum(String selectedMenuItem) {
        this.selectedMenuItem = selectedMenuItem;
    }

    public String getSelectedMenuItem() {
        return selectedMenuItem;
    }
}
