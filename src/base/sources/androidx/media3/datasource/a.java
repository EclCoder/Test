package androidx.media3.datasource;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import t1.g;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface a extends g {

    /* JADX INFO: renamed from: androidx.media3.datasource.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0055a {
        a createDataSource();
    }

    long a(z1.g gVar);

    void c(m mVar);

    void close();

    default Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
