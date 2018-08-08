import behaviours.IOutput;
import behaviours.IPluggable;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor);
        keyboard = new Keyboard(3);
        mouse = new Mouse(MouseType.BALL);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Computer computer = new Computer(8, 512, printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Computer computer = new Computer(8, 512, speaker);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canAddPluggable(){
        computer.addPluggable(keyboard);
        assertEquals(1, computer.getPluggables().size());
    }

    @Test
    public void canPlugInEverything(){
        computer.addPluggable(keyboard);
        computer.addPluggable(mouse);
        computer.plugInEverything();
        assertEquals(2, computer.getNumberOfThingsPluggedIn());
    }

    @Test
    public void plugInOneThing(){
        computer.addPluggable(keyboard);
        computer.addPluggable(mouse);
        computer.pluginThis(keyboard);
        assertEquals(1, computer.getNumberOfThingsPluggedIn());
    }

    @Test
    public void dataStream

}
