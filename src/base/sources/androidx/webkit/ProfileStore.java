package androidx.webkit;

import java.util.List;
import x4.b;
import y4.i;
import y4.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (o.f57386c0.d()) {
            return i.getInstance();
        }
        throw o.a();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
