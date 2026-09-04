package bp;

import co.j;
import co.k;
import co.o;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f9240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9241b = false;

    f(j jVar) {
        this.f9240a = jVar;
    }

    static void a(k kVar) {
        j entity = kVar.getEntity();
        if (entity == null || entity.isRepeatable() || c(entity)) {
            return;
        }
        kVar.setEntity(new f(entity));
    }

    static boolean c(j jVar) {
        return jVar instanceof f;
    }

    static boolean d(o oVar) {
        j entity;
        if (!(oVar instanceof k) || (entity = ((k) oVar).getEntity()) == null) {
            return true;
        }
        if (!c(entity) || ((f) entity).b()) {
            return entity.isRepeatable();
        }
        return true;
    }

    public boolean b() {
        return this.f9241b;
    }

    @Override // co.j
    public InputStream getContent() {
        return this.f9240a.getContent();
    }

    @Override // co.j
    public co.d getContentEncoding() {
        return this.f9240a.getContentEncoding();
    }

    @Override // co.j
    public long getContentLength() {
        return this.f9240a.getContentLength();
    }

    @Override // co.j
    public co.d getContentType() {
        return this.f9240a.getContentType();
    }

    @Override // co.j
    public boolean isChunked() {
        return this.f9240a.isChunked();
    }

    @Override // co.j
    public boolean isRepeatable() {
        return this.f9240a.isRepeatable();
    }

    @Override // co.j
    public boolean isStreaming() {
        return this.f9240a.isStreaming();
    }

    public String toString() {
        return "RequestEntityProxy{" + this.f9240a + '}';
    }

    @Override // co.j
    public void writeTo(OutputStream outputStream) {
        this.f9241b = true;
        this.f9240a.writeTo(outputStream);
    }
}
