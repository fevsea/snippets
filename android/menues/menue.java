@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()){
          case R.id.action_refresh:
              loadWeatherData();
              break;
          default:
              super.onOptionsItemSelected(item);
      }
      return true;
  }
