import 'package:flutter/material.dart';

class WelcomeScreen extends StatelessWidget {
  final String username;

  WelcomeScreen(this.username);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Welcome'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              'Welcome, $username!',
              style: TextStyle(fontSize: 24),
            ),
          ],
        ),
      ),
    );
  }
}