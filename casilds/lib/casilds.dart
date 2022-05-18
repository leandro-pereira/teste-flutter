import 'package:casilds/model/android_battery_info.dart';
import 'package:flutter/services.dart';

class Casilds {
  static const MethodChannel _channel =
      const MethodChannel("com.example.casilds/channel");
  static const EventChannel streamChannel =
      EventChannel("com.example.casilds/stream");

  Future<String?> getBatteryLevel() async {
    try {
      return await _channel.invokeMethod('getBatteryLevel');
    } on PlatformException catch (e) {
      print(e.message);
    }
  }

  platformVersion() async {
    try {
      try {
        print("teste oi ${await _channel.invokeMethod('getPlatformVersion')}");
        final String? version =
            await _channel.invokeMethod('getPlatformVersion');
        return version;
      } on PlatformException catch (e) {
        print("object ${e.message}");
      }
    } catch (e) {
      print("asdoiauo $e");
    }
  }

  teste1() {
    print("funcionou algo pelo menos");
  }

  Stream<AndroidBatteryInfo?> androidBatteryInfoStream() {
    print("chegou no stream");
    return streamChannel.receiveBroadcastStream().map((data) {
      print("stream aqui ó $data");
      try {
        final converted = AndroidBatteryInfo.fromJson(Map.from(data));
        return converted;
      } on PlatformException catch (e) {
        print(e.message);
        return null;
      }
    });
  }
}
