package ip;

import co.j;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static void a(j jVar) throws IOException {
        InputStream content;
        if (jVar == null || !jVar.isStreaming() || (content = jVar.getContent()) == null) {
            return;
        }
        content.close();
    }
}
