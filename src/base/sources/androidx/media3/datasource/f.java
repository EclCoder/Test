package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import z1.g;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4860a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.InterfaceC0055a f4861b = new a.InterfaceC0055a() { // from class: z1.j
        @Override // androidx.media3.datasource.a.InterfaceC0055a
        public final androidx.media3.datasource.a createDataSource() {
            return androidx.media3.datasource.f.d();
        }
    };

    private f() {
    }

    public static /* synthetic */ f d() {
        return new f();
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return null;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
    }

    @Override // androidx.media3.datasource.a
    public void c(m mVar) {
    }
}
