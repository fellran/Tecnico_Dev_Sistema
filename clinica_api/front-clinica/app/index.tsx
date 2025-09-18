import { Image, StyleSheet, Text, View } from "react-native";

export default function Index() {
  return (
    <View style={styles.container}>
      <Image
        source={require('@/assets/images/vollmedicon.png')}
        style={styles.reactLogo}
      />
      <Text style={styles.text}>VollMed - Uma clínica para todos</Text>
    </View>
  );
}
  const styles = StyleSheet.create(
    {
      container:{
        flex:1,
        justifyContent: "center",
        alignItems:"center",
        backgroundColor:"#FFFFFF"
      },
      text:{
        fontSize:20,
        color:"#000000"
      },
      reactLogo: {
        height: 350,
        width: 200,
        bottom: 0,
        left: 0,
      },
  }
);