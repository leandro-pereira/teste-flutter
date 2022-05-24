import 'package:flutter/gestures.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter/services.dart';

class TesteNativo extends StatefulWidget {
  const TesteNativo({Key? key}) : super(key: key);

  @override
  State<TesteNativo> createState() => _TesteNativoState();
}

class _TesteNativoState extends State<TesteNativo> {
  @override
  Widget build(BuildContext context) {
    // Isso é usado no lado da plataforma para registrar a visualização. const String viewType = '<platform-view-type>' ; // Passa parâmetros para o lado da plataforma. final Map < String , dynamic > creationParams = < String , dynamic >{};
    return AndroidView(
      viewType: 'NativeView',
      layoutDirection: TextDirection.ltr,
      creationParamsCodec: const StandardMessageCodec(),
    );
  }
}
