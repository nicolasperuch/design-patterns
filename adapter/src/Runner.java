import cable.adapters.HdmiAdapterImplements;
import cable.adapters.VgaAdapterImplements;
import cable.types.Hdmi;
import cable.types.Vga;

public class Runner {

    public static void main(String[] args) {
        HdmiAdapterImplements hdmi = new HdmiAdapterImplements(new Hdmi());
        VgaAdapterImplements vga = new VgaAdapterImplements(new Vga());

        User client = new User(vga);

        client.userAction();
    }
}
