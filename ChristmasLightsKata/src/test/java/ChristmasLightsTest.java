import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tdd.ChristmasLight;
import org.junit.jupiter.api.Test;

class ChristmasLightsTest {
  @Test
  void testLightSetupWithOneBulb() {
    ChristmasLight light = new ChristmasLight(1, 1);
    assertEquals(1, light.bulbsInstalled());
  }

  @Test
  void testLightSetupWithFourBulbs() {
    ChristmasLight light = new ChristmasLight(2, 2);
    assertEquals(4, light.bulbsInstalled());
  }

  @Test
  void testInitialLightIsOffWithFourBulbs() {
    ChristmasLight light = new ChristmasLight(2, 2);
    assertEquals(0, light.getBulb(0, 0).getState());
  }

  @Test
  void testInstructionsWithFourBulbs() {
    ChristmasLight lights = new ChristmasLight(2, 2);
    assertEquals(0, lights.getBulb(0, 0).getState());
    lights.turnOn(0, 0, 1, 1);
    assertTrue(lights.getBulb(0, 0).isOn());
    assertTrue(lights.getBulb(0, 1).isOn());
    assertTrue(lights.getBulb(1, 0).isOn());
    assertTrue(lights.getBulb(1, 1).isOn());
    assertEquals(4, lights.getTotalBrightnessOfBulbs());
    lights.turnOff(0, 0, 0, 0);
    assertTrue(lights.getBulb(0, 0).isOff());
    assertTrue(lights.getBulb(0, 1).isOn());
    assertTrue(lights.getBulb(1, 0).isOn());
    assertTrue(lights.getBulb(1, 1).isOn());
    //    lights.simulate();

    lights.toggle(0, 0, 1, 1);
    assertTrue(lights.getBulb(0, 0).isOn());
    assertTrue(lights.getBulb(0, 1).isOn());
    assertTrue(lights.getBulb(1, 0).isOn());
    assertTrue(lights.getBulb(1, 1).isOn());
    // lights.simulate();
    assertEquals(4, lights.getTotalBrightnessOfBulbs());
  }

  @Test
  void testChristmasLightsInstructions() {
    ChristmasLight lights = new ChristmasLight(1000, 1000);
    lights.turnOn(887, 9, 959, 629);
    lights.turnOn(454, 398, 844, 448);
    lights.turnOff(539, 243, 559, 965);
    lights.turnOff(370, 819, 676, 868);
    lights.turnOff(145, 40, 370, 997);
    lights.turnOff(301, 3, 808, 453);
    lights.turnOn(351, 678, 951, 908);
    lights.toggle(720, 196, 897, 994);
    lights.toggle(831, 394, 904, 860);
    assertEquals(280830, lights.getTotalBrightnessOfBulbs());
  }

  // TODO
  //  - turn off
  //  - turn on
  //  - toggle
  // Implement instruction set with one light
  // Implement same instruction set with 2x2 light

}
