package ji;

import fl.g0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f42556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42560e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f42561r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f42562s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f42564u;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42562s = obj;
            this.f42564u |= Integer.MIN_VALUE;
            return e.this.b(0L, this);
        }
    }

    public e(c bitrateChecker) {
        s.h(bitrateChecker, "bitrateChecker");
        this.f42556a = bitrateChecker;
        this.f42559d = 1.0f;
        this.f42560e = k.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 c(e eVar) {
        eVar.f42556a.d(eVar.f42558c);
        return g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j10, kl.f fVar) {
        a aVar;
        e eVar;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f42564u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f42564u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.f42562s;
        Object objF = ll.b.f();
        int i11 = aVar.f42564u;
        if (i11 == 0) {
            fl.s.b(obj);
            this.f42557b += j10;
            long jA = k.a() - this.f42560e;
            if (jA >= 1000) {
                long j11 = (long) (this.f42557b / (jA / 1000.0f));
                if (this.f42558c == 0) {
                    this.f42558c = j11;
                }
                long j12 = this.f42558c;
                this.f42558c = (long) (j12 + (this.f42559d * (j11 - j12)));
                tl.a aVar2 = new tl.a() { // from class: ji.d
                    @Override // tl.a
                    public final Object invoke() {
                        return e.c(this.f42555a);
                    }
                };
                aVar.f42561r = this;
                aVar.f42564u = 1;
                if (i.j(aVar2, aVar) == objF) {
                    return objF;
                }
                eVar = this;
            }
            return g0.f38750a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eVar = (e) aVar.f42561r;
        fl.s.b(obj);
        eVar.f42560e = k.a();
        eVar.f42557b = 0L;
        return g0.f38750a;
    }

    public final void d() {
        this.f42557b = 0L;
        this.f42558c = 0L;
    }
}
