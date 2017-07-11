package com.codifythings.personalassistant;

import javax.sound.sampled.AudioFileFormat;

public interface Constants {

	// Audio Location & Types
	public static String AUDIO_FOLDER = "./audio/";
	//public static String AUDIO_FOLDER = "/home/pi/PROJECT-JARVIS/assistant/audio";
	public static String AUDIO_TYPE_GREETING = "greeting";
	public static String AUDIO_TYPE_CHECKING = "checking";
	public static String AUDIO_TYPE_NOT_UNDERSTOOD = "not-understood";
	public static String AUDIO_TYPE_NOT_FOUND = "not-found";
	public static String AUDIO_TYPE_COMMAND = "command";
	public static String AUDIO_TYPE_ANSWER = "answer";
	public static long AUDIO_RECORD_TIME = 3000; // 3 seconds

	// Audio Format
	public static String AUDIO_FORMAT = "." + AudioFileFormat.Type.WAVE.getExtension();
	public static float AUDIO_FORMAT_SAMPLE_RATE = 16000; // 8000, 11025, 16000, 22050, 44100
	public static int AUDIO_FORMAT_SAMPLE_SIZE_IN_BITS = 16; // 8, 16
	public static int AUDIO_FORMAT_CHANNELS = 1; // 1,2
	public static boolean AUDIO_FORMAT_SIGNED = true; // true, false
	public static boolean AUDIO_FORMAT_BIG_ENDIAN = false; // true, false

	// Watson API Credentials
	public static String SPEECH_TO_TEXT_USERNAME = "0dee9786-ad4a-4365-9fcd-f8232699c31b";
	public static String SPEECH_TO_TEXT_PASSWORD = "ndb7DMhFg5Ji";
	public static String TEXT_TO_SPEECH_USERNAME = "9897c450-0227-4c71-8f20-4c199cd057c4";
	public static String TEXT_TO_SPEECH_PASSWORD = "znCBgq4xzunq";
	public static String NATURAL_LANG_CLASSIFIER_USERNAME = "3a2b288f-79a0-49cd-9b01-bb14b635b387";
	public static String NATURAL_LANG_CLASSIFIER_PASSWORD = "EwK0t6zKPyHe";
	public static String NATURAL_LANG_CLASSIFIER = "359f41x201-nlc-35727";

	// Forecast.io API Key
	public static String FORECAST_IO_API_KEY = "9e7258d739c05acee9df3854245076b9";
	public static String CURRENT_LONGITUDE = "41.881832";
	public static String CURRENT_LATITUDE = "-87.623177";

	// Command Classifications
	public static String CLASSIFICATION_WEATHER = "weather";
	public static String CLASSIFICATION_TRAFFIC = "traffic";
	public static String CLASSIFICATION_UNKNOWN = "unknown";
}
