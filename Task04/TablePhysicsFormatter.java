import java.util.List;

public class TablePhysicsFormatter implements PhysicsFormatter {
    private int width;
    private int decimalPl;

    public TablePhysicsFormatter(int decimalPl,int width) {
        this.width = width;
        this.decimalPl = decimalPl;
    }

    private int InstallSpacing(){
        if (width<=20){
            return width/2;
        } else if (width>100) {
            return width/5;
        } else {
            return width/4;
        }
    }

    @Override
    public String format(double number) {
        return "";
    }

    @Override
    public String forceFormat(double result) {
        return null;
    }

    public void outTableFormat(double x,double y,double x1,double y1,double result){
        outHeaderFormat();
        outBodyFormat(x,y,x1,y1,result);
    }

    public void outTableFormatForce(double mass1,double mass2,double distance,double result){
        outHeaderFormatForce();
        outBodyFormatForce(mass1,mass2,distance,result);
    }

    private void outHeaderFormat() {
        int space = InstallSpacing();
        System.out.printf("%s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s",
                "|","x1","|","y1","|","x2","|","y2","|"," Result","|\n");
    }


    private void outBodyFormat(double x,double y,double x1,double y1,double result){
        int space = InstallSpacing();
        System.out.printf("%s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s",
                "| ",x,"| ",y,"| ",x1,"| ",y1,"| ",result,"|\n");
    }

    private void outHeaderFormatForce(){
        int space = InstallSpacing();
        System.out.printf("%s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s"+"%"+space+"s",
                "|"," Mass1","|"," Mass2","|"," Distance","|"," Result","|\n");
    }

    private void  outBodyFormatForce(double mass1,double mass2,double distance,double result){
        int space = InstallSpacing();
        System.out.printf("%s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"f"+"%"+space+"s"+"%"+space+"."+decimalPl+"e"+"%"+space+"s",
                "| ",mass1,"| ",mass2,"| ",distance,"| ",result,"|\n");
    }

}