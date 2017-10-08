package cable.adapters;

import cable.Cable;
import cable.types.Hdmi;

public class HdmiAdapterImplements implements Cable {

    private Hdmi hdmi;

    public HdmiAdapterImplements(Hdmi hdmi){
        this.hdmi = hdmi;
    }

    @Override
    public void connect() {
        this.hdmi.connectHDMI();
    }
}
