import 'package:flutter/services.dart';

class Calculator {
  final calculatorChannel = MethodChannel('calculator');

  Future<int> increment(int value) async {
    int? result = await calculatorChannel.invokeMethod<int>('increment', value);
    return result!;
  }
}
