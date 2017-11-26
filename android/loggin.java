private static final String TAG = MyActivity.class.getSimpleName();

Log.wtf(TAG, "Wat a Terrible Failure, used in system debug");
Log.e(TAG, "Obvious error. Keep in relase");
Log.w(TAG, "Warning, not a error, but may supose one. Keep in relase");
Log.i(TAG, "Info, like -connectet to internet-. Keep in relase");
Log.d(TAG, "Debug, like a generated url");
Log.v(TAG, "Vervose, very detailed");

// Log.x() admit a Throwable as 3th argument
