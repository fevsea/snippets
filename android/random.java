// Inflate layout (on create)
setContentView(R.layout.activity_main);

// Set visivility of a views
mView.setVisibility(View.INVISIBLE);

// Load JSON
JSONObject data = new JSONObject(json_string);
