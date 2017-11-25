// Basic toast
Context context = getApplicationContext();
String message = "Search clicked";
Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

// Gracity
toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

// Toasts can be customized from views
