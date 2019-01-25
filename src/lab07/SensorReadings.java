package lab07;

import java.io.Serializable;

public class SensorReadings implements Serializable {
	public char category; // 't' - temperature, 'w' - wind, 'p' - precipitation
	public float value; // wartość, której jednostka zależy od kategorii

}
