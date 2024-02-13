import 'package:flutter/material.dart';

import 'WelcomeScreen.dart';


class SignInForm extends StatefulWidget {
  @override
  _SignInFormState createState() => _SignInFormState();
}

class _SignInFormState extends State<SignInForm> {
  final _usernameController = TextEditingController();
  final _passwordController = TextEditingController();

  void _signIn() {
    String username = _usernameController.text;
    String password = _passwordController.text;

    // Simulate sign-in logic here
    if (username.isNotEmpty && password.isNotEmpty) {
      // Navigate to new screen
      Navigator.push(
        context,
        MaterialPageRoute(builder: (context) => WelcomeScreen(username)),
      );
    } else {
      // Show an alert if username or password is empty
      showDialog(
        context: context,
        builder: (context) => AlertDialog(
          title: Text('Error'),
          content: Text('Please enter username and password.'),
          actions: [
            ElevatedButton(
              onPressed: () => Navigator.of(context).pop(),
              child: Text('OK'),
            ),
          ],
        ),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          TextField(
            controller: _usernameController,
            decoration: InputDecoration(labelText: 'Username'),
          ),
          SizedBox(height: 16),
          TextField(
            controller: _passwordController,
            decoration: InputDecoration(labelText: 'Password'),
            obscureText: true,
          ),
          SizedBox(height: 16),
          ElevatedButton(
            onPressed: _signIn,
            child: Text('Sign In'),
          ),
        ],
      ),
    );
  }
}