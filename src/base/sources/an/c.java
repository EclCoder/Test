package an;

import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bn.a f483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f484e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f485a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(bn.b it) {
            s.h(it, "it");
            return Boolean.valueOf(it.j());
        }
    }

    public c(b party, long j10, float f10) {
        s.h(party, "party");
        this.f480a = party;
        this.f481b = j10;
        this.f482c = true;
        this.f483d = new bn.e(party.g(), f10, null, 4, null);
        this.f484e = new ArrayList();
    }

    public final long a() {
        return this.f481b;
    }

    public final b b() {
        return this.f480a;
    }

    public final boolean c() {
        if (this.f483d.b() && this.f484e.size() == 0) {
            return true;
        }
        return !this.f482c && this.f484e.size() == 0;
    }

    public final List d(float f10, cn.a drawArea) {
        s.h(drawArea, "drawArea");
        if (this.f482c) {
            this.f484e.addAll(this.f483d.a(f10, this.f480a, drawArea));
        }
        Iterator it = this.f484e.iterator();
        while (it.hasNext()) {
            ((bn.b) it.next()).k(f10, drawArea);
        }
        r.F(this.f484e, a.f485a);
        List list = this.f484e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bn.b) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.v(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(d.a((bn.b) obj2));
        }
        return arrayList2;
    }

    public /* synthetic */ c(b bVar, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? System.currentTimeMillis() : j10, f10);
    }
}
