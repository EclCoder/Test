package zd;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class i implements wd.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f58819a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f58820b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wd.b f58821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f58822d;

    i(f fVar) {
        this.f58822d = fVar;
    }

    private void a() {
        if (this.f58819a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f58819a = true;
    }

    void b(wd.b bVar, boolean z10) {
        this.f58819a = false;
        this.f58821c = bVar;
        this.f58820b = z10;
    }

    @Override // wd.f
    public wd.f e(String str) throws IOException {
        a();
        this.f58822d.i(this.f58821c, str, this.f58820b);
        return this;
    }

    @Override // wd.f
    public wd.f f(boolean z10) {
        a();
        this.f58822d.o(this.f58821c, z10, this.f58820b);
        return this;
    }
}
