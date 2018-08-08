package device_management;

import behaviours.IOutput;
import behaviours.IPluggable;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;
    private ArrayList<IPluggable> pluggables;
    private String dataStream;

    private IOutput outputDevice;

    public Computer(int ram, int hddSize, IOutput outputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.pluggables = new ArrayList<>();
    }

    public ArrayList<IPluggable> getPluggables() {
        return pluggables;
    }

    public void addPluggable(IPluggable pluggable){
        pluggables.add(pluggable);
    }

    public void plugInEverything(){
        for(IPluggable pluggable : pluggables){
            pluggable.plugIn();
        }
    }

    public void unPlugEverything(){
        for(IPluggable pluggable : pluggables){
            pluggable.unplug();
        }
    }

    public void unplugThis(IPluggable toBeUnplugged){
        for(IPluggable pluggable : pluggables){
            if(pluggable == toBeUnplugged){
                pluggable.unplug();
            }
        }
    }

    public void pluginThis(IPluggable toBePlugged){
        for(IPluggable pluggable : pluggables){
            if(pluggable == toBePlugged){
                pluggable.plugIn();
            }
        }
    }

    public int getNumberOfThingsPluggedIn(){
        int total = 0;
        for (IPluggable pluggable : pluggables) {
            if(pluggable.amIPluggedIn()){
                total++;
            }
        }
        return total;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        if(dataStream == null){
            dataStream = "";
        }
        dataStream += data;
        return this.outputDevice.outputData(data);
    }

    public String outputDataStream(IOutput outputDevice){
        return outputDevice.outputData(dataStream);
    }

    public void setOutputDevice(IOutput outputDevice){
        this.outputDevice = outputDevice;
    }
}
