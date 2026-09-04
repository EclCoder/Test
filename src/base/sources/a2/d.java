package a2;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    static Uri a(d dVar) {
        String str = dVar.get("exo_redir", (String) null);
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    static long b(d dVar) {
        return dVar.get("exo_len", -1L);
    }

    long get(String str, long j10);

    String get(String str, String str2);
}
