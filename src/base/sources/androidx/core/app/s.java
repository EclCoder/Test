package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.api.client.googleapis.media.MediaHttpDownloader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        return i11 | i10;
    }

    public static PendingIntent b(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }
}
