package lg;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f44505a = new ArrayList();

    public void a(Closeable closeable) {
        this.f44505a.add(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th2 = null;
        for (int i10 = 0; i10 < this.f44505a.size(); i10++) {
            try {
                ((Closeable) this.f44505a.get(i10)).close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    th3.printStackTrace();
                }
            }
        }
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (!(th2 instanceof RuntimeException)) {
                throw ((Error) th2);
            }
            throw ((RuntimeException) th2);
        }
    }
}
