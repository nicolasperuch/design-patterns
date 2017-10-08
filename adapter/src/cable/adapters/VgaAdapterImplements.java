package cable.adapters;

import cable.Cable;
import cable.types.Vga;

public class VgaAdapterImplements implements Cable {

    private Vga vga;

    public VgaAdapterImplements(Vga vga){
        this.vga = vga;
    }

    @Override
    public void connect() {
        this.vga.connectVGA();
    }
}
