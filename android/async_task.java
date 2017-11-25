public class MyAsyncTask extends AsyncTask<URL, Integer, Long> {
  @Override
  protected void onPreExecute() {
    super.onPreExecute();
    // Init UI
  }

  @Override
  protected Long doInBackground(URL...urls) {
    URL url = urls[0];
    // Check validity
    // DO some stuff
    publishProgress(2);
    if(isCancelled()){
      // Stop and return
    }

    return 12.3;
  }

  @Override
  protected void onProgressUpdate(Integer...progress) {
    Integer mProgress = progress[0]);Override
  }

  @Override
  protected void onPostExecute(Long result) {
    // Consume result
  }

  @Override
  protected onCancelled(Long result){
    // Only when cancelled instead of onPostExecute
  }
}
