# GifLoader

# Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
		    maven { url 'https://jitpack.io' }
		}
}

# Add the dependency
dependencies {
	        compile 'com.github.meradeveloper:GifLoader:V.1.0.1'
	}

# Initialize Dialog Builder 
CustomAlertDialogBuilder CADB = new CustomAlertDialogBuilder(context,R.style.CustomAlertDialogBuilder);

# Using
    CADB.setTitle(R.string.TITLE_INTERNET)
        .setGifIcon(R.drawable.red_loader) // set Gif image               
        .setIcon(R.drawable.chingles) // or set png/jpeg image 
        .setGifImageHeight(500) // custom height 
        .setMessage(R.string.MSG_INTERNET)
        .setMessageTextColor(R.color.colorPrimaryDark)
        .setMessageTextSize(20) // custom text size
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        // Any task
        }}).show(); // click listener if you want to set button on it 
                

             
