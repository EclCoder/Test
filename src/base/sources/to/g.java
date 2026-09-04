package to;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import zn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f53635a;

    public static f a() {
        if (f53635a == null) {
            synchronized (g.class) {
                if (f53635a == null) {
                    URL resource = g.class.getResource("/mozilla/public-suffix-list.txt");
                    if (resource != null) {
                        try {
                            f53635a = c(resource);
                        } catch (IOException unused) {
                            h.k(g.class);
                            throw null;
                        }
                    } else {
                        f53635a = new f(b.ICANN, Arrays.asList("com"), null);
                    }
                }
            }
        }
        return f53635a;
    }

    private static f b(InputStream inputStream) {
        return new f(new e().a(new InputStreamReader(inputStream, co.b.f10154a)));
    }

    public static f c(URL url) throws IOException {
        ip.a.h(url, "URL");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            return b(inputStreamOpenStream);
        } finally {
            inputStreamOpenStream.close();
        }
    }
}
