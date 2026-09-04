package g8;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends f8.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int[] f38967l = com.fasterxml.jackson.core.io.a.f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.io.b f38968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int[] f38969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f38970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected com.fasterxml.jackson.core.j f38971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f38972k;

    public c(com.fasterxml.jackson.core.io.b bVar, int i10, com.fasterxml.jackson.core.h hVar) {
        super(i10, hVar);
        this.f38969h = f38967l;
        this.f38971j = i8.e.f41192h;
        this.f38968g = bVar;
        if (com.fasterxml.jackson.core.c.a.ESCAPE_NON_ASCII.h(i10)) {
            this.f38970i = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        }
        this.f38972k = !com.fasterxml.jackson.core.c.a.QUOTE_FIELD_NAMES.h(i10);
    }

    protected void c1(String str) throws JsonGenerationException {
        c(String.format("Can not %s, expecting field name (context: %s)", str, this.f38339d.g()));
    }

    protected void d1(String str, int i10) throws JsonGenerationException {
        if (i10 == 0) {
            if (this.f38339d.d()) {
                this.f16150a.e(this);
                return;
            } else {
                if (this.f38339d.e()) {
                    this.f16150a.d(this);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            this.f16150a.c(this);
            return;
        }
        if (i10 == 2) {
            this.f16150a.i(this);
            return;
        }
        if (i10 == 3) {
            this.f16150a.b(this);
        } else if (i10 != 5) {
            d();
        } else {
            c1(str);
        }
    }

    public com.fasterxml.jackson.core.c e1(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f38970i = i10;
        return this;
    }

    public com.fasterxml.jackson.core.c f1(com.fasterxml.jackson.core.j jVar) {
        this.f38971j = jVar;
        return this;
    }
}
