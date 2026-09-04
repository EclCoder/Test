package lg;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends MediaMetadataRetriever implements AutoCloseable {
    @Override // android.media.MediaMetadataRetriever, java.lang.AutoCloseable
    public void close() throws IOException {
        if (Build.VERSION.SDK_INT >= 29) {
            release();
        } else {
            release();
        }
    }
}
