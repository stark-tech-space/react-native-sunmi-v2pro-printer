import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, Button } from 'react-native';
import SunmiV2ProPrinter from 'react-native-sunmi-v2pro-printer';

export default function App() {
  const handlePress = async () => {
    await SunmiV2ProPrinter.labelLocate();
    await SunmiV2ProPrinter.printText('hello');
    await SunmiV2ProPrinter.labelOutput();
  };

  return (
    <View style={styles.container}>
      <Text>Open up App.tsx to start working on your app!</Text>
      <Button title="Press Print" onPress={handlePress} />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
