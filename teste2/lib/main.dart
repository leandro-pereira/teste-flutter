import 'package:flutter/material.dart';
import 'dart:async';

import 'package:flutter/services.dart';
import 'package:casilds/casilds.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String _platformVersion = 'Unknown';
  late StreamSubscription streamSubscription;
  @override
  void initState() {
    super.initState();
    initPlatformState();
    streamSubscription = Casilds().androidBatteryInfoStream().listen((a) {
      print("aaaaahhsd $a");
    }, onError: (e) => print("errou $e"), onDone: () => print("cabou"));
    //   streamSubscription = Casilds().a.stream.listen((valor) {
    //     print('Valor do controlador: $valor');
    //   }, (e) => print("teste do erro $e"));
  }

  // Platform messages are asynchronous, so we initialize in an async method.
  Future<void> initPlatformState() async {
    String platformVersion;
    // Platform messages may fail, so we use a try/catch PlatformException.
    // We also handle the message potentially returning null.
    try {
      platformVersion =
          await Casilds().platformVersion() ?? 'Unknown platform version';
    } on PlatformException {
      platformVersion = 'Failed to get platform version.';
    }

    print(await Casilds().getBatteryLevel());

    // If the widget was removed from the tree while the asynchronous platform
    // message was in flight, we want to discard the reply rather than calling
    // setState to update our non-existent appearance.
    if (!mounted) return;

    setState(() {
      _platformVersion = platformVersion;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Plugin example app'),
        ),
        body: Center(
          child: Column(
            children: [
              Text('Running on: $_platformVersion\n'),
              Text('bateria: $_platformVersion\n'),
            ],
          ),
        ),
      ),
    );
  }
}
