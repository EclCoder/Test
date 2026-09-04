package l1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43742c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f43743d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.o f43744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.o f43745b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        fl.q qVarA = fl.w.a(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        f43743d = new f(qVarA, fl.w.a(fValueOf2, fValueOf2));
    }

    public f(fl.q... mappings) {
        kotlin.jvm.internal.s.h(mappings, "mappings");
        this.f43744a = new androidx.collection.o(mappings.length);
        this.f43745b = new androidx.collection.o(mappings.length);
        int length = mappings.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f43744a.g(((Number) mappings[i10].h()).floatValue());
            this.f43745b.g(((Number) mappings[i10].i()).floatValue());
        }
        j.c(this.f43744a);
        j.c(this.f43745b);
    }

    public final float a(float f10) {
        return j.a(this.f43744a, this.f43745b, f10);
    }

    public final float b(float f10) {
        return j.a(this.f43745b, this.f43744a, f10);
    }
}
