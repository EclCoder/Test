package ld;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f44322c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.j f44323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f44324b;

    public f(pd.j jVar) {
        this.f44323a = jVar;
        this.f44324b = f44322c;
    }

    private File d(String str) {
        return this.f44323a.q(str, "userlog");
    }

    public void a() {
        this.f44324b.d();
    }

    public byte[] b() {
        return this.f44324b.c();
    }

    public String c() {
        return this.f44324b.b();
    }

    public final void e(String str) {
        this.f44324b.a();
        this.f44324b = f44322c;
        if (str == null) {
            return;
        }
        f(d(str), C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    void f(File file, int i10) {
        this.f44324b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f44324b.e(j10, str);
    }

    public f(pd.j jVar, String str) {
        this(jVar);
        e(str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements d {
        private b() {
        }

        @Override // ld.d
        public String b() {
            return null;
        }

        @Override // ld.d
        public byte[] c() {
            return null;
        }

        @Override // ld.d
        public void a() {
        }

        @Override // ld.d
        public void d() {
        }

        @Override // ld.d
        public void e(long j10, String str) {
        }
    }
}
