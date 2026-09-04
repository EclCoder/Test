package d6;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements r5.j {
    @Override // r5.j
    public r5.c b(r5.g gVar) {
        return r5.c.SOURCE;
    }

    @Override // r5.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(t5.c cVar, File file, r5.g gVar) throws Throwable {
        try {
            m6.a.f(((c) cVar.get()).c(), file);
            return true;
        } catch (IOException e10) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            return false;
        }
    }
}
