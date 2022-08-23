package com.tomtom.online.sdk.displaymap;

// Add here the TomtomMap import
import com.tomtom.online.sdk.map.TomtomMap;
// Add here the OnMapReadyCallback import
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// Add here the NonNull import



public class MainActivity extends AppCompatActivity
// Implement here the MainActivity with OnMapReadyCallback
{
  // Add here the TomtomMap member
  private TomtomMap tomtomMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  // Add here the onMapReady callback
}
