package sg;

import android.content.Context;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    static InputStream a(Context context, Uri uri) {
        try {
            return context.getContentResolver().openInputStream(uri);
        } catch (FileNotFoundException e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            e10.printStackTrace();
            return null;
        }
    }

    static InputStream b(String str) {
        try {
            return new FileInputStream(str);
        } catch (FileNotFoundException e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            e10.printStackTrace();
            return null;
        }
    }

    public static InputStream c(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || "file".equals(scheme)) {
            return b(uri.getPath());
        }
        if ("content".equals(scheme)) {
            return a(context, uri);
        }
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return d(uri);
        }
        return null;
    }

    static InputStream d(Uri uri) {
        try {
            URL url = new URL(uri.toString());
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(false);
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 301 || responseCode == 302 || responseCode == 303) {
                        return d(Uri.parse(httpURLConnection.getHeaderField("Location")));
                    }
                    try {
                        return (InputStream) url.getContent();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        com.google.firebase.crashlytics.a.b().d(e10);
                        return null;
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                    com.google.firebase.crashlytics.a.b().d(e11);
                    return null;
                }
            } catch (IOException e12) {
                e12.printStackTrace();
                com.google.firebase.crashlytics.a.b().d(e12);
                return null;
            }
        } catch (MalformedURLException e13) {
            e13.printStackTrace();
            com.google.firebase.crashlytics.a.b().d(e13);
            return null;
        }
    }
}
