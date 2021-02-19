package dwiyanhartono.com.applikasidestinasiwisata.Adapter;

public class Adapter_Array {

    String Header, Role, desc1, desc2, desc3, desc4, desc5, Title1, Title2, Title3, Title4;
    int ResID, ResID2, ResID3, ResID4, ResID5;

    public Adapter_Array(String header,
                         String role,
                         String desc1,
                         String desc2,
                         String desc3,
                         String desc4,
                         String desc5,
                         String title1,
                         String title2,
                         String title3,
                         String title4,
                         int resID,
                         int resID2,
                         int resID3,
                         int resID4,
                         int resID5) {
        Header = header;
        Role = role;
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.desc4 = desc4;
        this.desc5 = desc5;
        Title1 = title1;
        Title2 = title2;
        Title3 = title3;
        Title4 = title4;
        ResID = resID;
        ResID2 = resID2;
        ResID3 = resID3;
        ResID4 = resID4;
        ResID5 = resID5;
    }

    public String getDesc1() {
        return desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public String getDesc4() {
        return desc4;
    }

    public String getDesc5() {
        return desc5;
    }

    public String getTitle1() {
        return Title1;
    }

    public String getTitle2() {
        return Title2;
    }

    public String getTitle3() {
        return Title3;
    }

    public String getTitle4() {
        return Title4;
    }

    public int getResID2() {
        return ResID2;
    }

    public int getResID3() {
        return ResID3;
    }

    public int getResID4() {
        return ResID4;
    }

    public int getResID5() {
        return ResID5;
    }

    public String getHeader() {
        return Header;
    }

    public String getRole() {
        return Role;
    }

    public int getResID() {
        return ResID;
    }

}
