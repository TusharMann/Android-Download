package com.androiddownloaddemo;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OpenFile extends BroadcastReceiver {
    public OpenFile() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        final String tag = OpenFile.class.getSimpleName();

            String action = intent.getAction();
            if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
                //  *** code for unzipping removed ***
                Toast.makeText(context,"Download Complete",Toast.LENGTH_LONG).show();
            } else if (DownloadManager.ACTION_NOTIFICATION_CLICKED.equals(action)) {
                // Open the download manager
                // BUT HOW???

            }


            throw new UnsupportedOperationException("Not yet implemented");
        }
}
