package pj;

import kotlin.jvm.internal.s;
import oj.e;
import oj.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50152g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String name, int i10, int i11, int i12, e basicHeader) {
        super(basicHeader);
        s.h(name, "name");
        s.h(basicHeader, "basicHeader");
        this.f50148c = name;
        this.f50149d = i10;
        this.f50150e = i11;
        this.f50151f = i12;
        b().h(this.f50152g);
        b().k(i11);
        b().i(i12);
    }

    @Override // oj.i
    public int c() {
        return this.f50152g;
    }

    protected final int k() {
        return this.f50152g;
    }

    public abstract String l();

    public final int m() {
        return this.f50149d;
    }

    public abstract String n();

    public final String o() {
        return this.f50148c;
    }

    public abstract int p();

    protected final void q(int i10) {
        this.f50152g = i10;
    }

    public final void r(int i10) {
        this.f50149d = i10;
    }

    public final void s(String str) {
        s.h(str, "<set-?>");
        this.f50148c = str;
    }
}
